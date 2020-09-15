/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareaclasepersona.com.unab.parcialcalculodenotas.Negocio;

/**
 *
 * @author USUARIO
 */
public class clsInterfaz {
    
    public Double FunPromedio1(String num1 , String num2){
      Double Lab1 = Double.parseDouble(num1);
      Double Parcial = Double.parseDouble(num2);
     
       Double PromedioLab1 = Lab1 * 0.40;
       Double PromedioParcial1 = Parcial * 0.60;
       
       Double Promedio = PromedioLab1 + PromedioParcial1;
       Promedio /= 3;
       
       return Promedio;
        
    }
     public Double FunPromedio12(String num1 , String num2){
      Double Lab2 = Double.parseDouble(num1);
      Double Parcia2 = Double.parseDouble(num2);
     
       Double PromedioLab2 = Lab2 * 0.40;
       Double PromedioParcial2 = Parcia2 * 0.60;
       
       Double Promedio = PromedioLab2 + PromedioParcial2;
       Promedio /= 3;
       
       return Promedio;
     }
     
      public Double FunPromedio3(String num1 , String num2){
      Double Lab3 = Double.parseDouble(num1);
      Double Parcia3 = Double.parseDouble(num2);
     
       Double PromedioLab3 = Lab3 * 0.40;
       Double PromedioParcial3 = Parcia3 * 0.60;
       
       Double Promedio = PromedioLab3 + PromedioParcial3;
       Promedio /= 3;
       
       return Promedio;
      }
      
      public Double funcPromedioFinal(Double Promedio1 , Double Promedio2 , Double Promedio3){
         Double total = Promedio1 + Promedio2 + Promedio3;
         
         return total;
      }
      
}
