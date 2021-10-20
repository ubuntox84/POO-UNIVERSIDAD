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
class valor<d>{
    d x;
    d y;
    public valor(d x, d y) {
        this.x = x;
        this.y = y;
    }
    public d getX() {
        return x;
    }
    public void setX(d x) {
        this.x = x;
    }
    public d getY() {
        return y;
    }
    public void setY(d y) {
        this.y = y;
    }    
}
public class eje09 {
    public static void main(String[] args) {
        valor<Integer> v1=new valor(5,8);
        valor<String> v2=new valor("5","8");
        valor<Double> v3=new valor(7d,4d);
    }
}
