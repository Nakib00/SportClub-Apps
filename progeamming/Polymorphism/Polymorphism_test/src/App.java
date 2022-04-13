import Shape.shape;
import Shape.Rectangale;
import Shape.Triangale;

public class App {
    public static void main(String[] args) throws Exception {
        //Run time polymorphism
        // shape s1 = new shape();
        // shape s2 = new Rectangale(10.4,5.6);
        // shape s3 = new Triangale(7.5,9.5);

        // System.out.println(s1.area());
        // System.out.println(s2.area());
        // System.out.println(s3.area());

        shape[] s = new shape[3];
        s[0] = new shape();
        s[1] = new Rectangale(10.4,5.6);
        s[2] = new Triangale(7.5,9.5);

        for(int i=0; i<3; i++){
            System.out.println(s[i].area());
        }
    }
}
