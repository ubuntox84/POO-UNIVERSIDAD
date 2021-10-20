/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class eje7 {
    
    static float calcular(float x,float y){
        float res;
        res=x*y;
        return res;
    }    
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        float d,v,t;
        System.out.println("Ing. Velocidad: ");
        v=tecla.nextFloat();
        System.out.println("Ing. Tiempo: ");
        t=tecla.nextFloat();
        System.out.println("La distancia es: "+calcular(v,t));
    }
}
