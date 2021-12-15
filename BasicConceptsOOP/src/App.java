public class App {
    public static void main(String[] args) throws Exception {
        GeometricFigure triangle = new GeometricFigure("Square"); 
        System.out.println(triangle.myName());
        System.out.println("My perimeter is: "+triangle.calculatePerimeter());
        
    }
}
