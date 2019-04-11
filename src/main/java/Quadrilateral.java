class Quadrilateral implements Shape{

    private int xA;         //x coordinates of vertex A
    private int xB;         //x coordinates of vertex B
    private int xC;         //x coordinates of vertex C
    private int xD;         //x coordinates of vertex D
    private int yA;         //y coordinates of vertex A
    private int yB;         //y coordinates of vertex B
    private int yC;         //y coordinates of vertex C
    private int yD;         //y coordinates of vertex D
    private double edgeAB;
    private double edgeBC;
    private double edgeCD;
    private double edgeAD;
    private double edgeAC;
    private double edgeBD;

    public Quadrilateral(int xA, int yA, int xB, int yB, int xC, int yC,int xD, int yD) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
        this.xC = xC;
        this.yC = yC;
        this.xD = xD;
        this.yD = yD;
        getAllValueForQuadrilateral();
    }

    private void getAllValueForQuadrilateral(){
        int vectorABX = xA - xB;
        int vectorABY = yA - yB;
        int vectorBCX = xB - xC;
        int vectorBCY = yB - yC;
        int vectorADX = xA - xD;
        int vectorADY = yA - yD;
        int vectorCDX = xC - xD;
        int vectorCDY = yC - yD;
        int vectorBDX = xB - xD;
        int vectorBDY = yB - yD;
        int vectorACX = xA - xC;
        int vectorACY = yA - yC;

        edgeAB = getEdgeLength(vectorABX, vectorABY);
        edgeBC = getEdgeLength(vectorBCX, vectorBCY);
        edgeCD = getEdgeLength(vectorCDX, vectorCDY);
        edgeAD = getEdgeLength(vectorADX , vectorADY);
        edgeAC = getEdgeLength(vectorACX, vectorACY);
        edgeBD = getEdgeLength(vectorBDX, vectorBDY);
    }

    private double getEdgeLength(int vectorX, int vectoY) {
        return Math.sqrt((double)(vectorX * vectorX) + (vectoY * vectoY));
    }

    public void showInfo() {
        System.out.println("Quadrilateral" +" have area "+getArea() +" and Perimeter "+getPerimeter());
    }

    public double getArea() {
        double area1 = getAreaTriangle(edgeAB, edgeAD, edgeBD) + getAreaTriangle(edgeBC, edgeCD, edgeBD);
        double area2 = getAreaTriangle(edgeAD, edgeAC, edgeCD) + getAreaTriangle(edgeBD, edgeBC, edgeCD);
        return minArea(area1, area2);
    }

    public double getAreaTriangle(double edgeAB, double edgeAC, double edgeBC) {
        double s;
        double p = getPerimeterTriangle(edgeAB, edgeAC, edgeBC) / 2.0;
        s = Math.sqrt(p * (p - edgeAB) * (p - edgeAC) * (p - edgeBC));
        return s;
    }

    public double getPerimeter() {
        return (edgeAB + edgeBC + edgeCD + edgeAD);
    }

    public double getPerimeterTriangle(double edgeAB, double edgeAC, double edgeBC) {
        return (edgeAB + edgeAC + edgeBC);
    }

    public double minArea(double area1, double area2) {
        return Double.compare(area1, area2) >= 0 ? area2 : area1;
    }
}
