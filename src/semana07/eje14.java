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
interface conexion{
    int x=100;
    float pi=3.1416f;
    void conectar();
    void desconectar();
    void estado();
}
interface connect{
    void cadena();
}
interface mysql extends conexion,connect{
    
}
public class eje14 {
    
}
