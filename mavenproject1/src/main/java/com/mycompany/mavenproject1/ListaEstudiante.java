/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author tu3
 * Clase que define las operaciones básicas que debe tener una lista simple.
 */
public class ListaEstudiante {
    private NodoEstudiante inicio;
    private int tamanio;

    public void Lista(){
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia(){
        return inicio == null;
    }

    public int getTamanio(){
        return tamanio;
    }

    public String agregarAlFinal(int id, String nombre){
        NodoEstudiante nuevo = new NodoEstudiante();
        nuevo.setValor(id, nombre);
        if (esVacia()) {

            inicio = nuevo;

        } else{

            NodoEstudiante aux = inicio;

            while(aux.getSig() != null){
                aux = aux.getSig();
            }

            aux.setSig(nuevo);
        }

        tamanio++;
        String a = listar();
        return a;
    }
   
    /**
     * Actualiza el id de un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a actualizar.
     * @param id nuevo id para el nodo.
     */
    public String editarPorPosicion(int posicion , int id, String nombre){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero.
            if(posicion == 0){
                // Alctualiza el id delprimer nodo.
                inicio.setValor(id, nombre);
            }
            else{
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                NodoEstudiante aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSig();
                }
                // Alctualiza el id del nodo.
                aux.setValor(id, nombre);
            }
        }
        String a = listar();
        return a;
    }
    
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a eliminar.
     */
    public String removerPorPosicion(int posicion){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero
            if(posicion == 0){
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSig();
            }
            // En caso que el nodo a eliminar este por el medio 
            // o sea el ultimo
            else{
                // Crea una copia de la lista.
                NodoEstudiante aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSig();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                NodoEstudiante siguiente = aux.getSig();
                // Elimina la referencia del nodo apuntando al nodo siguiente.
                aux.setSig(siguiente.getSig());
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
        String a = listar();
        return a;
    }
    /**
     * Elimina la lista
     */
    public void eliminar(){
        // Elimina el id y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }
    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public String listar(){
        // Verifica si la lista contiene elementoa.
        String contenido = "";
        String contenido2 = "";
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoEstudiante aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el id del nodo.
                System.out.print(i + ".[ " + aux.getVal() + " ]" + " ->  ");
                contenido2 += i + ".[ " + aux.getVal() + " ]" + " ->  ";
                contenido += aux.getVal() + ";";
                // Avanza al siguiente nodo.
                aux = aux.getSig();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        System.out.println("");
        
        Escribir(contenido);
        return contenido2;
    }
    
    public void Escribir(String cont){
        try {
            String ruta = "BD.txt";
            String contenido = cont;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Leer(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String contenido="";

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("BD.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         
         String linea;
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            contenido += linea;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
    String[] parts = contenido.split(";");  
    for(int i=0;i<parts.length;i++){
        String subparte = parts[i];
        
        
        String[] parts2 = subparte.split(","); 
        //System.out.println(parts2[0]);
        //System.out.println(parts2[1]);
        agregarAlFinal(Integer.parseInt(parts2[0]), parts2[1]);
    } 
    
    }
    
    public String Mostrar(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      String contenido="";

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("BD.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         
         String linea;
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            contenido += linea;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
        //System.out.println(contenido);
        return contenido;
    
    }
}