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
class Perro{
    String name;
    String raza;
    int old;
    public Perro(String n, String r, int o){
        this.name=n;
        this.raza=r;
        this.old=o;
    }
    void mostrar(){
        System.out.println("Nombre: "+this.name+"\nRaza: "+this.raza+"\nEdad: "+this.old);
    }
    void buscar(){
        
    }
    void eliminar(){
        
    }
}
public class eje12 {
    public static void main(String[] args) {
        Perro p1=new Perro("Luna","Boxer",7);
        Perro p2=new Perro("Fido","Pequines",12);
        p1.mostrar();
        p2.mostrar();
    }
    
}
