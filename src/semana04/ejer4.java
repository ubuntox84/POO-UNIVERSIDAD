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
class Figura
{    int puntoA;
    int puntoB;
    //constructor
    public Figura(int x,int y){
        this.puntoA=x;
        this.puntoB=y;
    }
    //metodos
    void mostrar(){
        System.out.println("A: "+this.puntoA+ " B: "+this.puntoB);
    }
}
public class ejer4 {
    public static void main(String[] args) {
        Figura f1=new Figura(15, 10);//mi primer objeto
        Figura f2=new Figura(5, 2);
        Figura f3=new Figura(20, 0);
        f1.mostrar();
        f2.mostrar();
        f3.mostrar();
        
    }
}
