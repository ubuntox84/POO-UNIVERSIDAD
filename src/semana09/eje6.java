/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

/**
 *
 * @author chris
 */
class motocar{
    motriz mo;
    parlantes es;
    public motocar(String m, String c) {
        this.mo=new motriz(m);
        this.es=new parlantes(c);
    }    
}
class motriz{
    String serie;
    public motriz(String serie) {
        this.serie = serie;
    }  
}
class parlantes{
    String capacidad;
    public parlantes(String capacidad) {
        this.capacidad = capacidad;
    }   
}
public class eje6 {
    public static void main(String[] args) {       
        motocar m1=new motocar("zw15078", "200w");
    }
}
