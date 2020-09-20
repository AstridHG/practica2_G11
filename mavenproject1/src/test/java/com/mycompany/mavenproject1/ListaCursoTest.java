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
 * @author yovany
 */
public class ListaCursoTest {
    private ListaCurso listaCoursevalido;
     private ListaCurso listaCoursenovalido;
     InterfazCurso i=new InterfazCurso();
     private ListaCurso listita=new ListaCurso();
    public ListaCursoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         listaCoursevalido = mock(ListaCurso.class);
        listaCoursenovalido = mock(ListaCurso.class);
        when(listaCoursevalido.esVacia()).thenReturn(false);
        when(listaCoursenovalido.getTamanio()).thenReturn(0);
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of esVacia method, of class ListaCurso.
     */
    @Test
    public void testEsVaciaOK() {
         boolean valor1=listita.esVacia();
         listita.Leer();
         boolean valor2=listita.esVacia();
        assertNotSame("los valores nos son iguales", valor1,valor2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testEsVacianotK() {
        System.out.println("esVacia");
        ListaCurso instance = new ListaCurso();
        boolean expResult = false;
        boolean result = instance.esVacia();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of agregarAlFinal method, of class ListaCurso.
     */
    @Test
    public void testAgregarAlFinal() {
        System.out.println("agregarAlFinal");
        int id = 0;
        String nombre = "prueba";
        int nota = 0;
        ListaCurso instance = new ListaCurso();
        String expResult = "notValid";
        String result = instance.agregarAlFinal(id, nombre, nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testAgregarAlFinalOK() {
        System.out.println("agregarAlFinal");
        int id = 0;
        String nombre = "prueba";
        int nota = 70;
        ListaCurso instance = new ListaCurso();
        String expResult = "Valid";
        String result = instance.agregarAlFinal(id, nombre, nota);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of editarPorPosicion method, of class ListaCurso.
     */
    @Test
    public void testEditarPorPosicion() {
        System.out.println("editarPorPosicion");
        int posicion = 0;
        int id = 0;
        String nombre = "prueba";
        int nota = 0;
        ListaCurso instance = new ListaCurso();
        String expResult = "no";
        String result = instance.editarPorPosicion(posicion, id, nombre, nota);
        assertSame(expResult, result);
    }
    
    
    @Test
    public void testEditarPorPosicionOK() {
        System.out.println("editarPorPosicion");
        int posicion = 5;
        int id = 0;
        String nombre = "prueba";
        int nota = 90;
        ListaCurso instance = new ListaCurso();
        String expResult = "no";
        String result = instance.editarPorPosicion(posicion, id, nombre, nota);
        assertNotSame(expResult, result);
    }
    /**
     * Test of removerPorPosicion method, of class ListaCurso.
     */
    @Test
    public void testRemoverPorPosicion() {
        System.out.println("removerPorPosicion");
        boolean bandera=false;
        int posicion = 0;
        ListaCurso instance = new ListaCurso();
        String expResult = "";
        String result = instance.removerPorPosicion(posicion);
        assertNotNull(result);
    }

    /**
     * Test of Mostrar method, of class ListaCurso.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar");
        ListaCurso instance = new ListaCurso();
        String expResult = "";
        String result = instance.Mostrar();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
        @Test
    public void testTamanio() {
        int result = listita.getTamanio();
        listita.Leer();
        int lectura=listita.getTamanio();
        assertNotEquals(result, lectura);
        // TODO review the generated test code and remove the default call to fail.
    }
}
