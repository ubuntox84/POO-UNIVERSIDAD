package semana09;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
class cerveza{
    String marca;
    float tamaño;
    String presentacion;
    float precio;
    public cerveza(String m,float t, String p, float pe ){
        this.marca=m;
        this.tamaño=t;
        this.presentacion=p;
        this.precio=pe;
    }

    @Override
    public String toString() {
        return "cerveza{" + "marca=" + marca + ", tama\u00f1o=" + tamaño + ", presentacion=" + presentacion + ", precio=" + precio + '}';
    }
    
}
public class pre01 {
    public static void main(String[] args) {
        cerveza ce1=new cerveza("Pilsen", 1000.f, "Botella", 5f);
        cerveza ce2=new cerveza("Cuzqueña", 1000.f, "Botella", 7f);
        System.out.println(ce1.toString());
        System.out.println(ce2.toString());
    }
}
