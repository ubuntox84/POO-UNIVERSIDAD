/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana14;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class eje02 {
    public static void main(String[] args) {
        int vect[]=new int[5];
        int sum=0;
        for (int i = 0; i < vect.length; i++) {
            int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero: "));
            vect[i]=n;
            sum+=n;
        }
        for(Integer x: vect){
            System.out.print(x+"  ");
        }
        System.out.println("\n___________________________");
        System.out.println("Promedio: "+(sum/vect.length));
    }
}
