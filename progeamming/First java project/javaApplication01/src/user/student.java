package user;

import java.util.Scanner;

public class student {
    private int id; private String name; private float cgpa;

    // constructor
    public student(int i, String string, float f) {
        id = i; name = string; cgpa =f;
    }


    public void getstudentinfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Id:");
        id=s.nextInt();
        s.nextLine();
        System.out.println("Enter Name:");
        name=s.nextLine();
        System.out.println("Enter CGPA:");
        cgpa=s.nextFloat();
    }

    public void showstudentinfo(){
        System.out.println("Student Information"); 
        System.out.println("Id:"+id+" Name:"+name+" CGPA:"+cgpa);
    }
}
