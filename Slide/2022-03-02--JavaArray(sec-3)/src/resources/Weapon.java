package resources;

public abstract class Weapon {
    //common fields for all subclasses
    //manufacName, price, dateOfPurchase, serialNo
    //protected int x=12;
    /*
    public void showWeapon(){
        //displays only common fields
    }
    */
    public abstract void showWeapon();
    //public void showWeapon();
    
    final public void showWeaponSerialNo(){
        //...
    }
    
    
}
