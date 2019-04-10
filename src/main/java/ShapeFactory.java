import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    private Shape shapeType;
    public List<Shape> listObject = new ArrayList<>();
    public void save(Shape shapeType) {
        this.shapeType = shapeType;
        listObject.add(shapeType);
    }

    public void showInfo() {
        shapeType.showInfo();
    }

    public double getArea() {
        return shapeType.getArea();
    }

    public double getPerimeter() {
        return shapeType.getPerimeter();
    }
}
