import java.awt.*;
import java.util.Vector;

public class Circle extends Shape
{
    //data fields
    protected double area;
    protected double perimeter;


    /**
     * You should override this to create a shape, based on the
     * shape's description (see ShapeDescription class)
     *
     * @param description the name of the shape and some doubles that define it
     */
    Circle(ShapeDescription description) {
        super(description); //does nothing
        //storing radius in temp variables
        Vector<Double> temp = description.getDoubles();
        double radius = temp.get(0);
        area = Math.PI * (Math.pow(radius,2));
        perimeter = 2* (Math.PI) * radius;

    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
    //inherits member fields and methods but not constructors
}
