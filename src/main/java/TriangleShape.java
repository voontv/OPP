class TriangleShape implements Shape{
    private int xA;         //x coordinates of vertex A
    private int xB;         //x coordinates of vertex B
    private int xC;         //x coordinates of vertex C
    private int yA;         //y coordinates of vertex A
    private int yB;         //y coordinates of vertex B
    private int yC;         //y coordinates of vertex C
    private double edgeAB;
    private double edgeBC;
    private double edgeAC;

    public  TriangleShape(int xA, int xB, int xC, int yA, int yB, int yC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
        this.yA = yA;
        this.yB = yB;
        this.yC = yC;
        getAllValueForTriangle();
    }

    private void getAllValueForTriangle(){
        int vectorABX = xA - xB;
        int vectorBCX = xB - xC;
        int vectorACX = xA - xC;
        int vectorABY = yA - yB;
        int vectorBCY = yB - yC;
        int vectorACY = yA - yC;
        edgeAB = getEdgeLength(vectorABX, vectorABY);
        edgeBC = getEdgeLength(vectorBCX, vectorBCY);
        edgeAC = getEdgeLength(vectorACX, vectorACY);
    }

    private double getEdgeLength(int vectorX, int vectoY) {
        return Math.sqrt((double)(vectorX * vectorX) + (vectoY * vectoY));
    }

    public void showInfo() {
        System.out.println("Triangle " +"have area "+getArea() +" and Perimeter "+getPerimeter());
    }

    public double getArea() {
        double s;
        double p = getPerimeter()/2.0;
        s = Math.sqrt(p * (p - edgeAB) * (p - edgeAC) * (p - edgeBC));
        return s;
    }

    public double getPerimeter() {
        return (edgeAB + edgeAC + edgeBC);
    }
}
