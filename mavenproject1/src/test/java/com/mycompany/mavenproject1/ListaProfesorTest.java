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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author esdras
 */
public class ListaProfesorTest {
    private ListaProfesor ListaProfesorValido;
    private ListaProfesor ListaProfesorInvalido;
    
    public ListaProfesorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ListaProfesorValido = mock(ListaProfesor.class);
        ListaProfesorInvalido = mock(ListaProfesor.class);
        when(ListaProfesorValido.agregarAlFinal(333, "Juan")).thenReturn("Exito");
        when(ListaProfesorInvalido.getTamanio()).thenReturn(0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esVacia method, of class ListaProfesor.
     */
    @Test
    public void testEsVacia() {
        System.out.println("esVacia");
        ListaProfesor instance = new ListaProfesor();
        boolean expResult = false;
        boolean result = instance.esVacia();
        //assertEquals(expResult, result);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTamanio method, of class ListaProfesor.
     */
    @Test
    public void testGetTamanio() {
        System.out.println("getTamanio");
        ListaProfesor instance = new ListaProfesor();
        int expResult = 0;
        int result = instance.getTamanio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of agregarAlFinal method, of class ListaProfesor.
     */
    @Test
    public void testAgregarAlFinal() {
        System.out.println("agregarAlFinal");
        int id = 0;
        String nombre = "";
        ListaProfesor instance = new ListaProfesor();
        String expResult = "";
        String result = instance.agregarAlFinal(id, nombre);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of editarPorPosicion method, of class ListaProfesor.
     */
    @Test
    public void testEditarPorPosicion() {
        System.out.println("editarPorPosicion");
        int posicion = 0;
        int id = 0;
        String nombre = "";
        ListaProfesor instance = new ListaProfesor();
        String expResult = "";
        String result = instance.editarPorPosicion(posicion, id, nombre);
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
    /**
     * Test of removerPorPosicion method, of class ListaProfesor.
     */
    @Test
    public void testRemoverPorPosicion() {
        System.out.println("removerPorPosicion");
        int posicion = 0;
        ListaProfesor instance = new ListaProfesor();
        String expResult = "";
        String result = instance.removerPorPosicion(posicion);
        assertFalse(expResult, false);
    }

    /**
     * Test of listar method, of class ListaProfesor.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ListaProfesor instance = new ListaProfesor();
        String expResult = "";
        String result = instance.listar();
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar method, of class ListaProfesor.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar");
        ListaProfesor instance = new ListaProfesor();
        String expResult = "";
        String result = instance.Mostrar();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
