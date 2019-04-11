import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrategyShape {

    public static ArrayList<Shape> shapeArrayList = new ArrayList<>();
    public static void main(String[] args) {
        StrategyShape strategyShape = new StrategyShape();
        List<String> stringLis = new ArrayList<>();
        Scanner scanner = new Scanner((System.in));

        for(int i =0; i<5; i++) {
            String parameters = scanner.nextLine();
            scanner.close();
            ShapeFactory shapeFactory = new ShapeFactory(parameters);
            shapeArrayList.add(shapeFactory.shape);
        }

        for(int i=0; i<shapeArrayList.size(); i++) {
            shapeArrayList.get(i).showInfo();
        }
    }
}
