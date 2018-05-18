/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserDAOTest {
    
    String n = "josé";
    String s = "senha123";
    String l = "login123";
    
    User u = new User(n,s,l);
    UserDAO dao = new UserDAO();
    
    String n2 = "joao";
    String s2 = "senha12";
    String l2 = "login12";
    
    User v = new User(n2, s2, l2);
    
    public UserDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testIsVerificar() {
        
    }

    @Test
    public void testCreate() {
        
        if (dao.create(u)){
            System.out.println("Usuário Criado com sucesso!");
        }
        else{
            fail("Erro ao criar o usuário!");
        }
    }

    @Test
    public void testCheckLogin() {
            
        if (dao.checkLogin(l2, s2)){
            System.out.println("O usuário existe");
        }
        else{
            fail("O usuário não existe");
        }
        
    }
    
}
