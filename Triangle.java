import java.awt.*;
import java.util.Vector;

public class Triangle extends Shape
{
    protected double area;
    protected double perimeter;

    /**
     * You should override this to create a shape, based on the
     * shape's description (see ShapeDescription class)
     *
     * @param description the name of the shape and some doubles that define it
     */
    Triangle(ShapeDescription description) {
        super(description);//does nothing
        //storing temp variables to set data fields
        Vector<Double> temp = description.getDoubles();
        double side1 = temp.get(0); //side A
        double side2 = temp.get(1); //side b
        double side3 = temp.get(2); //side c

        //using Heron's formula
        double s = .5*(side1 + side2 + side3);
        double presqrt = s*(s-side1)*(s-side2)*(s-side3);


        area = Math.sqrt(presqrt);
        perimeter = side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
    //must implement getbounds in shape class

}
