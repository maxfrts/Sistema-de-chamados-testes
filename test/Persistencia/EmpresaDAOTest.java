/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.Collection;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31553524
 */
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
    }
    
     @Test
    public void TestEmpresaDAO() {
   
        EmpresaDAO emp = new EmpresaDAO();
        HashMap<Long, Empresa> hashEmpresa = new HashMap<>();
         assertNotNull(emp);
    }


    
}
