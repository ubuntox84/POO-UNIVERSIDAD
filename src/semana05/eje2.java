/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

/**
 *
 * @author chris
 * //instancia
 * //clase
 */
class punto{
    private int x;
    private int y;
    static int p;
    public punto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getP() {
        return p;
    }

    public static void setP(int p) {
        punto.p = p;
    }
    
}
public class eje2 {
    public static void main(String[] args) {
        punto p1=new punto(15, 15);
        punto p2=new punto(5, 20);
        punto p3=new punto(15, 2);
        punto p4=new punto(8, 15);
        System.out.println(p1.getX()+" "+p1.getY()+" "+p1.p);
        p1.p=15;
        System.out.println(p2.getX()+" "+p2.getY()+" "+p2.p);
    }
}
