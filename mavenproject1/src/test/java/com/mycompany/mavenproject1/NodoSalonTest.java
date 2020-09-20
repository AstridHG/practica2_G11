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
 * @author tu3
 */
public class NodoSalonTest {
    
    public NodoSalonTest() {
    }
    
    NodoSalon NS;
    NodoSalon NSValido;
    NodoSalon NSInvalido;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    /*    NS = new NodoSalon();
        NS.getValor();
        NS.setValor(int numero, String edificio,int capacidad,int nivel,int id);
        NS.getSiguiente();
        NS.getAnterior();
        NS.getPrimero();
        NS.getUltimo();
        NS.Eliminar();
*/
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValor method, of class NodoSalon.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        NodoSalon instance = new NodoSalon();
        String[] expResult = null;
        String[] result = instance.getValor();
                   
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setValor method, of class NodoSalon.
     */
    @Test
    public void testSetValor() {
     /*   System.out.println("setValor");
        NodoSalon instance = new NodoSalon();
        String expResult = "valor";
        String result = instance.setValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       */ 
    }

 
    /**
     * Test of getSiguiente method, of class NodoSalon.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        NodoSalon instance = new NodoSalon();
        boolean expResult = false;
        boolean result = instance.getSiguiente();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAnterior method, of class NodoSalon.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        NodoSalon instance = new NodoSalon();
        boolean expResult = false;
        boolean result = instance.getAnterior();
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPrimero method, of class NodoSalon.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        NodoSalon instance = new NodoSalon();
        int expResult = 0;
        int result = instance.getPrimero();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getUltimo method, of class NodoSalon.
     */
    @Test
    public void testGetUltimo() {
        System.out.println("getUltimo");
        NodoSalon instance = new NodoSalon();
        String expResult = "10";
        int result = instance.getUltimo();
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Eliminar method, of class NodoSalon.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        NodoSalon instance = new NodoSalon();
        int expResult = 10;
        int result = instance.Eliminar();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
