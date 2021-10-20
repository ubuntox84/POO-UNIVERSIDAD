/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03;

/**
 *
 * @author chris
 */
public class eje9 {
    
    String nombre;
    int edad;
    String codigo;
    static int contador;//espacios de memoria que comparten todos los objetos de una clase
    
    void mostrar(){
        String cad="Clase Eje9";
        System.out.println(cad);
    }
    
    public static void main(String[] args) {
        {
            int x=10;
        }
        //System.out.println(x);
    }
}
