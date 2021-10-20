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
class ciudad{
    TreeSet<arbol> ar;
    TreeSet<carro> ca;
    public ciudad (TreeSet<arbol> a,TreeSet<carro> ca){
        this.ar=a;
        this.ca=ca;
    }}
class arbol{
    String tipo;
   public arbol(String tipo){
       this.tipo=tipo;
   }}
class carro{
    String marca;
    public carro (String marca){
        this.marca = marca;
    }}
public class eje4 {
    public static void main(String[] args) {
         TreeSet<arbol> a=new TreeSet<arbol>();
         TreeSet<carro> c=new TreeSet<carro>();
         ciudad ca=new ciudad(a, c);
    }}