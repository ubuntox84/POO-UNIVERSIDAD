/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08;

/**
 *
 * @author chris
 */
abstract class Persona{
    String name;
    int edad;
    public Persona(String n, int e){
        this.name=n;
        this.edad=e;
    }
    String mostrarPerona(){
        return "Nombre: "+this.name+" Edad: "+this.edad;
    }
}
class estudiante extends Persona{
    String codigo;
    String facultad;
    public estudiante(String n, int e, String c, String f){
        super(n,e);
        this.codigo=c;
        this.facultad=f;
    }
    String mostrar(){
        return "Codigo: "+this.codigo+" Facultad: "+this.facultad+" "+mostrarPerona();
    }
}
class Administrativo extends Persona{
    String codigo;
    public Administrativo(String n, int e, String c){
        super(n,e);
        this.codigo=c;
    }
    String mostrar(){
        return "Codigo: "+this.codigo+" "+mostrarPerona();
    }
}
public class eje2 {
    public static void main(String[] args) {
        estudiante e1=new estudiante("Juan", 23, "00020200103", "Sistemas");
        Administrativo a1=new Administrativo("Juan", 23, "000015321");
        System.out.println(e1.mostrar());
        System.out.println(a1.mostrar());
    }
}
