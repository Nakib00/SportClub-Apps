import user.empolyee;
// import user.student;

public class App {
    public static void main(String[] args) throws Exception {
        // student nakib;
        // nakib = new student(2032,"Nakib",3.6f); 
        // nakib.getstudentinfo();
        // nakib.showstudentinfo();

        empolyee e1,e2;
        e2 = new empolyee(4161,"S K Dey","CSE");

        System.out.println("Give input for Empoly 1:");

        e1 = new empolyee(0,"null","null");
        e1.setEmployeeInfo();
        System.out.println("Complete information of the employees are:");
        e1.showEmployeeInfo();
        e2.showEmployeeInfo();

    }
}
