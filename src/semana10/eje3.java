/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chris
 */
public class eje3 {
    public static void main(String[] args)throws IOException{
        File intro;
        FileInputStream entrada=null;
        BufferedReader br=null;
        try {
            intro=new File("c:/fichero/output.txt");
            entrada=new FileInputStream(intro);
            br=new BufferedReader(new InputStreamReader(entrada));
            String firtline=br.readLine();
            String cad[]=firtline.split(",");
            System.out.println(cad[0]);
            System.out.println(cad[1]);
            System.out.println(cad[2]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            br.close();
            entrada.close();
        }
        
    }
}
