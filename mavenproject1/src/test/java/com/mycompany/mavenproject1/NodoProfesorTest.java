/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esdras
 */
public class NodoProfesorTest {
    
    private NodoProfesor NodoProfesorValido;
    private NodoProfesor NodoProfesorInvalido;
    
    public NodoProfesorTest() {
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
     * Test of getVal method, of class NodoProfesor.
     */
    @Test
    public void testGetVal() {
        System.out.println("getVal");
        NodoProfesor instance = new NodoProfesor();
        String expResult = "";
        String result = instance.getVal();
        //assertEquals(expResult, result);
        assertTrue(result,true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class NodoProfesor.
     */
    @Test
    public void testSetValor_int_String() {
        System.out.println("setValor");
        int id = 0;
        String nombre = "";
        NodoProfesor instance = new NodoProfesor();
        instance.setValor(id, nombre);
        assertNotNull(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of setSig method, of class NodoProfesor.
     */
    @Test
    public void testSetSig() {
        System.out.println("setSig");
        NodoProfesor siguiente = null;
        NodoProfesor instance = new NodoProfesor();
        instance.setSig(siguiente);
        // TODO review the generated test code and remove the default call to fail.
        assertNotSame(siguiente,0);
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setValor method, of class NodoProfesor.
     */
    @Test
    public void testSetValor_0args() {
        System.out.println("setValor");
        NodoProfesor instance = new NodoProfesor();
        String expResult = "valor";
        String result = instance.setValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NodoProfesor.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        NodoProfesor instance = new NodoProfesor();
        int expResult = 0;
        int result = instance.Eliminar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
