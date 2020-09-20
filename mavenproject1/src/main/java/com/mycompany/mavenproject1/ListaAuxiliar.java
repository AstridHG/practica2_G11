/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.*;

/**
 *
 * @author astridhernandez
 */
public class ListaAuxiliar {

    private NodoAuxiliar lista;

    public ListaAuxiliar() {
        this.lista = null;
    }

    public boolean listaVacia() //assertfalse
    {
        if (this.lista == null) {
            return true;
        }

        return false;
    }

    public boolean insertarAuxiliar(int codigoPersonal, String Nombre, String curso, char seccion, String contrasena) {
        if (validarCodigoPersonal(codigoPersonal) == codigoPersonal && validarNombre(Nombre) == true
                && validarCurso(curso).equals(curso) && validarSeccion(seccion) == true && validarContrasena(contrasena).equals(contrasena)) {
            setAuxiliar(codigoPersonal, Nombre, curso, seccion, contrasena);
            return true;
        }
        return false;
    }

    public void setAuxiliar(int codigoPersonal, String Nombre, String curso, char seccion, String contrasena) {
        NodoAuxiliar nodo = new NodoAuxiliar();
        nodo.setCodigoPersonal(codigoPersonal);
        nodo.setNombre(Nombre);
        nodo.setContrasena(contrasena);
        nodo.setCurso(curso);
        nodo.setSeccion(seccion);
        nodo.setSiguiente(null);

        if (this.lista == null) {
            this.lista = nodo;
        } else {
            NodoAuxiliar aux = this.lista;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
    }

    public boolean eliminarAuxiliar(int codigoPersonal) {
        if (this.lista != null) {
            if (this.lista.getSiguiente() == null && this.lista.getCodigoPersonal() == codigoPersonal) {
                this.lista = null;
                return true;
            } else if (this.lista.getSiguiente() != null && this.lista.getCodigoPersonal() == codigoPersonal) {
                this.lista = this.lista.getSiguiente();
                return true;
            } else {
                NodoAuxiliar aux = this.lista;

                while (aux.getSiguiente() != null) {
                    if (aux.getSiguiente().getCodigoPersonal() == codigoPersonal) {
                        if (aux.getSiguiente().getSiguiente() != null) {
                            aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        } else {
                            aux.setSiguiente(null);
                        }
                        return true;
                    }
                    aux = aux.getSiguiente();
                }
            }
        }

        return false;
    }

    public String listarAuxiliar() {
        String contenido2 = "";

        if (this.lista != null) {
            NodoAuxiliar aux = this.lista;

            while (aux != null) {

                contenido2 += aux.getCodigoPersonal() + "," + aux.getNombre() + ","
                        + aux.getCurso() + "," + aux.getSeccion() + "," + aux.getContrasena() + "\n";

                aux = aux.getSiguiente();
            }
        }
        return contenido2;
    }

    public void escribirArchivo(String cont) {
        try {
            String ruta = "BDAux.txt";
            String contenido = cont;
            File file = new File(ruta);

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

    public void Leer() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String contenido = "";

        try {
            archivo = new File("BDAux.txt");

            if (archivo.exists()) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {
                    contenido += linea + "\n";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        if (!contenido.equals("")) {
            System.out.println(contenido);
            String[] parts = contenido.split("\\r\\n|\\n|\\r");
            for (int i = 0; i < parts.length; i++) {
                String subparte = parts[i];

                String[] parts2 = subparte.split(",");

                setAuxiliar(Integer.parseInt(parts2[0]), parts2[1], parts2[2], parts2[3].charAt(0), parts2[4]);
            }
        }

    }

    

//validaciones de atributoss
    public int validarCodigoPersonal(int codigoPersonal) //assertEqual
    {
        if (codigoPersonal > 0 && codigoPersonal <= 9999) {
            return codigoPersonal;
        }
        return 0;
    }

    public boolean validarNombre(String nombre) //assertfalse
    {
        if (nombre.matches(".*[0-9].*")) {
            return false;
        }
        return true;
    }

    public String validarCurso(String curso) //assertnotnull
    {
        if (curso.equals("")) {
            return null;
        }
        return curso;
    }

    public boolean validarSeccion(char seccion) //asserttrue
    {
        if (Character.isDigit(seccion)) {
            return false;
        }
        return true;
    }

    public String validarContrasena(String contrasena) //assertsame
    {
        if (contrasena.length() >= 8) {

            return contrasena;
        }
        return "invalida";
    }
}
