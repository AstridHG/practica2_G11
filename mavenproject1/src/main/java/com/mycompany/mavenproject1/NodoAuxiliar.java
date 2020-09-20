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
public class NodoAuxiliar {
    private int    codigoPersonal;
    private String Nombre;
    private String curso;
    private char   seccion;
    private String contrasena;
    private NodoAuxiliar siguiente;

    
    // Métodos get y set para los atributos.

    public int getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(int codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public NodoAuxiliar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAuxiliar siguiente) {
        this.siguiente = siguiente;
    }
    

}
