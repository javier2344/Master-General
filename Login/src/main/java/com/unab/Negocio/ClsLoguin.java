/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.Negocio;

import com.unab.Dominio.loguin;

/**
 *
 * @author USUARIO
 */
public class ClsLoguin {
    
    public boolean accsoSistema(loguin log){
           
       if(log.getUsuario() .equals("Javier") && log.getPass().equals("123")){
       return true;
    }else{
    return false;
       }
    }

}
