package springtest;

public class Circle implements ShapeInterface {
        
    private double r;
       
    public Circle(double radius) {
        System.out.println("Circle being build");
        r = radius;
    }
        
    public double getRadius() {
        return r;
    }

    @Override
    public double getArea() {
      return Math.PI * r * r;
    }
}
