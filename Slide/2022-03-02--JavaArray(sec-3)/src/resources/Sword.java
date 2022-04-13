/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author Subrata Kumar Dey
 */
public class Sword  extends Weapon{
    //additional field: isDoubleEdged, length,...
    private static int swordCount=0;
    public Sword setSword(){
        swordCount++;
        System.out.println(swordCount+"-th Sword is instanciated.");        
        return this;
    }  
    
    public void showSword(){
        //assume the code to print ALL fields of Sword class is here
        System.out.println("Sword info is displayed.");
    }    
    
    @Override
    public void showWeapon(){
        System.out.println("Sword info is displayed.");
    }       
}
