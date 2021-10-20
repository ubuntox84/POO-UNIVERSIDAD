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
class licor{
    String tipo;
    String estado;
    public licor(String t, String estado){
        this.tipo=t;
        this.estado=estado;
    }
    public String mostrarLicor() {
        return "licor{" + "tipo=" + tipo + ", estado=" + estado + '}';
    }
    
}
class cerve extends licor{
    String marca;
    float tamaño;
    String presentacion;
    float precio;
    public cerve(String ti, String e,String m,float t, String p, float pe ){
        super(ti,e);
        this.marca=m;
        this.tamaño=t;
        this.presentacion=p;
        this.precio=pe;
    }

    @Override
    public String toString() {
        return mostrarLicor()+"cerve{" + "marca=" + marca + ", tama\u00f1o=" + tamaño + ", presentacion=" + presentacion + ", precio=" + precio + '}';
    }
    
}
public class preg2 {
    public static void main(String[] args) {
        cerve ce1=new cerve("Cervesa","Helada","Pilsen", 1000.f, "Botella", 5f);
        cerve ce2=new cerve("Cervesa","Helada","Cuzqueña", 1000.f, "Botella", 7f);
        System.out.println(ce1.toString());
        System.out.println(ce2.toString());
    }
}
