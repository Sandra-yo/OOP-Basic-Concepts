public class Circle extends PlaneFigure {

    public Circle(){
        super("circle");
        setEdgeNumber(0);
    }

    @Override
    protected Double calculatePerimeter() {
        Double perimeter = Math.PI*getEdgeLength()*2;
        return perimeter;
    }

    @Override
    protected Double calculateArea() {
        Double area = Math.PI*(getEdgeLength()*getEdgeLength());
        return area;
    }
    
}
