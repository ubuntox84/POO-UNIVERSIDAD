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
class Pikachu{
    String nombre;
    String color;
    int poder;
    //Constructor
    public Pikachu(String n, int p){
        this.nombre=n;
        this.color="Amarillo";
        this.poder=p;
    }
    void mostrar(){
        System.out.println("Su nombre es: "+this.nombre+" Su color es: "
                +this.color+" su poder es: "+this.poder);
    }
    
}
public class ejer3 {
    static void peliar(Pikachu p1, Pikachu p2){
        if(p1.poder>p2.poder){
            p1.mostrar();
        }else{
            p2.mostrar();
        }
    }
    public static void main(String[] args) {
        Pikachu p1=new Pikachu("Pika", 100);
        Pikachu p2=new Pikachu("Fido", 500);
        Pikachu p3=new Pikachu("Lio", 2500);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        System.out.println("El ganador es: ");
        peliar(p1, p2);
    }
}
