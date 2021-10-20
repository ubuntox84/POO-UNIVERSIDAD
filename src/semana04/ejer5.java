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
class Persona{
  private String name;
  private String dni;
  private int old;
  //constructor
  public Persona(String n, int o){
    this.name=n;
    this.dni="";
    this.old=o;
  }
  ///GET - SET
  String getdni(){
      return this.dni;
  }
  void setdni(String x){
      this.dni=x;
  }
  
  int getold(){
      return this.old;
  }
  void setold(int x){
      this.old=x;
  }
  //metodos
  void mostrar(){
    System.out.println("Nombre:"+this.name+" DNI: "
    +this.dni+ " Edad: " +this.old);
  }
}

public class ejer5 {
    public static void main(String[] args) {
      Persona p1=new Persona("Juan",68);
      p1.setdni("12345678");
      p1.setold(20);
      Persona p2=new Persona("Maria",68);
      p2.setdni("98765432");
      Persona p3=new Persona("Victoria",68);
      p3.setdni("15975321");
      p1.mostrar();
      p2.mostrar();
      p3.mostrar();
    }
}