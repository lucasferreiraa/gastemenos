package model.bean;

/**
 *
 * @author nascimento
 */
public interface IUser {
    
    public String getNome();

    public String getSenha();
    
    public String getLogin();
    
    public void setNome(String nome);

    public void setSenha(String senha);

    public void setLogin(String login);

}
