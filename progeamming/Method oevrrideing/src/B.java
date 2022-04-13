
public class B extends A{
    int x = 5;
    
    void display(){
        //System.out.println("X= "+x);
        
        //for super keyword it's show the super class value
        System.out.println(super.x);        
    }
    
    // Oberride A class Mathod from B class
    @Override
    void displayIts(){
        System.out.println("Inside from Class B");
    }
}
