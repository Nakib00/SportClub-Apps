public class ganeric_class{
    public static void main(String[] args){
        Area<Integer> rectangle = new Area<Integer>();
        Area<Double> circle = new Area<Double>();

        rectangle.add(20);
        circle.add(3.5);

        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}