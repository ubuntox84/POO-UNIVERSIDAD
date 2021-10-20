/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

/**
 *
 * @author chris
 */
interface conectar{
    void estado();
}
interface configuracion{
    void ConBasico();
}
interface mysql extends conectar, configuracion{
    void conectar();
}
class baseDatos implements mysql{
     public void conectar(){
         
     }
     public void ConBasico(){
         
     }
     public void estado(){
        
    }
}
public class eje01 {
    public static void main(String[] args) {
        baseDatos db=new baseDatos();
        db.ConBasico();
    }
}
