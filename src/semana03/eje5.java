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
public class eje5 {

   static int Producto (int x,int y, int z){
        return (x*y*z);        
    }
    public static void main(String[] args) {
        int a=2,b=5,c=4;
        int resul;
        resul=Producto(a,b,c);
        System.out.println("El producto de "+a+" , "+b+" y "+c+" es: "+resul);     
        
    }
    
}