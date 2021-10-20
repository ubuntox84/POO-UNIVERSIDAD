/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author chris
 */
public class eje2 {
    
    public static void main(String[] args)throws IOException{
        FileOutputStream salida=null;
        File exit;
        try {
            exit=new File("c:/fichero/output.txt");
            salida=new FileOutputStream(exit);
            String contenido="UDH Curso de POO";
            String facul=",Informatica";
            String Cursos= ",POO";
            salida.write(contenido.getBytes());
            salida.write(facul.getBytes());
            salida.write(Cursos.getBytes());
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            salida.close();
                   }
        
    }
}
