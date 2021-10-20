/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

/**
 *
 * @author chris
 */
class persona{
    String name;
    String dni;
    //metodo
    String informacion(){
        return this.name+this.dni;
    }
}
class alumno extends persona{
    String codigo;
    String facultad;
}
public class eje01 {
    public static void main(String[] args) {
        alumno a1=new alumno();
        a1.informacion();
        a1.dni="015253";
    }
}
