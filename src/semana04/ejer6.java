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
class fruta{
    private String name;
    private float peso;

    public fruta(String name, float peso) {
        this.name = name;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
public class ejer6 {
    public static void main(String[] args) {
        fruta f1=new fruta("PERA", 5);
        System.out.println("Mercado de frutas: "+f1.getName()+ " Kilos: "+f1.getPeso());
    }
}
