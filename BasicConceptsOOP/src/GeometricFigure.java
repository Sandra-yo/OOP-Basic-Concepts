public class GeometricFigure {

    private String name;
    private int sides;
    private double sideLength;

    public GeometricFigure(String name){
        this.name = name;
        this.sides = 4;
        this.sideLength = 1.0;
    }

    public String myName(){
        return "Hello! My name is " +this.name+"!";
    }

    public Double calculatePerimeter(){
        return this.sides * sideLength;
    }

    
}
