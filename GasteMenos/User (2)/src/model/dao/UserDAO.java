package model.dao;

import conexao.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.User;

public class UserDAO {

    private boolean verificar = false; 

    public boolean isVerificar() {
        return verificar;
    }
    
    public boolean create(User u) {

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        boolean ver = false;
        
        try {
                stmt = con.prepareStatement("INSERT INTO Usuario (login, senha, nome) VALUES (?, ?, ?)");

                stmt.setString(1, u.getLogin());
                stmt.setString(2, u.getSenha());                
                stmt.setString(3, u.getNome());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                this.verificar = true;
                ver = true;
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }
        finally{
            Connect.closeConnection(con, stmt);
        }
        
        return ver;
        
    }
    
    public boolean checkLogin(String login, String senha){

        Connection con = Connect.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM Usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if (rs.next()){

               check = true; 

            }

        } 
        catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            Connect.closeConnection(con, stmt, rs);
        }

        return check;

    }
    
}
