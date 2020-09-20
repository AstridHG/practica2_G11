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
    
    public String[] getValor() {        
        String[] parts2 = null; 
        return parts2;
    }

      public void setValor(int numero, String edificio,int capacidad,int nivel,int id) {
        this.id = id;
        this.numero=  numero;
        this.edificio=edificio;
        this.capacidad = capacidad;
        this.nivel=nivel;
    }
      
         public String capacidad(int capacidad) {
      if (capacidad>=50 &&capacidad<100){
          return "Pequeño";
      }else if (capacidad>=100 &&capacidad<150){
          return "Mediano";
      }else if (capacidad>=150 ){
          return "Grande";
      }
      return "error";
    }
         
         
   public int nivel(int nivel) {
       String niv= nivel+"";
        if (niv.charAt(1)<=4){
          return niv.charAt(1);
      }
      return 0;
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
