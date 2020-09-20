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
 * @author wendy
 */
public class ListaSalon {
     private NodoSalon inicio;
    private int tamanio;

    public void Lista(){
        inicio = null;
        tamanio = 0;
    }

    public boolean isempty(){
        return inicio == null;
    }

    public int getTamanio(){
        return tamanio;
    }

    public String agregarAlFinal(int numero, String edificio,int capacidad,int nivel,int id){
        NodoSalon nuevo = new NodoSalon();
        nuevo.setValor( numero,edificio,capacidad,nivel,id);
        if (isempty()) {
            inicio = nuevo;
        } else{

            NodoSalon aux = inicio;

            while(aux.getSig() != null){
                aux = aux.getSig();
            }

            aux.setSig(nuevo);
        }

        tamanio++;
        String a = listar();
        return a;
    }
    
      public String listar(){
         String contenido = "";
        String contenido2 = "";
        if (!isempty()) {
              NodoSalon aux = inicio;
             int i = 0;
             while(aux != null){
                System.out.print(i + ".[ " + aux.getVal() + " ]" + " ->  ");
                contenido2 += i + ".[ " + aux.getVal() + " ]" + " ->  ";
                contenido += aux.getVal() + ";";
                aux = aux.getSig();
                  i++;
            }
        }
        System.out.println("");
        
        Escribir(contenido);
        return contenido2;
    }
    
    public void Escribir(String cont){
        try {
            String ruta = "SALONES.txt";
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
        archivo = new File ("SALONES.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null){
            //System.out.println(linea);
            contenido += linea;
         }
      }
      catch(Exception e){
        System.out.println("aqui");
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            System.out.println("aqui2");
         }
      }
      
      if (!contenido.equals("")){
           String[] parts = contenido.split(";");  
    for(int i=0;i<parts.length;i++){
        String subparte = parts[i];    
        String[] parts2 = subparte.split(","); 
         
      agregarAlFinal(Integer.parseInt(parts2[1]),parts2[3],Integer.parseInt(parts2[4]), Integer.parseInt(parts2[2]),Integer.parseInt(parts2[0]));
      }
   
    } 
    
    }
    
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
                NodoSalon aux = inicio;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSig();
                }
                // Guarda el nodo siguiente al nodo a eliminar.
                NodoSalon siguiente = aux.getSig();
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
}
