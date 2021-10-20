/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

/**
 *
 * @author chris
 */
class hilo implements Runnable{
    String name;
    int nuex;
    public hilo(String x){
        this.name=x;
        this.nuex=0;
    }
    public void run(){
        while(true){
            System.out.println("Soy el thread "+this.name+" ejecutando "+ ++this.nuex+" veces.");
        }        
    }    
}

public class eje3 {
    public static void main(String[] args) {
        hilo h1=new hilo("1");
        hilo h2=new hilo("2");
        hilo h3=new hilo("3");
        
        Thread t1=new Thread(h1);
        Thread t2=new Thread(h2);
        Thread t3=new Thread(h3);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
