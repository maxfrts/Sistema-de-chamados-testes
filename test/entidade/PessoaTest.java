/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassiano
 */
public class PessoaTest {
    
    @Test
    public void testGetNome() {
        Pessoa p = new Pessoa();
        p.setNome("Giulia");
        
        Assert.assertEquals("Giulia", p.getNome());
    }
    
    @Test
    public void testGetTelefone() {
        Pessoa p = new Pessoa();
        p.setTelefone(999098745);
        
        Assert.assertEquals(999999999, p.getTelefone());
    }
    
}
