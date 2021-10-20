/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08;

/**
 *
 * @author chris
 */
interface Conexion{
    void abrir();
    void cerrar();
    void estado();
}
interface JDBC{
    default String mostrar(){
        return "";
    }
}
class Conectar implements Conexion, JDBC{
    String cadena;
    String driver;
    public Conectar(String c, String d){
        this.cadena=c;
        this.driver=d;
    }
    
    public void abrir(){
        
    }
    public void cerrar(){
        
    }
    public void estado(){
        
    }
}
class oracle extends Conectar{
    String user;
    String pass;
    public oracle(String c, String d,String u, String p){
        super(c,d);
        this.user=u;
        this.pass=p;
    }
    void select(){
        
    }
    void update(){
        
    }
}
class Mysql extends Conectar{
    String user;
    String pass;
    public Mysql(String c, String d,String u, String p){
        super(c,d);
        this.user=u;
        this.pass=p;
    }
    void select(){
        
    }
    void update(){
        
    }
}
public class eje1 {
    
}
