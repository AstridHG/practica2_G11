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
public class NodoLaboratorioTest {
    
    private NodoLaboratorio Laboratorio;
    
   

    private NodoEstudiante NodoEstudianteValido;
    private NodoEstudiante NodoEstudianteInvalido;
    
    
    
    public NodoLaboratorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Laboratorio = new NodoLaboratorio();
        
        
        
        NodoEstudianteValido = mock(NodoEstudiante.class);
        NodoEstudianteInvalido = mock(NodoEstudiante.class);
        when(NodoEstudianteValido.getSiguiente()).thenReturn(false);
        when(NodoEstudianteInvalido.getSiguiente()).thenReturn(true);
        
       

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValor method, of class NodoLaboratorio.
     */
    
    
   
    
    @Test (expected = IllegalArgumentException.class)
    public void NodoEstudiante_testmockSetEdadEstudiante() {
    Laboratorio.setEdadEstudiante(NodoEstudianteValido);        
    }
    
    
}
