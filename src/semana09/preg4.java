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
interface pago{
    void totalpago();
}
interface retiro{
    void totalretiro();
}
abstract class drink implements pago, retiro{
    abstract void vender();
    abstract void comprar();    
}
class vodka extends drink{
    String presentacion;
    float precio;
    public vodka(String p, float pe){
        this.presentacion=p;
        this.precio=pe;
    }
    public vodka(String p){
        this.presentacion=p;
        this.precio=0;
    }
    public vodka(){
        this.presentacion="";
        this.precio=0;
    }
    void vender(){
        
    }
    void comprar(){
        
    }
    @Override
    public String toString() {
        return "ron{" + "presentacion=" + presentacion + ", precio=" + precio + '}';
    }
    @Override
    public void totalpago(){
        
    }
    @Override
    public void totalretiro(){
        
    }
}
public class preg4 {
    public static void main(String[] args) {
        vodka r1=new vodka("Lata", 15);
        vodka r2=new vodka("Botella", 25);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        r1.totalpago();
        r1.totalretiro();
        
    }
}
