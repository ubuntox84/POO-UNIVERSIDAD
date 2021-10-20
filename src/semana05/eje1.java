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
class figura{
    private int x;
    private int y;
    private String color;
    //constructor
    public figura(int a,int b, String c){
        this.x=a;
        this.y=b;
        this.color=c;
    }
    public figura(String c){
        this.x=this.y=0;
        this.color=c;
    }
    public figura(int x, int y) {
        this.x = x;
        this.y = y;
        this.color="";
    }

    @Override
    public String toString() {
        return "figura{" + "x=" + x + ", y=" + y + ", color=" + color + '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
public class eje1 {
    public static void main(String[] args) {
        figura f1=new figura(10, 20, "Rojo");
        figura f2=new figura("Verde");
        f2.setX(55);
        f2.setY(20);
        figura f3=new figura(45,70);
        f3.setX(80);
        f3.setColor("Morado");
        System.out.println(f1.getColor());
        System.out.println(f2.getColor());
        System.out.println(f3.getColor());
    }
}
