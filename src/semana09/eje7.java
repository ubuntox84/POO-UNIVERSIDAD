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
interface conectar{
    void abrir();
    void cerrar();    
}
class dbmaria implements conectar{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
}
class Cassandra implements conectar{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
}
class h2 implements conectar{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
}
class oracle implements conectar{
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
}
public class eje7 {
    public static void main(String[] args) {
        conectar conn=new oracle();
        if(conn instanceof dbmaria){            
        }
        if(conn instanceof Cassandra){            
        }
        if(conn instanceof h2){            
        }
        if(conn instanceof oracle){            
        }
        
    }
}
