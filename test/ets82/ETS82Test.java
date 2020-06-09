/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ets82;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YENIFER LOPEZ
 */
public class ETS82Test {
    
    public ETS82Test() {
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

    /**
     * Test of esPrimo method, of class ETS82.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        int numero = 10501;
        boolean expResult = true;
        boolean result = ETS82.esPrimo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of darLaVuelta method, of class ETS82.
     */
    @Test
    public void testDarLaVuelta() {
        System.out.println("darLaVuelta");
        int numero = 0;
        int expResult = 0;
        int result = ETS82.darLaVuelta(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esCapicua method, of class ETS82.
     */
    @Test
    public void testEsCapicua() {
        System.out.println("esCapicua");
        int numero = 0;
        boolean expResult = true;
        boolean result = ETS82.esCapicua(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esPrimoYCapicua method, of class ETS82.
     */
    @Test
    public void testEsPrimoYCapicua() {
        System.out.println("esPrimoYCapicua");
        int numero = 13831;
        boolean expResult = true;
        boolean result = ETS82.esPrimoYCapicua(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ETS82.
     */
   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ETS82.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
}
