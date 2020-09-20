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
    
    private NodoSalon NodoSalonValido;
    private NodoSalon NodoSalonInvalido;
        
    private NodoAuxiliar NodoAuxiliarValido;
    private NodoAuxiliar NodoAuxiliarInvalido;

    private NodoEstudiante NodoEstudianteValido;
    private NodoEstudiante NodoEstudianteInvalido;
    
    private NodoCurso NodoCursoValido;
    private NodoCurso NodoCursoInvalido;
    
    private NodoProfesor NodoProfesorValido;
    private NodoProfesor NodoProfesorInvalido;
    
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
        
        NodoSalonValido = mock(NodoSalon.class);
        NodoSalonInvalido = mock(NodoSalon.class);
        when(NodoSalonValido.getSiguiente()).thenReturn(false);
        when(NodoSalonInvalido.getSiguiente()).thenReturn(true);
        
        NodoAuxiliarValido = mock(NodoAuxiliar.class);
        NodoAuxiliarInvalido = mock(NodoAuxiliar.class);
        when(NodoAuxiliarValido.getSiguiente()).thenReturn(false);
        when(NodoAuxiliarInvalido.getSiguiente()).thenReturn(true);
        
        NodoEstudianteValido = mock(NodoEstudiante.class);
        NodoEstudianteInvalido = mock(NodoEstudiante.class);
        when(NodoEstudianteValido.getSiguiente()).thenReturn(false);
        when(NodoEstudianteInvalido.getSiguiente()).thenReturn(true);
        
        NodoCursoValido = mock(NodoCurso.class);
        NodoCursoInvalido = mock(NodoCurso.class);
        when(NodoCursoValido.getSiguiente()).thenReturn(false);
        when(NodoCursoInvalido.getSiguiente()).thenReturn(true);
        
        NodoProfesorValido = mock(NodoProfesor.class);
        NodoProfesorInvalido = mock(NodoProfesor.class);
        when(NodoProfesorValido.getSiguiente()).thenReturn(false);
        when(NodoProfesorInvalido.getSiguiente()).thenReturn(true);

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValor method, of class NodoLaboratorio.
     */
    
    
    @Test (expected = IllegalArgumentException.class)
    public void NodoSalon_testmockSetCapacidadSalon() {
    Laboratorio.setCapacidadSalon(NodoSalonValido);        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void NodoAuxiliar_testmockSetEdadAuxiliar() {
    Laboratorio.setEdadAuxiliar(NodoAuxiliarValido);        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void NodoEstudiante_testmockSetEdadEstudiante() {
    Laboratorio.setEdadEstudiante(NodoEstudianteValido);        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void NodoCurso_testmockSetCapacidadCurso() {
    Laboratorio.setCapacidadCurso(NodoCursoValido);        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void NodoProfesor_testmockSetEdadProfesor() {
    Laboratorio.setEdadProfesor(NodoProfesorValido);        
    }
    
}
