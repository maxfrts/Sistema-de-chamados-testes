/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Cassiano
 */
public class EmpresaTest {
    
    @Test
    public void testGetNumeroContrato() {
        Empresa emp = new Empresa();
        
        emp.setNumeroContrato(3456);
        
        Assert.assertEquals(3457, emp.getNumeroContrato());
    }
    
    @Test
    public void testGetNomeEmpresa() {
        Empresa emp = new Empresa();
        emp.setNomeEmpresa("Adidas");
        
        Assert.assertEquals("Adidas", emp.getNomeEmpresa());
    }
}