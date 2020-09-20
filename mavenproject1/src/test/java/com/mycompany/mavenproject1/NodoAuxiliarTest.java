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
public class NodoAuxiliarTest {
    
    ListaAuxiliar auxiliar = new ListaAuxiliar();
    
    public NodoAuxiliarTest() {
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
     * Test of getValor method, of class NodoSalon.
     */
    
    @Test
    public void testCodigoPersonalCorrecto() {
        assertEquals("El codigo enviado esta entre el rango correcto: ", auxiliar.validarCodigoPersonal(2012),2012);
    }

    @Test
    public void testCodigoPersonalIncorrecto() {
        assertEquals("El codigo enviado esta entre el rango incorrecto: ", auxiliar.validarCodigoPersonal(10201),0);
    }
    
    @Test
    public void testCodigoPersonalNegativo() {
        assertEquals("El codigo enviado es negativo: ", auxiliar.validarCodigoPersonal(-100),0);
    }
    
    @Test
    public void testNombreInCorrecto() {
        assertFalse("El nombre es incorrecto, devuelve false: ", auxiliar.validarNombre("as1tr2id"));
    }
    
    @Test
    public void testNombreCorrecto() {
        assertTrue("El nombre es correcto, devuelve true: ", auxiliar.validarNombre("astrid"));
    }
    
    
    @Test
    public void testCursoCorrecto() {
        assertNotNull("El curso se encuentra correcto: ", auxiliar.validarCurso("Analisis"));
    }
    
    @Test
    public void testCursoInCorrecto() {
        assertNull("El curso se encuentra incorrecto: ", auxiliar.validarCurso(""));
    }
    
    
    @Test
    public void testSeccionCorrecto() {
        assertTrue("La seccion es correcta: ", auxiliar.validarSeccion('a'));
    }
    
    @Test
    public void testSeccionInCorrecto() {
        assertFalse("La seccion es incorrecta: ", auxiliar.validarSeccion('2'));
    }
    
    @Test
    public void testContrasenaInCorrecto() {
        assertNotSame("La contraseña es incorrecta: ", auxiliar.validarContrasena("astrid"),"astrid");
    }
    
    @Test
    public void testContrasenaCorrecto() {
        assertSame("La contraseña es correcta: ", auxiliar.validarContrasena("astrid14"),"astrid14");
    }
    
    @Test
    public void testListaVacia() {
        boolean valor1 = auxiliar.listaVacia();
        auxiliar.insertarAuxiliar(1234, "Astrid", "analisis",'a', "astrid14");
        boolean valor2 = auxiliar.listaVacia();
        
        assertNotSame("La Lista es vacia: ",valor1,valor2);
    }
    
    @Test
    public void testInsertarAuxiliarCorrecto() {
        assertTrue("El usuario es correcto: ", auxiliar.insertarAuxiliar(1234, "Astrid", "analisis",'a', "astrid14"));
    }
    
    @Test
    public void testInsertarAuxiliarInCorrecto() {
        assertFalse("El usuario es incorrecto: ", auxiliar.insertarAuxiliar(123, "Ast5rid", "anal6isis",'1', "a1s"));
    }
}
