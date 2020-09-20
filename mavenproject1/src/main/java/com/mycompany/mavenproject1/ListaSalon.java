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
       if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio = inicio.getSig();
            }
            else{
                NodoSalon aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSig();
                }
                 NodoSalon siguiente = aux.getSig();
               aux.setSig(siguiente.getSig());
            }
             tamanio--;
              String a = listar();
             return "correcto";
        }
        String a = listar();
        return "incorrecto";
    }
    /**
     * Elimina la lista
     */
   
    
    
    //verificar capacidad
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
      
      //verificar nivel
         public boolean nivel(int nivel) {
       String niv= nivel+"";
        if (Integer.parseInt(niv.substring(0,1))<=4){
          return true;
      }
      return false;
    }
         
         //validar parametros
         public boolean setValue(int numero, String edificio,int capacidad,int nivel,int id) {

        if(id<=0 || numero<=0 || edificio=="" ||capacidad<=0 || nivel<=0 || nivel>4){
        return false;
        }
        return true;
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
         
}
