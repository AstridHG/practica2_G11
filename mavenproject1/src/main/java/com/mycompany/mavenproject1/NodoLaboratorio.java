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
public class NodoLaboratorio {
    private int id;
    private String Nombre;
    private NodoLaboratorio siguiente;
    private int capacidad;

    
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
    
    public void setCapacidadSalon(NodoSalon NSTemp){
        if(NSTemp.getSiguiente()){
            
        }
        else{
            throw new IllegalArgumentException("La cantidad deve ser menor o igual a 65");
        }
    }
    
    public void setEdadAuxiliar(NodoAuxiliar NSTemp){
        if(NSTemp.getSiguiente()){
            
        }
        else{
            throw new IllegalArgumentException("El auxiliar no puede ser mero a 18 de edad");
        }
    }
    
    public void setEdadEstudiante(NodoEstudiante NSTemp){
        if(NSTemp.getSiguiente()){
            
        }
        else{
            throw new IllegalArgumentException("El auxiliar no puede ser mero a 18 de edad");
        }
    }
    
     public void setCapacidadCurso(NodoCurso NSTemp){
        if(NSTemp.getSiguiente()){
            
        }
        else{
            throw new IllegalArgumentException("La cantidad deve ser menor o igual a 65");
        }
    }
     
    public void setEdadProfesor(NodoProfesor NSTemp){
        if(NSTemp.getSiguiente()){
            
        }
        else{
            throw new IllegalArgumentException("El auxiliar no puede ser mero a 18 de edad");
        }
    }
}
