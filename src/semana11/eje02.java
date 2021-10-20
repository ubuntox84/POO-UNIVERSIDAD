/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

/**
 *
 * @author chris
 */
class Alumno{
    String name;
    public Alumno(String n){
        this.name=n;
    }
}
class calificaciones{
    float n1;
    float n2;
    float n3;
    public calificaciones(float a,float b,float c){
        this.n1=a;
        this.n2=b;
        this.n3=c;        
    }
}
class registro{
    Alumno alu;
    calificaciones cali;
    public registro(Alumno a, calificaciones c){
        this.alu=a;
        this.cali=c;
    }
}
public class eje02 {
    public static void main(String[] args) {
        Alumno al=new Alumno("Juan");
        calificaciones ca=new calificaciones(15, 10,14);
        registro reg=new registro(al, ca);
    }
}
