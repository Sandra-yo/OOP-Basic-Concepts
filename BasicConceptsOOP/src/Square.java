public class Square extends PlaneFigure {

    public Square(){
        super("Square");
        setEdgeNumber(4);
    }
    public Square(Double edgeLength){
        setEdgeLength(edgeLength);
        setEdgeNumber(4);
    }

    @Override
    protected Double calculatePerimeter() {
        return getEdgeNumber()*getEdgeLength();
    }

    @Override
    protected Double calculateArea() {
        return getEdgeLength()*getEdgeLength();
    }
    
}
