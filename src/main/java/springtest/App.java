package springtest;

import org.springframework.beans.factory.annotation.Autowired;

public class App {
          
    @Autowired
    private ShapeInterface shape1;
    @Autowired
    private ShapeInterface shape2;
        
    public void work() {
        
        printInfo(shape1);
        printInfo(shape2);
    }

    private static void printInfo(ShapeInterface aShape) {
        
        if(aShape != null) {
        
            System.out.println(aShape.getClass().getSimpleName());
        } else {
            System.out.println("Argument is null");
        }
    }

    public ShapeInterface getShape1() {
        return shape1;
    }
    public void setShape1(ShapeInterface shape1) {
        this.shape1 = shape1;
    }

    public ShapeInterface getShape2() {
        return shape2;
    }

    public void setShape2(ShapeInterface shape2) {
        this.shape2 = shape2;
    }
    
    @Override
    public String toString() {
        return "App [shape1=" + shape1 + ", shape2=" + shape2 + "]";
    }
}
