/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

/**
 *
 * @author chris
 */
class padre{
    int x;
    int y;
    //constructor
    public padre(int a,int b){
        this.x=a;
        this.y=b;
    }
    int suma(){
        return x+y;
    }    
}
class hija extends padre{
    int z;
    public hija(int pa, int pb, int z){
        super(pa,pb);
        this.z=z;
    }
    String mostrar(){
        return "X: "+this.x+" Y: "+this.y+" z: "+this.z;
    }
}
public class eje7 {
    public static void main(String[] args) {
        hija h1=new hija(5, 4, 2);
        System.out.println(h1.mostrar());
    }
}
