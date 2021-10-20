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
public class eje12 {
    public static void main(String[] args) {
        String cad="FACULTAD UNIVERSIDAD DE HUANUCO";
        int l=cad.indexOf(' ');
        String cad2=cad.substring(0, l);
        String cad3=cad.substring(l);
        System.out.println(cad2);
        System.out.println(cad3);
        cad3="FACULTAD";
        cad3=cad3.toLowerCase();
        
        boolean bol=cad3.equalsIgnoreCase(cad2);
        System.out.println(bol);
        
    }
}
