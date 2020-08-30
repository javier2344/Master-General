/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareaclasepersona.laboratorio1;

/**
 *
 * @author USUARIO
 */
public class Persona  {

    private String Nombre;
    private char Edad;
    private int Sexo;
    private double peso;
    private double Altura;

    public Persona() {
    }

    public Persona(String Nombre, char Edad, int Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;

    }

    public Persona(String Nombre, char Edad, int Sexo, double peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.peso = peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getEdad() {
        return Edad;
    }

    public void setEdad(char Edad) {
        this.Edad = Edad;
    }

    public String EsMayorDeEdad() {

        int Edad = this.Edad;
        if (Edad < 18) {
        return "Es menor de edad ";
        } 
        else {
        return "es mayor de edad ";
        }

    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", peso=" + peso + ", Altura=" + Altura + '}';
    }
    public String toString2() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
        
    }
   

    void setSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}