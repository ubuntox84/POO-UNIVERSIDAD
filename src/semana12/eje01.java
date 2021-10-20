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
class paquete extends Thread{
    public paquete(String msn){
        super(msn);
    }
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName());
        }
    }
}
public class eje01 {
    public static void main(String[] args) {
        paquete hilo1=new paquete("PROCESO1");
        paquete hilo2=new paquete("PROCESO2");
        
        hilo1.start();
        hilo2.start();
    }
}
