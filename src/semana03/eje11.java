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
public class eje11 {
    public static void main(String[] args) {
        int x=3;
        int y;
        int z=x++;//z=3    x=4
        y=++z; //z=4     y=4
        int suma=x+y+z;
        System.out.println("La suma es: "+suma);
    }
}
