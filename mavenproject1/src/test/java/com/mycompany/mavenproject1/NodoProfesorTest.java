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
     * Test of Nodo method, of class NodoProfesor.
     */
    @Test
    public void testNodo() {
        System.out.println("Nodo");
        NodoProfesor instance = new NodoProfesor();
        instance.Nodo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSig method, of class NodoProfesor.
     */
    @Test
    public void testGetSig() {
        System.out.println("getSig");
        NodoProfesor instance = new NodoProfesor();
        NodoProfesor expResult = null;
        NodoProfesor result = instance.getSig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class NodoProfesor.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        NodoProfesor instance = new NodoProfesor();
        String[] expResult = null;
        String[] result = instance.getValor();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class NodoProfesor.
     */
    @Test
    public void testSetValor_0args() {
        System.out.println("setValor");
        NodoProfesor instance = new NodoProfesor();
        String expResult = "";
        String result = instance.setValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguiente method, of class NodoProfesor.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        NodoProfesor instance = new NodoProfesor();
        boolean expResult = false;
        boolean result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnterior method, of class NodoProfesor.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        NodoProfesor instance = new NodoProfesor();
        boolean expResult = false;
        boolean result = instance.getAnterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimero method, of class NodoProfesor.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        NodoProfesor instance = new NodoProfesor();
        int expResult = 0;
        int result = instance.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class NodoProfesor.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        NodoProfesor instance = new NodoProfesor();
        int expResult = 0;
        int result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }
    
}
