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
      
         public String capacidad(int capacidad) {
      if (capacidad>=50 &&capacidad<100){
          return "Pequeño";
      }else if (capacidad>=100 &&capacidad<150){
          return "Mediano";
      }else if (capacidad>=150  &&capacidad<200){
          return "Grande";
      }
      return "error";
    }
         
         
   public boolean nivel(int nivel) {
       String niv= nivel+"";
        if (Integer.parseInt(niv.substring(0,1))<=4){
          return true;
      }
      return false;
    }

   public int numeronivel(int nivel) {
       String niv= nivel+"";
        if (Integer.parseInt(niv.substring(0,1))<=4){
          return Integer.parseInt(niv.substring(0,1));
      }
      return 0;
    }
   
     
     public String[] getedificios(){
         String[] edificios={"T1","T2","T3","M1"};
         return edificios;
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
      
    public boolean setValue(int numero, String edificio,int capacidad,int nivel,int id) {
        this.id = id;
        this.numero=  numero;
        this.edificio=edificio;
        this.capacidad = capacidad;
        this.nivel=nivel;
        
        if(this.id<=0 || this.numero<=0 || this.edificio==""||   this.capacidad<=0 || this.nivel<=0 || this.nivel>4){
        return false;
        }
        return true;
    }   
    
     public boolean getSiguiente() {
        return true;
    }

     public void setCapacidadSalon(NodoSalon NSTemp){
        if(NSTemp.getSiguiente()){
            
        }
        else{
            throw new IllegalArgumentException("La cantidad debe ser menor o igual a 200");
        }
    }
}
