/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

/**
 *
 * @author chris
 */
public class eje11 {
    public static void main(String[] args) {
        String cad="UNIVERSIDAD DE HUANUCO";
        cad=cad.toLowerCase();
        System.out.println(cad);
        
        String cad1="juan,19,Masculino,Universida,Facultad";
        String [] cad3=cad1.split(",");
        for(String c:cad3){
            System.out.println(c);
        }
        
        
    }
    
}
