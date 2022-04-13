package Shape;

public class Rectangale extends shape{
    double length,width;

    public Rectangale(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        System.out.println("Rectangale");
        return length*width;
    }
}
