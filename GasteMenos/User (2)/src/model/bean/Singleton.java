package model.bean;

/**
 *
 * @author nascimento
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private static String senha;

    private Singleton(String s) {
        senha = s;
    }

    public static synchronized Singleton getInstance(String s) {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton(s);

        return uniqueInstance;
    }
    
}
