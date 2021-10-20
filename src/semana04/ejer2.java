/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04;

/**
 *
 * @author chris
 */
class Frutas{
    String nombre;
    String color;
    String sabor;
    
    //constructor
    public Frutas(String n, String c, String d){
        this.nombre=n;
        this.color=c;
        this.sabor=d;
    }
    
    void mostrar(){
        System.out.println("Su nombre es: "+this.nombre+ " Su color es: "+this.color+" su sabor es: "+this.sabor);
    }    
}
public class ejer2 {
    public static void main(String[] args) {
        Frutas f1=new Frutas("Mango","Amarillo","Dulce");///----> objeto
        Frutas f2=new Frutas("Fresa","Rojo","Dulce");
        Frutas f3=new Frutas("Pera","Verde","Dulce");
        
        f1.mostrar();
        f2.mostrar();
        f3.mostrar();
    }
}
