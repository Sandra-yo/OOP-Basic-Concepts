public abstract class PlaneFigure {
    private String name;
    private int edgeNumber;
    private Double edgeLength;

    public PlaneFigure(String name){
        this.name = name;
    }
    public PlaneFigure(){
        
    }

    protected abstract Double calculatePerimeter();

    protected abstract Double calculateArea();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getEdgeNumber(){
        return edgeNumber;
    }
    public void setEdgeNumber(int edgeNumber){
        this.edgeNumber = edgeNumber;
    }
    public Double getEdgeLength(){
        return edgeLength;
    }
    public void setEdgeLength(Double edgeLength){
        this.edgeLength = edgeLength;
    }
}
