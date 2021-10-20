/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

/**
 *
 * @author chris
 */
class perno{
    String name;
    double precio;
    void mostrar(){
        System.out.println("No se muestra datos");
    }
    void mostrar(String name){
        System.out.println(name);
    }
    void mostrar(String name, double precio){
        System.out.println("nombre: "+name+ " precio: "+precio);
    }
}
public class eje6 {
    public static void main(String[] args) {
        perno p=new perno();
        p.mostrar();
        p.mostrar("Tuerca");
        p.mostrar("Tuerca", 5.3);
    }
}
