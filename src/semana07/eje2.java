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
class person{
    String name;
    String dni;
    public person(String n, String d){
        this.name=n;
        this.dni=d;
    }
    final String informacionPerson(){
        return "Nombre: "+this.name+" DNI: "+this.dni;
    }
}
class student extends person{
    String code;
    public student(String n, String d, String c){
        super(n,d);
        this.code=c;
    }
    String informacionStudent(){
        return "Nombre: "+this.name+" DNI: "+this.dni+" Codigo: "+this.code;
    }
}
public class eje2 {
    public static void main(String[] args) {
        student s1=new student("Juan", "00254121", "20130471");
        System.out.println(s1.informacionStudent());
        System.out.println(s1.informacionPerson());
    }
}
