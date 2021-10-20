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
public class eje1 {
    public static void main(String[] args) throws IOException{
        FileInputStream entrada=null;
        FileOutputStream salida=null;
        File intro, exit;
        try{
            intro=new File("c:/fichero/input.txt");
            exit=new File("c:/fichero/output.txt");
            if(!intro.exists()&!exit.exists()){
                intro.createNewFile();
                exit.createNewFile();
            }
            entrada=new FileInputStream(intro);
            salida=new FileOutputStream(exit);
            int i;
            while((i=entrada.read())!=-1){
                System.out.print((char)i);
                salida.write(i);
            }
        }catch(IOException ioex){
            System.out.println(ioex.getMessage());
        }finally{
            if(entrada!=null){
                entrada.close();
            }
            if(salida!=null){
                salida.close();
            }
        }
    }
}
