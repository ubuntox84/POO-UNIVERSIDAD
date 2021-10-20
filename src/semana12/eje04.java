/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

import java.util.Random;

/**
 *
 * @author chris
 */
class hilos implements Runnable{
    String name;
    int numex;
    int cant;
    public hilos(String n,int c){
        this.name=n;
        this.cant=c;
    }
    public void run(){
        Random rd=new Random();
        int total=0;
        double T=System.currentTimeMillis();
        for (int i = 0; i < this.cant; i++) {
            total+=rd.nextInt(20);
        }
        System.out.println("El promedio de "+this.cant+ " numeros fue: "+(total/this.cant)+" tardo "
                +(System.currentTimeMillis()-T/1000));
    }
}
public class eje04 {
    public static void main(String[] args) {
        hilos h1=new hilos("1", 300000000);
        hilos h2=new hilos("2", 200);
        hilos h3=new hilos("3", 50000000);
        
        Thread t1=new Thread(h1);
        Thread t2=new Thread(h2);
        Thread t3=new Thread(h3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
