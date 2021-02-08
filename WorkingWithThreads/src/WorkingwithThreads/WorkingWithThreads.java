/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingwithThreads;

/**
 *
 * @author SHEKHAR
 */
class TClass extends Thread{
public void run(){
System.out.println("Hello world");
}
}

public class WorkingWithThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TClass obj = new TClass();
        obj.start();
    }
    
}
