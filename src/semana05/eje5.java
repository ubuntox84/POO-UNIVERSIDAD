/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

/**
 *
 * @author chris
 */
class carro{
    String marca;
    String placa;
    public carro(String ma, String pla){
       this.marca=ma;
       this.placa=pla;
    }
    public carro(carro p){
        this.placa=p.placa;
        this.marca=p.marca;
    }

    @Override
    public String toString() {
        return "carro{" + "marca=" + marca + ", placa=" + placa + '}';
    }
    
}
public class eje5 {
    public static void main(String[] args) {
        carro c1=new carro(new carro("Toyota", "WG433"));
        System.out.println(c1.toString());
    }
}
