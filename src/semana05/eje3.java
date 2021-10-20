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
class perro{
    int x;
    static int y=100;
    public perro(int x){
        this.x=x;
    }
    void agregar(int y){
        this.x+=y;
    }
    void mostrar(){
        System.out.println(this.x);
    }
    static String ValorPI(){
        return String.valueOf(3.1416f);
    }
}
public class eje3 {
    public static void main(String[] args) {
        String cad=perro.ValorPI();
        int r=perro.y;
        System.out.println(cad);
    }
}
