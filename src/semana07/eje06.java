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
abstract class habitacion{
    int x;
    int y;
    int z;
    public habitacion(int a, int b){
        this.x=a;
        this.y=b;
    }
    abstract void baño();
    abstract void cocina();
    abstract void sala();
}
class cuartos extends habitacion{
    public cuartos(int a, int b){
        super(a,b);
    }
    void baño(){
        
    }
    void cocina(){
        
    }
    void sala(){
        
    }
}
public class eje06 {
    public static void main(String[] args) {
        cuartos c1=new cuartos(10, 20);
        //c1.
    }
}
