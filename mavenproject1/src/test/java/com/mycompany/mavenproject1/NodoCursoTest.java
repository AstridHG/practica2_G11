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
 * @author yovany
 */
public class NodoCursoTest {
    
    public NodoCursoTest() {
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
     * Test of getValor method, of class NodoCurso.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        NodoCurso instance = new NodoCurso();
        String[] expResult = null;
        String[] result = instance.getValor();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVal method, of class NodoCurso.
     */
    @Test
    public void testGetVal() {
        System.out.println("getVal");
        NodoCurso instance = new NodoCurso();
        String expResult = "";
        String result = instance.getVal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class NodoCurso.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int ide = 0;
        String nombre = "";
        int nota = 0;
        NodoCurso instance = new NodoCurso();
        instance.setValor(ide, nombre, nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSig method, of class NodoCurso.
     */
    @Test
    public void testGetSig() {
        System.out.println("getSig");
        NodoCurso instance = new NodoCurso();
        NodoCurso expResult = null;
        NodoCurso result = instance.getSig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSig method, of class NodoCurso.
     */
    @Test
    public void testSetSig() {
        System.out.println("setSig");
        NodoCurso siguiente = null;
        NodoCurso instance = new NodoCurso();
        instance.setSig(siguiente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSiguiente method, of class NodoCurso.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        NodoCurso instance = new NodoCurso();
        boolean expResult = false;
        boolean result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnterior method, of class NodoCurso.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        NodoCurso instance = new NodoCurso();
        boolean expResult = false;
        boolean result = instance.getAnterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimero method, of class NodoCurso.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        NodoCurso instance = new NodoCurso();
        int expResult = 0;
        int result = instance.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimo method, of class NodoCurso.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        NodoCurso instance = new NodoCurso();
        int expResult = 0;
        int result = instance.getUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class NodoCurso.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        NodoCurso instance = new NodoCurso();
        int expResult = 0;
        int result = instance.Eliminar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
