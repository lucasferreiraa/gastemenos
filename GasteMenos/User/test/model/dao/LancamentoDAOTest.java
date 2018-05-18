/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.bean.Lancamentos;
import model.bean.Validacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LancamentoDAOTest {
    
    String t = "Cartão de Crédito";
    int v = 100;
    String d = "Comida";
    String m = "05";
    String a = "2020";
    String u = "UserTEst";
    String s = "123456";
    Lancamentos l = new Lancamentos(t,v,d,m,a);
    LancamentoDAO dao = new LancamentoDAO();
    public LancamentoDAOTest() {
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
    public void testCreate() {
        Validacao.validar(u);
        if (dao.create(l)){
            System.out.println("Lancamento criado!");
        }else{
            fail("Falha ao adicionar lancamento!");
        }
    }
    
}
