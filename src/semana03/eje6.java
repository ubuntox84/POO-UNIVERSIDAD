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
//hallar distancia, ingresando la velocidad y el tiempo
public class eje6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float distancia, velocidad, tiempo;
        System.out.println("Ingresa la velocidad");
        velocidad=sc.nextFloat();
        System.out.println("Ingresar la tiempo");
        tiempo=sc.nextFloat();
        distancia=velocidad*tiempo;
        System.out.println("La distancia es: "+distancia);
    }
}
