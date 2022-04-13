import parson.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
        t.name = "Md Nakibul islam";
        t.age =22;
        t.qulafication = "Bsc in CSE";

        t.displayinformation1();
    }
}
