package mainpkg;

import java.util.Random;
import users.Student;
//import users.Employee;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //ClassD obj;
        Student asif;
        asif = new Student(123, "Asif Ahmed", 3.56f);
        //int x = asif.id;
        //asif.doSomeInStudent();
        //asif.setStudentInfo();
        asif.showStudentInfo();
        
        //asif.Student(); //can'tcall constructor
        //Employee shafiq;
        //Random r;
    }
    
}
class A{
    //...
}

class B{
    //...
}