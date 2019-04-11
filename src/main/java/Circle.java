public class Circle implements Shape {

    private int circleR;
    private int circleX;
    private int circleY;

    public Circle(int circleX, int circleY, int circleR) {
        this.circleR = circleR;
        this.circleX = circleX;
        this.circleY = circleY;
    }

    public void showInfo() {
        System.out.println("Circle have center (" +circleX+", "+circleY+"), radius "+circleR
                +" have area "+getArea()
                +" and Perimeter "+getPerimeter());
    }

    public double getArea() {
        return Math.PI * circleR * circleR;
    }
    public double getPerimeter() {
        return (double) 2 * Math.PI * circleR;
    }
}
