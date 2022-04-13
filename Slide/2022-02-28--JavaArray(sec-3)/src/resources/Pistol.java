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
public class Pistol  extends Weapon{
    //additional field: magazineCapacity, calibar
    private static int pistolCount=0;
    public Pistol setPistol(){
        pistolCount++;
        System.out.println(pistolCount+"-th Pistol is instanciated.");        
        return this;
    }
    
    public void showPistol(){
        //assume the code to print ALL fields of Pistol class is here
        System.out.println("Pistol info is displayed.");
    } 
    
    
    @Override
    public void showWeapon(){
        System.out.println("Pistol info is displayed.");
    }    
  
}
