package Shape;

public class Triangale extends shape{
    double base,height;

    public Triangale(double base,double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        System.out.println("Triangale");
        return 0.5*base*height;
    }
}
