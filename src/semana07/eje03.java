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
class mamifero {

    int nropatas;
    String lugarvive;

    public mamifero(int n, String l) {
        this.nropatas = n;
        this.lugarvive = l;
    }

    String infomamifero() {
        return "Nro patas: " + this.nropatas + " Lugar donde vive: " + this.lugarvive;
    }
}

class perro extends mamifero {

    String raza;
    String color;
    int edad;

    public perro(int n, String l, String r, String c, int e) {
        super(n, l);
        this.raza = r;
        this.color = c;
        this.edad = e;
    }

    String infoperro() {
        return "Raza: " + this.raza + " Color: " + this.color + " Edad: " + this.edad + infomamifero();
    }
}

public class eje03 {

    public static void main(String[] args) {
        perro p1 = new perro(4, "Tierra", "Boxer", "Marron", 15);
        System.out.println(p1.infoperro());
    }
}
