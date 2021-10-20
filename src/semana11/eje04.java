/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author chris
 */
class persona{
    String name;
    String spell;
    public persona(String n, String s){
        this.name=n;
        this.spell=s;
    }
    String mostrar(){
        return "Nombre: "+this.name+"\t Apellidos: "+this.spell;
    }
}
class cola{
    Queue<persona> lista;
    public cola(){
        lista=new LinkedList<persona>();
    }
    void meter(persona p){
        lista.offer(p);
    }
    void sacar(){
        if(lista.size()!=0){
            lista.poll();
        }else{
            System.out.println("No existe mas elementos!!");
        }       
    }
    void mostrra(){
        for(persona p:lista){
            System.out.println(p.mostrar());
        }
    }
}
public class eje04 {
    public static void main(String[] args) {
        cola col=new cola();
        col.meter(new persona("Juan","Garcia"));
        col.meter(new persona("Manuel","Rico"));
        col.meter(new persona("Maria","Dolores"));
        col.meter(new persona("Marco","Vasquez"));
        col.mostrra();
        System.out.println("\n");
        persona p=col.lista.peek();
        System.out.println(p.mostrar());
        
//        col.sacar();
//        col.sacar();
//        col.sacar();
//        col.sacar();
//        col.sacar();
//        col.mostrra();
    }
}
