/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareaclasepersona.ejerciciopromedio1;

/**
 *
 * @author USUARIO
 */
public class clsDominio {
    
    private double Dato1;
    private double Dato2;

    public double getDato1() {
        return Dato1;
    }

    public void setDato1(double Dato1) {
        this.Dato1 = Dato1;
    }

    public double getDato2() {
        return Dato2;
    }

    public void setDato2(double Dato2) {
        this.Dato2 = Dato2;
    }
    
    public Double PrimerPar1(Double Dato1, Double Dato2){
      
        this.Dato1=Dato1;
        this.Dato2=Dato2;
        
        return Dato1*0.40 + Dato2*0.60;
        
    }
    
    public Double SegundoPer(Double Dato1, Double Dato2){
        
        this.Dato1=Dato1;
        this.Dato2=Dato2;
        
        return Dato1*0.40 + Dato2*0.60;
    }
    
     public Double Tercerper(Double Dato1 , Double Dato2){
        
        this.Dato1=Dato1;
        this.Dato2=Dato2;
        
        return Dato1*0.40 + Dato2*0.60;
         
        
   }
    
    
    
}
