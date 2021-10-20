/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

/**
 *
 * @author chris
 */
interface ave{
    void comer();    
}
interface anadar{
    void nadar();
}
interface avolar{
    void volar();
}
class loro implements ave,avolar{
    public void volar(){
        
    }
    public void comer(){
        
    }    
}
class tukan implements ave, avolar{
    public void volar(){
        
    }
    public void comer(){
        
    }
}
class pinguino implements ave, anadar{
    public void comer(){
        
    }
    public void nadar(){
        
    }
}
public class eje8 {
    
}
