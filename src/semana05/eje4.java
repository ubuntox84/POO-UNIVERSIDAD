/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

import java.util.Scanner;

/**
 *
 * @author chris
 */
class Clase01{
    int numero;
    String nombre;
    //contructor
    public Clase01(){
        this.nombre="";
        this.numero=0;
    }
    //metodos
    void definirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Numero: "+this.numero);        
    }
    void leerDatos(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese nombre");
        this.nombre=teclado.nextLine();
        System.out.println("Ingrese numero");
        this.numero=teclado.nextInt();        
    }
}
public class eje4 {
    public static void main(String[] args) {
        Clase01 p1=new Clase01();
        p1.leerDatos();
        p1.definirDatos();
    }
}
