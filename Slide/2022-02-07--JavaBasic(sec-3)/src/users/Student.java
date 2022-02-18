package users;

import java.util.Scanner;

public class Student {   
    //int id; String name; float cgpa;    //package
    private int id; 
    private String name; 
    private float cgpa; 

    public Student(){
        id=0; name="TBA"; cgpa=0.0f;
    }

    public Student(int x, String str, float f){
        id=x; name=str; cgpa=f;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
    
    
    //void doSomeInStudent(){ //package
    public void doSomeInStudent(){ //package
        //Employee rafiq;
    }
    
    public void setStudentInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id:");
        id = s.nextInt();  
        s.nextLine();
        System.out.print("Enter Name:");
        name = s.nextLine();
        System.out.print("Enter cgpa:");
        cgpa = s.nextFloat();       
    }
    public void showStudentInfo(){
        System.out.println("ID="+id+", Name="+name+", Cgpa="+cgpa);
    } 
}
