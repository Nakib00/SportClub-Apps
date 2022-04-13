package resources;

public class Granade extends Weapon{
    //additional field: explosionCapacity, timerDelay
    //public void setGranade(){
    private static int granadeCount=0;
    public Granade setGranade(){
    //public void setGranade(){
        //set value for other fields...
        granadeCount++;
        System.out.println(granadeCount+"-th Granade is instanciated.");        
        return this;
    }
    public void showGranade(){
        //assume the code to print ALL fields of Granade class is here
        System.out.println("Granade info is displayed.");
    }    
    
    @Override
    public void showWeapon(){
        System.out.println("Granade info is displayed.");
        //all fields of Granade are displayed
    } 
    
    /*
    @Override
    void showWeaponSerialNo(){  //Not allowed to override as its afinal method of Weapon class
        //...
    }
    */
}
