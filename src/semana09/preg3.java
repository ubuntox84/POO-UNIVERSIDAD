/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

/**
 *
 * @author chris
 */
abstract class bebida{
    abstract void vender();
    abstract void comprar();    
}
class ron extends bebida{
    String presentacion;
    float precio;
    public ron(String p, float pe){
        this.presentacion=p;
        this.precio=pe;
    }
    void vender(){
        
    }
    void comprar(){
        
    }
    @Override
    public String toString() {
        return "ron{" + "presentacion=" + presentacion + ", precio=" + precio + '}';
    }
    
}
public class preg3 {
    public static void main(String[] args) {
        ron r1=new ron("Lata", 15);
        ron r2=new ron("Botella", 25);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
