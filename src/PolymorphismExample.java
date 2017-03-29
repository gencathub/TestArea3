import java.util.ArrayList;

public class PolymorphismExample {
    public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<Shape>();

        Circle circle = new Circle(new Point(0.0, 0.0), 1.0);
        shapesList.add(circle);

        Circle circle1 = new Circle(new Point(1,1), 2);
        shapesList.add(circle1);

        Triangle triangle1 = new Triangle(new Point(15,15),new Point(23,30),new Point(50,25));
        shapesList.add(triangle1);

        Rectangle rectangle = new Rectangle(new Point(0.0, 0.0), new Point(2.0, 2.0));
        shapesList.add(rectangle);

        Square mySquare = new Square(10);
        mySquare.drawASCII('*');

        shapesList.add(rectangle);

        int i =0;

        for (Shape myHolder : shapesList) {
            System.out.print("Iterator is: " + i + "\nShape is: " + myHolder.getClass() + "\nArea is: " + myHolder.computeArea());
            if (i<shapesList.size()-1) {
                System.out.println("\n...Up next! " + shapesList.get(i+1).getClass());
                System.out.println();
                i++;
            } else { System.out.println("\n...No more!");}
//            System.out.println("Shape is: " + shape.getClass() + " and area is: " + shape.computeArea());
        }

        return;
    }
}
