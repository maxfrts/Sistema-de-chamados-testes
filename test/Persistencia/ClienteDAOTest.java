/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import entidade.Empresa;
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ClienteDAOTest {
    
    @Test
    public void TestClienteDAO() {
        ClienteDAO clDao = new ClienteDAO();
        HashMap<Long, ClienteEmpresa> hashCliente = new HashMap<>();
        assertNotNull(clDao);
    }
    
    @Test
    public void testValidarCPF() {
        HashMap<Long, ClienteEmpresa> hashCliente = new HashMap<>();
        
        ClienteEmpresa ce = new ClienteEmpresa(123, new Empresa(), 5050505050L, "Calebe", 47878787L);
        ce = hashCliente.get(ce.getCpf());
        
        assertNotNull(ce);
    }
    
}
