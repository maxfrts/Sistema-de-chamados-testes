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
public class RegistroChamadoTest {
    
    @Test
    public void testGetCodigo() {
        RegistroChamado rcCodigo = new RegistroChamado();
        rcCodigo.setCodigo(1);
        
//        Assert.assertEquals(3, rcCodigo.getCodigo());
    }
    
    @Test
    public void testGetHora() {
        RegistroChamado rcHora = new RegistroChamado();
        rcHora.setHora("16:10");
        
        Assert.assertEquals("17h", rcHora.getHora());
    }
    
    @Test
    public void testGetData() {
        RegistroChamado rcData = new RegistroChamado();
        rcData.setData("02/11/2016");
        
        Assert.assertEquals("02/11/2016", rcData.getData());
    }
    
    @Test
    public void testGetAssunto() {
        RegistroChamado rcAssunto = new RegistroChamado();
        rcAssunto.setAssunto("Peculiar");
        
        Assert.assertEquals("Peculiar", rcAssunto.getAssunto());
    }
    
    
}
