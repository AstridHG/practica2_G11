/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.lang.reflect.Array;

/**
 *
 * @author tu3
 */
public class NodoCurso {
    
    private int id;
    private String Nombre;
    private int nota;
    private NodoCurso siguiente;
    
    
    // Métodos get y set para los atributos.
    
    public String[] getValor() {        
        String[] parts2 = null; 
        return parts2;
    }
     public String getVal() {
        String valor = String.valueOf(id) + "," + Nombre+","+String.valueOf(nota);
        return valor;
    }
    public void  setValor(int ide,String nombre, int nota) {
        this.id=ide;
        this.Nombre=nombre;
        this.nota=nota;
    }
    public NodoCurso getSig() {
        return siguiente;
    }

    public void setSig(NodoCurso siguiente) {
        this.siguiente = siguiente;
    }  
    
    public boolean getSiguiente() {
        return true;
    }

    public boolean getAnterior() {
        return false;
    }   
    
    public int getPrimero() {
        return 10;
    }

    public int getUltimo() {
        return 100;
    } 
    
    public int Eliminar(){
        return 0;
    }
    
}
