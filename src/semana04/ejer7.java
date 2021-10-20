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
class Carro{
    private String marca;
    private String placa;
    private String color;

    public Carro(){
        this.marca = "";
        this.placa="";
        this.color="";
    }
    public Carro(String marca) {
        this.marca = marca;
        this.placa="";
        this.color="";
    }

    public Carro(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
        this.color="";
    }

    public Carro(String marca, String placa, String color) {
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }
    
    
    
}
public class ejer7 {
    public static void main(String[] args) {
        Carro c1=new Carro("Toyota");
        Carro c2=new Carro("Hunday", "wz405");
        Carro c3=new Carro("Honda", "Wx108", "Rojo");
        Carro c4=new Carro();
    }
}
