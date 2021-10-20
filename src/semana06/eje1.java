/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06;

/**
 *
 * @author chris
 */

class verduras{
    String name;
  String sabor;
  String color;
  String tipo_de_vitamina;
  int num_verduras;
    public verduras(String n,String sabor, String color, String tipo_de_vitamina, int num_verdura) {
        this.sabor = sabor;
        this.color = color;
        this.tipo_de_vitamina = tipo_de_vitamina;
        this.num_verduras = num_verduras;
        this.name=n;
    }
   void mostrar(){
       System.out.println("LA VERDURA TIENE UN :"+this.name+" SU SABOR "+this.sabor+" SU TIPO DE VITAMINA "+this.tipo_de_vitamina+" ES DE COLOR "+this.color);
   }
}
public class eje1 {
    public static void main(String[] args) {
        verduras p1=new verduras("TOMATE","SALADO","ROJO","VITAMINA C",2);
        p1.mostrar();
    }
}
