/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

/**
 *
 * @author chris
 */
class emmpleado{
    String nombre;
    
    public emmpleado(String n){
        this.nombre=n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "emmpleado{" + "nombre=" + nombre + '}';
    }
    
}
class Operario extends emmpleado{
    public Operario(String n){
        super(n);
    }
    @Override
    public String toString(){
        return "emmpleado{" + "nombre=" + nombre + '}';
    }
}
class Directivo extends emmpleado{
    public Directivo(String n){
        super(n);
    }
    @Override
    public String toString(){
        return "emmpleado{" + "nombre=" + nombre + '}';
    }
}
class oficial extends Operario{
    public oficial(String n){
        super(n);
    }
    @Override
    public String toString(){
        return "emmpleado{" + "nombre=" + nombre + '}';
    }
}
class tecnico extends Operario{
    public tecnico(String n){
        super(n);
    }
    @Override
    public String toString(){
        return "emmpleado{" + "nombre=" + nombre + '}';
    }
}

public class eje05 {
    public static void main(String[] args) {
        tecnico t1=new tecnico("Juan");
        System.out.println(t1.toString());
    }
}
