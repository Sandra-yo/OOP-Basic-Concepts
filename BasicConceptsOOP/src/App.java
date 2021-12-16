import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
      //  GeometricFigure triangle = new GeometricFigure("Square"); 
       // System.out.println(triangle.myName());
        //System.out.println("My perimeter is: "+triangle.calculatePerimeter());
     /*   Square square = new Square();
        square.setEdgeLength(1.0);
        System.out.println("Perimeter for square is "+square.calculatePerimeter());
        System.out.println("Area for square is "+square.calculateArea());
        Circle circle = new Circle();
        circle.setEdgeLength(1.0);
        System.out.println("Perimeter for square is "+circle.calculatePerimeter());
        System.out.println("Area for square is "+circle.calculateArea());*/
       
        //Basic Data Structures Practice
        //String [] test = {"lemon","pinaple"};

        //Integer [][] test = new Integer[8][8];
        
       // List<String> test = new ArrayList<String>();
        
       //HashMap<String,String> test = new HashMap<String,String>();
       
        TreeSet<Integer> test = new TreeSet<Integer>();
        
        DataStructures dataStructures = new DataStructures(test);
        dataStructures.print();
    }
}
