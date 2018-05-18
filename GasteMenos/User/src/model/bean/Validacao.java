package model.bean;

public class Validacao {
   
    private static String senha;
    
    public static void validar(String s){    
        senha = s;
    }
    
    public static String getSenha(){
        return senha;
    }
    
}
