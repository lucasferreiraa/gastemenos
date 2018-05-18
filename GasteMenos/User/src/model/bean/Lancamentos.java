package model.bean;

/**
 *
 * @author nascimento
 */
public class Lancamentos implements ILancamentos{
    
    private String tipo;
    private int valor;
    private String descricao;
    private String mes;
    private String ano;       

    public Lancamentos(String tipo, int valor, String descricao, String mes, String ano){
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.mes = mes;
        this.ano = ano;
    }
    
    @Override
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String getMes() {
        return mes;
    }

    @Override
    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String getAno() {
        return ano;
    }

    @Override
    public void setAno(String ano) {
        this.ano = ano;
    }
       
}
