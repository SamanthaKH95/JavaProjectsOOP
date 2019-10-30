import java.awt.*;
import java.util.Vector;

public class Square extends Shape
{

    protected double area;
    protected double perimeter;
    /**
     * You should override this to create a shape, based on the
     * shape's description (see ShapeDescription class)
     *
     * @param description the name of the shape and some doubles that define it
     */
    Square(ShapeDescription description) {
        super(description);//does nothing
        //storing temp variables to set data fields
        Vector<Double> temp = description.getDoubles();
        double side = temp.get(0);
        area = side * side;
        perimeter = 4 * side;

    }

    @Override
    public double getArea()
    {
        return area;
    }

    @Override
    public double getPerimeter()
    {
        return perimeter;
    }
    //inherits member fields and methods but not constructors
}
