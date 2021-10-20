/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03;

/**
 *
 * @author chris
 */

// se solicita ingresar el sexo: F - M
public class eje2 {
    public static void main(String[] args) {
        char sex='F';
        String cadena=(sex=='F')?"FEMENINO":"MASCULINO";
        System.out.println("El sexo es: "+cadena);
        
        //El sexo de Maria es FEMENINO
        //El sexo de Juan es MASCULINO
    }
}
