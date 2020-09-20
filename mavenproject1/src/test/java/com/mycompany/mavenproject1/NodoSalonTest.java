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
        NSValido = mock(NodoSalon.class);
        NSInvalido = mock(NodoSalon.class);
        when(NSValido.getSiguiente()).thenReturn(false);
        when(NSInvalido.getSiguiente()).thenReturn(true);
        
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
       public void testcapacidad() {
        System.out.println("capacidad");
        NodoSalon instance = new NodoSalon();
        int valor=165;
        String expResult ="Grande";
        String result = instance.capacidad(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
       
          @Test
       public void testnivel() {
        System.out.println("nivel");
        NodoSalon instance = new NodoSalon();
        int valor=208;
        boolean result = instance.nivel(valor);
       assertTrue("Nivel Valido ", result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
      @Test
 public void testNotNull() {
      System.out.println("capacidad");
        ListaSalon salon = new ListaSalon();
        assertNotNull("La lista 'salon'  no es null:", salon);
 }
 @Test
  public void testNull() {
      System.out.println("capacidad");
        ListaSalon salon=null;
        assertNull("La lista 'salon' esta null:", salon);
    //    salon.agregarAlFinal(101,"T4",100,1,10);
     //   assertNull("La lista 'salon' esta null:", salon);
 }
       
    @Test
    public void notsame() { 
        System.out.println("numero nivel");
        NodoSalon instance = new NodoSalon();
        int nivel = instance.numeronivel(404);// El retorno es true
        int nivel1 = instance.numeronivel(203);// EL retorno es falso
          assertNotSame("No son iguales los dos niveles indicados para cada salon ingresado: ", nivel, nivel1);   
    }
   
    
    @Test
    public void array() { 
        System.out.println("array");
        NodoSalon instance = new NodoSalon();
       String[] edificios_actuales = { "T1", "T2","T3", "M1" };
 assertArrayEquals("Fallo - No son los mismos arreglos",instance.getedificios(), edificios_actuales);
    }
    
        @Test
    public void validarvalores() { 
        System.out.println("validar");
        NodoSalon instance = new NodoSalon();
     boolean result = instance.setValue(205,"M1",-50,2,10);
       assertFalse("Datos incorrectos ", result);
    }
    
}
