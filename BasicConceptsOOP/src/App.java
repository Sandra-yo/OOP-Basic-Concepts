public class App {
    public static void main(String[] args) throws Exception {
      //  GeometricFigure triangle = new GeometricFigure("Square"); 
       // System.out.println(triangle.myName());
        //System.out.println("My perimeter is: "+triangle.calculatePerimeter());
        Square square = new Square();
        square.setEdgeLength(1.0);
        System.out.println("Perimeter for square is "+square.calculatePerimeter());
        System.out.println("Area for square is "+square.calculateArea());
        Circle circle = new Circle();
        circle.setEdgeLength(1.0);
        System.out.println("Perimeter for square is "+circle.calculatePerimeter());
        System.out.println("Area for square is "+circle.calculateArea());
    }
}
