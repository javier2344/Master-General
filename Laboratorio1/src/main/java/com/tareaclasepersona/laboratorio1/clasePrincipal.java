/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareaclasepersona.laboratorio1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class clasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner Sc = new Scanner (System.in);
        System.out.println("ingresa tu nombre");
        String Nombre = Sc.nextLine();
        System.out.println("ingrese tu edad ");
        int Edad = Sc.nextInt();
        System.out.println("ingresa tu genero");
        char Sexo = Sc.next().charAt(0);
        System.out.println("ingresa tu peso ");
        Double Peso = Sc.nextDouble();
        System.out.println("ingresa tu altura");
        Double Altura = Sc.nextDouble(); 
        
        
        Persona person = new Persona();
        person.setNombre(Nombre);
        person.setEdad(Sexo);
        person.setSexo(Edad);
        person.setPeso(0);
        person.setAltura(0);
        
        
        Persona person1 = new Persona(Nombre, (char) Edad, Sexo ,Peso , Altura);
        System.out.println(person1.toString());
        System.out.println(person1.EsMayorDeEdad());
        
        
        Persona person2 = new Persona(person1.getNombre(),person1.getEdad(),person1.getSexo());
        System.out.println(person2.toString2());
        System.out.println(person2.EsMayorDeEdad());
        
        Persona person3 = new Persona ();
        person3.setNombre(Nombre);
        person3.setEdad(Sexo);
        person3.setSexo(Edad);
        person3.setPeso(0);
        person3.setAltura(0);
        System.out.println(person3.toString());
        System.out.println(person3.EsMayorDeEdad());
        
       
        
    }
}  
