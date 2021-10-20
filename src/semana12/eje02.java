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
class proceso implements Runnable{
    String name;
    public proceso(String n){
        this.name=n;
    }
    public void run(){
        System.out.println(this.name);
    }
}
public class eje02 {
    public static void main(String[] args) {
        proceso p1=new proceso("Proceso1");
        proceso p2=new proceso("Proceso2");
        
        Thread nuevoh1=new Thread(p1);
        Thread nuevoh2=new Thread(p2);
        nuevoh1.start();
        nuevoh2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(".");
            if(i%2==0) 
                try{
                    nuevoh1.sleep(100);
                }catch(InterruptedException exc){
                    System.out.println("Hilo interrumpido!!!");
                }
                
        }
        
        
        
    }
}
