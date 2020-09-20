/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author tu3
 */
public class NodoSalon {
    private int id;
     private int numero;
      private int nivel;
    private String edificio;
    private NodoSalon siguiente;
    private int capacidad;
    
    // Métodos get y set para los atributos.
   
      public void setValor(int numero, String edificio,int capacidad,int nivel,int id) {
        this.id = id;
        this.numero=  numero;
        this.edificio=edificio;
        this.capacidad = capacidad;
        this.nivel=nivel;
    }
      
  
 public NodoSalon getSig() {
        return siguiente;
    }

    public void setSig(NodoSalon siguiente) {
        this.siguiente = siguiente;
    }  
    
  public String getVal() {
        String valor = String.valueOf(id) + ","+ String.valueOf(numero) + "," + String.valueOf(nivel) + ","+ edificio+","+ String.valueOf(capacidad);
        return valor;
    }   

}
