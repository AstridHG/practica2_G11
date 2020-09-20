/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author tu3
 Clase que define los elementos que debe tener un NodoEstudiante de la lista.
 */
public class NodoEstudiante {
    private int id;
    private String Nombre;
    private NodoEstudiante siguiente;

    public void Nodo(){
        this.id = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public String getVal() {
        String valor = String.valueOf(id) + "," + Nombre;
        return valor;
    }

    public void setValor(int id, String nombre) {
        this.id = id;
        this.Nombre = nombre;
    }

    public NodoEstudiante getSig() {
        return siguiente;
    }

    public void setSig(NodoEstudiante siguiente) {
        this.siguiente = siguiente;
    }  
    
    
    // Métodos get y set para los atributos.
    
    public String[] getValor() {        
        String[] parts2 = null; 
        return parts2;
    }

    public String setValor() {
        return "valor";
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

