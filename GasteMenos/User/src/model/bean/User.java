package model.bean;

public class User implements IUser {

    private String nome;
    private String senha;
    private String login;
    
    public User(String nome, String senha, String login){
        this.nome = nome;
        this.senha = senha;
        this.login = login;
    }
    
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }
        
}

