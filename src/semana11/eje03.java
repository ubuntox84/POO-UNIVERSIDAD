/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author chris
 */
public class eje03 {
    public static void main(String[] args) {
        Vector<Integer> vect=new Vector<>(20);
        for (int i = 5; i < 11; i++) {
            vect.addElement(2*i);
        }
//        for (int i = 0; i < vect.size(); i++) {
//            System.out.println(vect.elementAt(i));
//        }
//        for(Integer x:vect){
//            System.out.println(x);
//        }
        vect.insertElementAt(22, 3);

        Iterator t=vect.iterator();
        while(t.hasNext()){
            System.out.println(t.next());
        }
    }
}
