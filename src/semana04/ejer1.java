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
class Correo{
    String mail="christian.villegas@udh.edu.pe";
    String password="123456";    
    void mostrar(){
        System.out.println("El correo es:"+mail+" El password: "+password);
    }    
    void verificar(String cad){
        if(password==cad){
            System.out.println("Bienvenido "+mail);
        }else{
            System.out.println("Credenciales erroneas!!");
        }
    }
}
public class ejer1 {
    public static void main(String[] args) {
        Correo c1=new Correo();
        c1.mostrar();
        c1.verificar("123456");
    }
}
