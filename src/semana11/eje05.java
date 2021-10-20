/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import java.util.HashSet;

/**
 *
 * @author chris
 */
public class eje05 {
    public static void main(String[] args) {
        HashSet<String> lista=new HashSet<>();
        lista.add("Fresa");
        lista.add("Xion");
        lista.add("mango");
        lista.add("manzana");
        lista.add("Zion");
        
        lista.add("durazno");
        lista.add("papaya");
        
        for(String m:lista){
            System.out.println(m);
        }
        System.out.println("");
        lista.add("papaya");
        lista.add("manzana");
        
        for(String m:lista){
            System.out.println(m);
        }
        
    }
}
