import java.io.*;
import java.util.Vector;

public class FunWithShapes extends ShapeHandler //one outer public class per source file, only runs if there is a main
{

    //constructor with matching call to super constructor in parent class ShapeHandler
    FunWithShapes() throws ShapeException
    {
        super(); //calling parent constructor which has no parameters, reads in file and parces to shapedescription
    }

    public void convertDescriptionsToShapes() //throws ShapeException

    {
        //try
        //{
            for(int i=0; i < shapeDescriptions.size(); i++)
            {
                //should iterate through shapeDescriptions and instantiate specific shape objects and store to vector

                if (shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.CIRCLE) {
                    Circle s = new Circle(shapeDescriptions.get(i));
                    shapes.add(s);
                }
                if (shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.SQUARE) {
                    Square s = new Square(shapeDescriptions.get(i));
                    shapes.add(s);
                }
                if (shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE) {
                    Triangle s = new Triangle(shapeDescriptions.get(i));
                    shapes.add(s);
                }
                if (shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE) {
                    Rectangle s = new Rectangle(shapeDescriptions.get(i));
                    shapes.add(s);
                }

                /*
                if (shapeDescriptions.get(i).getShapeType() != ShapeDescription.ShapeTypes.RECTANGLE &&
                        shapeDescriptions.get(i).getShapeType() != ShapeDescription.ShapeTypes.CIRCLE &&
                        shapeDescriptions.get(i).getShapeType() != ShapeDescription.ShapeTypes.SQUARE &&
                        shapeDescriptions.get(i).getShapeType() != ShapeDescription.ShapeTypes.TRIANGLE)
                {
                    throw new IOException("Shape type is somehow invalid");
                }
                */
            }
        //}

        /*
        catch (IOException e)
        {
            throw new ShapeException( "Shape type is somehow invalid" );
        }
        */


    }

    public double sumOverAreas()
    {
        //iterate through the shapes vector and calls getarea and getperimeter on each one, adding it to a counter
        double counter = 0;
        double individualArea;

        for(int i=0; i < shapes.size(); i++)
        {
            individualArea = shapes.get(i).getArea();
            counter = counter + individualArea;
        }


        return counter;
    }


    public double sumOverPerimeters()
    {
        //iterate through the shapes vector and calls getarea and getperimeter on each one, adding it to a counter
        double counter = 0;
        double individualPerimeter;

        for(int i=0; i < shapes.size(); i++)
        {
            individualPerimeter = shapes.get(i).getPerimeter();
            counter = counter + individualPerimeter;
        }


        return counter;
    }

    public static void main(String[] args) //no main no run, return type is always void
    {
        try
        {


            //System.out.println("instantiating FunWithShapes with Shapehandler constructor \n");
            FunWithShapes FWS = new FunWithShapes(); //a new instance of shapehandler's child w constructor
            // that reads in file

            //System.out.println("shapedescriptions vector populated.. \n");
            //shapedescriptions vector is now populated with shapedescription objects that have a
            // shapetype object and a vector of doubles for that ONE shape
            //now you can call getshapetype and getdouble on shapedescriptions vector elements

            //System.out.println("constructor calling convertdescriptionstoshapes, shapes vector populated \n");
            //the constructor now calls convertDescriptionToShapes
            //now for each shapedescription, it finds the shapetype and creates the correct shape object,
            //adding it to the shapes vector
            //it should now populate the shapes vector in shapehandler with shape objects


            //System.out.println("calling sum area and sum perimeter \n");
            //now we call sum area and sum perimeter to print to screen



            System.out.println(FWS.sumOverAreas());
            System.out.println(FWS.sumOverPerimeters());








            return;
        }
        catch (ShapeException e)
        {
            e.printStackTrace();
        }
        finally
        {}


    }




}

