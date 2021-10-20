/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 *
 * @author chris
 */
public class eje08 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<Integer>();
        lista.add(5);
        lista.add(4);
        lista.add(5);
        lista.add(3);
        lista.add(5);
        lista.add(2);
        lista.add(5);
        lista.add(7);
        ListIterator <Integer> t=lista.listIterator();
        while(t.hasNext()){
            System.out.print(t.next()+" ");
        }
    }
}
