package point2D3D;

public class TestClass3 {
    public static void main(String[] args) {
//        Test Point2D
//        Test constructors and toString()

        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);

//        Test getters&setters

        p2b.setX(3);
        p2b.setY(4);
        System.out.println("point 1 x coord is: " + p2a.getX());
        System.out.println("point 1 y coord is: " + p2a.getY());

//        Test Point3D
//        Test constructors and toString()

        Point3D p3a = new Point3D(6,6,6);
        System.out.println(p3a);
        Point3D p3b = new Point3D();
        System.out.println(p3b);

//        Test getters&setters;
        p3b.setX(7);
        p3b.setY(7);
        p3b.setZ(7);
        System.out.println("x is: " + p3b.getX());  // in superclass
        System.out.println("y is: " + p3b.getY());  // in superclass
        System.out.println("z is: " + p3b.getZ());  // in this class

    }
}
