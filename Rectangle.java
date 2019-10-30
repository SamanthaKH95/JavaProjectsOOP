import java.awt.*;
import java.util.Vector;

public class Rectangle extends Shape
{
    protected double area;
    protected double perimeter;

    /**
     * You should override this to create a shape, based on the
     * shape's description (see ShapeDescription class)
     *
     * @param description the name of the shape and some doubles that define it
     */
    Rectangle(ShapeDescription description) {
        super(description);//does nothing
        //storing temp variables to set data fields
        Vector<Double> temp = description.getDoubles();
        double side1 = temp.get(0); //width
        double side2 = temp.get(1); //height
        area = side1 * side2;
        perimeter = (2*side1) + (2*side2);
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
