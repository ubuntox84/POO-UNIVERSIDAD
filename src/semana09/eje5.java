/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

import java.util.TreeSet;

/**
 *
 * @author chris
 */
class city{
    TreeSet<tree> ar=new TreeSet<>();
    TreeSet<car> ca=new TreeSet<>();
    public city (tree a,car c){
        ar.add(a);
        ca.add(c);
    }}
class tree{
    String tipo;
   public tree(String tipo){
       this.tipo=tipo;
   }}
class car{
    String marca;
    public car (String marca){
        this.marca = marca;
    }}
public class eje5{
    public static void main(String[] args) {  
        tree t1=new tree("Arbol1");
        car c1=new car("carro1");
         city ca=new city(t1, c1);
    }}