/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

import java.util.TreeSet;

/**
 *
 * @author chris
 */
public class eje3 {
    public static void main(String[] args) {
        TreeSet<String> lista=new TreeSet<>();
        lista.add("Mango");
        lista.add("Uva");
        lista.add("Pera");
        lista.add("Manzana");
        lista.add("Mango");
        lista.add(null);
        System.out.println("Elementos: "+lista);
    }
    
}
