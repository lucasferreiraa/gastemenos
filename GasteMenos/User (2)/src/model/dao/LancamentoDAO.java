package model.dao;

import conexao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Lancamentos;
import model.bean.Validacao;

/**
 *
 * @author nascimento
 */
public class LancamentoDAO {

    public boolean create(Lancamentos lan) {

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        
        try {
                stmt = con.prepareStatement("INSERT INTO Lancamentos (tipo, valor, descricao, mes, ano, user) VALUES (?, ?, ?, ?, ?, ?)");

                //System.out.println(Validacao.getSenha());
                stmt.setString(1, lan.getTipo());
                stmt.setInt(2, lan.getValor());
                stmt.setString(3, lan.getDescricao());
                stmt.setString(4, lan.getMes());
                stmt.setString(5, lan.getAno());
                stmt.setString(6, Validacao.getSenha());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");             
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally{
            Connect.closeConnection(con, stmt);
        }
        return true;
    }
    
    public ArrayList<Lancamentos> read(String senha){

        
        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        
        ArrayList<Lancamentos> lan;
        lan = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Lancamentos WHERE user = '"+senha+"'");
            rs = stmt.executeQuery();
                
            while (rs.next()){

                
                String tipo = rs.getString("tipo");
                int valor = rs.getInt("valor");
                String descricao = rs.getString("descricao");
                String mes = rs.getString("mes");
                String ano = rs.getString("ano");
                
                Lancamentos l = new Lancamentos(tipo, valor, descricao, mes, ano);

                lan.add(l);
            }
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            Connect.closeConnection(con, stmt, rs);
        }

        return lan;

    }
    
    public boolean delete(String tipo, int valor, String descricao, String mes, String ano) {

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;

        try {
                stmt = con.prepareStatement("DELETE FROM Lancamentos WHERE tipo = '"+tipo+"' and valor = '"+valor+"' and descricao = '"+descricao+"' and mes = '"+mes+"' and ano = '"+ano+"'");

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }
        finally{
            Connect.closeConnection(con, stmt);
        }
        return true;
    }
    
}
