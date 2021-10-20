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
class daddy{
    int x;
    
    public daddy(int x){
        this.x=x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
class mon extends daddy{
    int y;
    
    public mon(int x,int y){
        super(x);
        this.y=y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }    
    
}
class son extends mon{
    public son(int x,int y){
        super(x,y);
    }
    int suma(){
        return this.getX()+this.getY();
    }
    int resta(){
        return this.getX()-this.getY();
    }
    int multiplicar(){
        return this.getX()*this.getY();
    }
}
public class eje04 {
    public static void main(String[] args) {
        son s1=new son(5, 4);
        System.out.println(s1.suma());
        System.out.println(s1.resta());
        System.out.println(s1.multiplicar());
    }
}
