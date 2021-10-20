/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
class persona{
    String name;
    int old;
    char sex;
    public persona(String n, int o, char s){
        this.name=n;
        this.old=o;
        this.sex=s;
    }
    String formato(){
        return this.name+","+this.old+","+this.sex;
    }
    String datos(){
        return "Nombre "+this.name+" Edad: "+this.old+" Sexo: "+this.sex;
    }
}
class procedimiento{
    Scanner sc=new Scanner(System.in);
    ArrayList<persona> lista;
    File archipersona;
    BufferedReader br;
    FileWriter fw;
    public procedimiento(){
        lista=new ArrayList<>();
        archipersona=new File("c:/fichero/listapersona.txt");
    }
    void leer()throws IOException{
        String tempString="";
        if(!archipersona.exists()){
            archipersona.createNewFile();
        }
        br=new BufferedReader(new FileReader(archipersona));
        String cad[];
        tempString=br.readLine();
        while(tempString!=null){
            cad=tempString.split(",");
            lista.add(new persona(cad[0],Integer.parseInt(cad[1]),cad[2].charAt(0)));
            tempString=br.readLine();
        }
        //System.out.println(tempString);
        br.close();
    }
    void escribir()throws IOException{
        fw=new FileWriter(archipersona);
        for(persona p: lista){
            fw.write(p.formato()+"\n");
        }
        fw.close();
    }
    void agregar(persona p){
        lista.add(p);
    }
    void mostrar(){
        System.out.println("");
        for(persona p:lista){
            System.out.println(p.datos());
        }
    }
    void actualizar(int x){
        persona p=lista.get(x);
        String n=p.name;
        int e=p.old;
        char s=p.sex;        
        lista.remove(x);
        System.out.println("Ing. Nuevo Nombre: "+n);
        String name=sc.next();
        System.out.println("Ing. Nuevo Edad: "+e);
        int edad=sc.nextInt();
        System.out.println("Ing. Nuevo Sexo: "+s);
        char sexo=sc.next().charAt(0);
        agregar(new persona(name,edad,sexo));
        
    }
}
public class eje5 {
    public static void main(String[] args)throws IOException{
        procedimiento p=new procedimiento();
        Scanner sc=new Scanner(System.in);
        p.leer();
        int op;
        boolean band=true;
        do{
            System.out.println("Que desea realizar: [1] agregar\t [2] mostrar \t [3] actualizar \t[0] Salir");
            op=sc.nextInt();
            switch(op){
                case 1: {
                    System.out.println("Ing. Nombre: ");
                    String name=sc.next();
                    System.out.println("Ing. Edad: ");
                    int edad=sc.nextInt();
                    System.out.println("Ing. Sexo: ");
                    char sexo=sc.next().charAt(0);
                    p.agregar(new persona(name,edad,sexo));
                    break;
                }
                case 2: {
                    p.mostrar();
                    break;
                }
                case 3: {
                    p.mostrar();
                    System.out.println("Que desea modificar, indicar la posicion");
                    int o=sc.nextInt();
                    p.actualizar(o);
                    break;
                }
                case 4: {
                    band=false;
                    p.escribir();
                    break;
                }default:System.out.println("Caracter desconocido!!!");
            }
        }while(band);
        System.out.println("Hasta pronto!!");

        
    }
}
