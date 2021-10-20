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
class peru{
    int x,y;

    @Override
    public String toString() {
        return "peru{" + "x=" + x + ", y=" + y + '}';
    }
    
}
public class eje13 {
    public static void main(String[] args) {
        peru p1=new peru();
        peru p2=new peru();
        System.out.println(p1.toString());
    }
}
