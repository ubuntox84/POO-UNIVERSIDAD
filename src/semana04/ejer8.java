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
class joven{
    //Variables de instancia
    int edad;
    String name;
    //variable de clase
    static int contador=0;
    public joven(){
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        joven.contador = contador;
    }
    
}
public class ejer8 {
    public static void main(String[] args) {
        joven j1=new joven();
        joven j2=new joven();
        j2.setContador(100);
        joven j3=new joven();
        joven j4=new joven();
        joven j5=new joven();
        System.out.println(j5.getContador());
    }
}
