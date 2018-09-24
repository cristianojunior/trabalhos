/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteBDOO;

import dao.o.PessoaDao;
import dao.r.MunicipioDao;
import dao.r.UfDao;
import entidade.Municipio;
import entidade.Pessoa;
import entidade.Uf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author L
 */
public class TesteBD {
    
    public TesteBD() {
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
   
   /* @Test
    public void inserir(){
        Municipio m = new Municipio();
        m.setNome("Barbalha");
        
        Uf u = new Uf();
        u.setSigla("CE");
        
        Pessoa p = new Pessoa();
        PessoaDao pd= new PessoaDao();
        p.setId(1);
        p.setMunicipio(m);
        p.setNome("Chico");
        
        pd.criar(p); 
    }
    
    @Test
    public void excluir(){
        Municipio m = new Municipio();
        m.setNome("Barbalha");
        
        Uf u = new Uf();
        u.setSigla("CE");
        
        Pessoa p = new Pessoa();
        PessoaDao pd= new PessoaDao();
        p.setId(1);
        p.setMunicipio(m);
        p.setNome("Chico");
        
        pd.criar(p); 
        pd.excluir(p);
    }
    
    @Test
    public void listar(){
        Municipio m = new Municipio();
        m.setNome("Barbalha");
        
        Uf u = new Uf();
        u.setSigla("CE");
        
        Pessoa p = new Pessoa();
        PessoaDao pd= new PessoaDao();
        p.setId(1);
        p.setMunicipio(m);
        p.setNome("Chico");
        
        pd.criar(p); 
       
        pd.ler(p);
        
        pd.ler(1);
        
    }
    
    @Test
    public void listarTudo(){
        
        Municipio m = new Municipio();
        m.setNome("Barbalha");
        
        Uf u = new Uf();
        u.setSigla("CE");
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        PessoaDao pd= new PessoaDao();
        
        pd.excluir(p1);
        p1.setId(1);
        p1.setMunicipio(m);
        p1.setNome("Chico");
        
        p2.setId(2);
        p2.setMunicipio(m);
        p2.setNome("Chico2");
        
        p3.setId(3);
        p3.setMunicipio(m);
        p3.setNome("Chico3");
        
        pd.lerTudo();
    }
     */ 
    @Test
    public void apagaTudo(){
        PessoaDao pd= new PessoaDao();
        pd.deleteAll();
    }
    
  
    /*@Test
    public void inserirUf(){
        Uf u = new Uf();
        u.setSigla("CE");
        u.setNome("Ceara");
        
        UfDao d = new UfDao();
        
        System.out.println(u.getNome() + u.getSigla() + u .getId());
        
        d.criar(u);
        

    }*/
    

}
