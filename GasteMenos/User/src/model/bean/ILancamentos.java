package model.bean;

/**
 *
 * @author nascimento
 */
public interface ILancamentos {
    
    public String getTipo();

    public void setTipo(String tipo);

    public int getValor();

    public void setValor(int valor);

    public String getDescricao();

    public void setDescricao(String descricao);

    public String getMes();

    public void setMes(String mes);

    public String getAno();

    public void setAno(String ano);
    
}
