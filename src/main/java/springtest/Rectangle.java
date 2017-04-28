package springtest;

public class Rectangle implements ShapeInterface {
    
    private int l, w;
     
    public Rectangle(int length, int width)  {
        System.out.println("Rectangle being build");
        l = length;
        w = width;
    }

    @Override
    public double getArea() {        
        return l * w;     
    }       
}
