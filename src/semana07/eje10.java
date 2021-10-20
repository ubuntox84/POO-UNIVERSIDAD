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
final class Caja{
    final int x=10;
    int y;
    void abrir(){
        System.out.println("Abierto");
    }
    final void cerrar(){
        System.out.println("Cerrado");
    }
}
class box {
    
    void abrir(){
        System.out.println("Cerrado");
    }
}
public class eje10 {
    public static void main(String[] args) {
        Caja c1=new Caja();
        //c1.x=50;
    }
}
