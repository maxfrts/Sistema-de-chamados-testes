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
public class ClienteEmpresaTest {

    public ClienteEmpresaTest() {
    }

//    @Test
//    public void testGetCodigo() {
//        ClienteEmpresa ce = new ClienteEmpresa();
//
//        ce.setCodigo(432);
//
//        Assert.assertEquals(432, ce.getCodigo());
//    }

    @Test
    public void testGetCpf() {
        ClienteEmpresa ce = new ClienteEmpresa();

        ce.setCpf(567865654);

        Assert.assertEquals(999999999, ce.getCpf());
    }

}
