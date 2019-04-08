public class Triangle{

    private int xA;         //x coordinates of vertex A
    private int xB;         //x coordinates of vertex B
    private int xC;         //x coordinates of vertex C
    private int yA;         //y coordinates of vertex A
    private int yB;         //y coordinates of vertex B
    private int yC;         //y coordinates of vertex C
    private int vectorABX;
    private int vectorBCX;
    private int vectorACX;
    private int vectorABY;
    private int vectorBCY;
    private int vectorACY;
    private double edgeAB;
    private double edgeBC;
    private double edgeAC;

    public  Triangle(int xA, int xB, int xC, int yA, int yB, int yC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
        this.yA = yA;
        this.yB = yB;
        this.yC = yC;
        getAllValueForTriangle();
    }

    public void getAllValueForTriangle(){
        vectorABX = xA - xB;
        vectorBCX = xB - xC;
        vectorACX = xA - xC;
        vectorABY = yA - yB;
        vectorBCY = yB - yC;
        vectorACY = yA - yC;
        edgeAB = getEdgeLength(vectorABX, vectorABY);
        edgeBC = getEdgeLength(vectorBCX, vectorBCY);
        edgeAC = getEdgeLength(vectorACX , vectorACY);
    }
    public double getEdgeLength(int vectorX, int vectoY) {
        return Math.sqrt((double)(vectorX * vectorX) + (vectoY * vectoY));
    }

    public String getType() {
        System.out.println(" vectorABX "+vectorABX+" vectorBCX "+vectorBCX +" vectorACX "+vectorACX);
        System.out.println(" edgeAB "+edgeAB+" edgeAC "+edgeAC +" edgeBC "+edgeBC);
        if (isSquareIsosceles()) {
            return "SQUARE_ISOSCELES";
        } else if (isEquilateral()) {
            return "EQUILATERAL";
        } else if (isSquare()) {
            return "SQUARE";
        } else if (isIsosceles()) {
           return "ISOSCELES";
        }else {
            return "NORMAL";
        }
    }

    public double getArea() {
        double s;
        double p = getPerimeter()/2.0;
        s= Math.sqrt(p * (p-edgeAB) * (p-edgeAC) * (p-edgeBC));
        return s;
    }

    public double getPerimeter() {
        return (edgeAB + edgeAC + edgeBC);
    }

    public boolean isSquare() {
        return (vectorABX * vectorACX + vectorABY * vectorACY == 0
                    || vectorABX * vectorBCX + vectorABY * vectorBCY == 0
                    || vectorACX * vectorBCX + vectorACY * vectorBCY == 0);
    }

    public boolean isIsosceles() {
        return (vectorABX * vectorABX + vectorABY * vectorABY == vectorACX * vectorACX + vectorACY * vectorACY
                    || vectorABX * vectorABX + vectorABY * vectorABY == vectorBCX * vectorBCX + vectorBCY * vectorBCY
                    || vectorBCX * vectorBCX + vectorBCY * vectorBCY == vectorACX * vectorACX + vectorACY * vectorACY);
    }

    public boolean isSquareIsosceles() {
        return (isSquare() && isIsosceles());
    }

    public boolean isEquilateral() {
        return (vectorABX * vectorABX + vectorABY * vectorABY == vectorACX * vectorACX + vectorACY * vectorACY
                && vectorABX * vectorABX + vectorABY * vectorABY == vectorBCX * vectorBCX + vectorBCY * vectorBCY);
    }
}