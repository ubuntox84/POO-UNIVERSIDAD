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
class automovil{
    Motor mo;
    Estereo es;
    public automovil(Motor m, Estereo e) {
        this.mo=m;
        this.es=e;
    }    
}
class Motor{
    String serie;
    public Motor(String serie) {
        this.serie = serie;
    }  
}
class Estereo{
    String capacidad;
    public Estereo(String capacidad) {
        this.capacidad = capacidad;
    }   
}
public class eje2 {
    public static void main(String[] args) {
        Motor m=new Motor("zw15078");
        Estereo e=new Estereo("200w");
        automovil m1=new automovil(m, e);
    }
}
