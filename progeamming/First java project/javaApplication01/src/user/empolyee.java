package user;

import java.util.Scanner;

public class empolyee {
    private int employeeID;
    private String name;
    private String department;


    public empolyee(int i, String n,String d) {
        employeeID = i; name = n; department = d;
    }

    public void setEmployeeInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee ID:");
        employeeID = s.nextInt();
        s.nextLine();
        System.out.print("Enter Name:");
        name = s.nextLine();
        // s.nextLine();
        System.out.print("Enter Department:");
        department = s.nextLine();
    }

    public void showEmployeeInfo(){
        System.out.println("Employee ID:"+employeeID+" Name:"+name+" Department:"+department);
    }

}
