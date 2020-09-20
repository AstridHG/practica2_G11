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
    }
    

    /**
     * Test of getSig method, of class NodoCurso.
     */
    @Test
    public void testNota() {
        NodoCurso instance = new NodoCurso();
        int nota=0;
        boolean result = instance.setValor(1, "prueba", 5);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSiguiente method, of class NodoCurso.
     */
    @Test
    public void testNotaError() {
        NodoCurso instance = new NodoCurso();
        int nota=0;
        boolean result = instance.setValor(1, "prueba", 5);
        assertNotSame(result,nota); //afirrmando que no son iguales
        // TODO review the generated test code and remove the default call to fail.
    }
  @Test
    public void testNotaAfirma() {
        NodoCurso instance = new NodoCurso();
        boolean acepta=true;
        boolean result = instance.setValor(1, "prueba", 5);
        assertSame(result,acepta); //afirrmando que son iguales
        // TODO review the generated test code and remove the default call to fail.
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
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
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
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of Eliminar method, of class NodoCurso.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        NodoCurso instance = new NodoCurso();
        int expResult = 10;
        int result = instance.Eliminar();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
