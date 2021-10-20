/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

/**
 *
 * @author chris El siguiente programa muestra la sincronización al controlar el
 * acceso a un método llamado sumArray(), que suma los elementos de una matriz
 * de enteros.
 */
class sumArray {

    private int sum;

    //sumArray está sincronizado
    synchronized int sumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Total acumulado de " + Thread.currentThread().getName() + " es " + sum);
            try {
                Thread.sleep(10);//permitir el cambio de tarea
            } catch (InterruptedException exc) {
                System.out.println("Hilo interrumpido");
            }
        }
        return sum;
    }
}

class MiHilo implements Runnable {

    Thread hilo;
    static sumArray sumarray = new sumArray();
    int a[];
    int resp;

    //Construye un nuevo hilo.
    MiHilo(String nombre, int nums[]) {
        hilo = new Thread(this, nombre);
        a = nums;
    }

    //Un método que crea e inicia un hilo
    public static MiHilo creaEInicia(String nombre, int nums[]) {
        MiHilo miHilo = new MiHilo(nombre, nums);

        miHilo.hilo.start(); //Inicia el hilo
        return miHilo;
    }

    //Punto de entrada del hilo
    public void run() {
        int sum;
        System.out.println(hilo.getName() + " iniciando.");

        resp = sumarray.sumArray(a);
        System.out.println("Suma para " + hilo.getName() + " es " + resp);
        System.out.println(hilo.getName() + " terminado.");
    }
}

public class eje05 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        MiHilo h1 = MiHilo.creaEInicia("#1", a);
        MiHilo h2 = MiHilo.creaEInicia("#2", a);
        //System.out.println("hola");
        try {
            h1.hilo.join();
            h2.hilo.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrunpido!!");
        }
    }
}
