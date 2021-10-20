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
class Empleado{
    private String nombre;
    //constructor
    public Empleado(String n){
        this.nombre=n;
    }
    //metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + '}';
    }   
}
class Directivo extends Empleado{
    //constructor
    public Directivo(String n){
        super(n);
    }
    //metodos

    @Override
    public String toString() {
        return "Directivo{" + this.getNombre()+'}';
    }
    
}
public class eje8 {
    public static void main(String[] args) {
        Empleado p1=new Empleado("Pedro");
        System.out.println(p1.toString());
        Directivo d1=new Directivo("Jose");
        System.out.println(d1.toString());        
    }
}
