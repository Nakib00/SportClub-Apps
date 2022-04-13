package mainpkg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import resources.Granade;
import resources.Pistol;
import resources.Sword;
import resources.Weapon;
import users.Employee;
import users.Person;
import users.Student;
//import users.Employee;

public class MainClass {    
    
    /*
    public static void main(String[] args) {
        
        Employee raju = new Employee();
        
        
        Person p1, p2 = new Person();
        p2.showPersonInfo();
        
        p1 = new Student();
        
        Student shafiq, asif = new Student();
        String str;
        
        //System.out.println("Info of asif: ");
        //asif.showStudInfo();
        System.out.println("Info of asif: "+asif);
        str = asif.toString();
        System.out.println("String equivalent of asif = "+str);
        
        System.out.println();
        
        shafiq= new Student(123, "Shafiq Ahmed", "Male", "O+", 3.56f);
        System.out.println("Info of shafiq: ");
        System.out.println(shafiq);
        str = shafiq.toString();
        System.out.println("String equivalent of shafiq = "+str);
        
        
        
    }
    */
        public static void main(String[] args) {
               
        ArrayList<Weapon> wList = new ArrayList<Weapon>();
        Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter [1] to add a Granade");
            System.out.println("Enter [2] to add a Pistol");
            System.out.println("Enter [3] to add a Sword");
            System.out.println("Enter [4] to view ALL Weapons");
            System.out.println("Enter [5] to view ALL Granades");
            System.out.println("Enter [6] to view ALL Pistols");
            System.out.println("Enter [7] to view ALL Swords");
            System.out.println("Enter [8] to .......");
            System.out.println("Enter [9] to ..........");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            
            switch(choice){
                case 1:
                    //Granade g = new Granade(...,...,....); wArr[currentIndex++]=g;
                    //Granade g = new Granade(); g.setGranade(); wArr[currentIndex++]=g;
                    //wArr[currentIndex++] =  new Granade(..,...,...);
                    
                    //Granade g = new Granade();
                    //g.setGranade();
                    //wList.add(g);
                    
                    wList.add(new Granade().setGranade());
                    System.out.println("The new Granade is successfully added to the weapon armour.");
                    break;
                case 2:
                    wList.add(new Pistol().setPistol());
                    System.out.println("The new Pistol is successfully added to the weapon armour.");
                    break;
                case 3:
                    wList.add(new Sword().setSword());
                    System.out.println("The new Sword is successfully added to the weapon armour.");                    
                    break;
                case 4:
                    for(int i=0;i<wList.size();i++){
                        if(wList.get(i) instanceof Granade )
                            ( (Granade)wList.get(i) ).showGranade();
                        else if(wList.get(i) instanceof Pistol )
                            ( (Pistol)wList.get(i) ).showPistol();
                        
                        else if(wList.get(i) instanceof Sword )
                            ( (Sword)wList.get(i) ).showSword();
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    /*
                    int i;
                    for(i=0; i<wList.size(); i++){
                        if(wList.get(i) instanceof Granade)
                            ((Granade)wList.get(i)).showGranade();
                        if(wList.get(i) instanceof Pistol)
                            ((Pistol)wList.get(i)).showPistol();
                        if(wList.get(i) instanceof Sword)
                            ((Sword)wList.get(i)).showSword();                        
                    }
                    */
                    /*
                    //Better than regular for loop
                    //Still No polymorphic behaviour acheived
                    for(Weapon w: wList){
                        if(w instanceof Granade)
                            ((Granade)w).showGranade();
                        if(w instanceof Pistol)
                            ((Pistol)w).showPistol();
                        if(w instanceof Sword)
                            ((Sword)w).showSword();                                                
                    }
                    */

                    for(Weapon w: wList){                    
                            w.showWeapon();
                    }                    
                    break;
                case 5:
                    for(Weapon w: wList){                    
                            if(w instanceof Granade) w.showWeapon();
                    }                                        
                    break;
                case 6:
                    for(Weapon w: wList){                    
                            if(w instanceof Pistol) w.showWeapon();
                    }                                                            
                    break;
                case 7:
                    for(Weapon w: wList){                    
                            if(w instanceof Sword) w.showWeapon();
                    }                                                            
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
            
            
        }while (choice!=10);
        
    }

    
}

