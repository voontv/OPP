import java.util.ArrayList;
import java.util.List;

public class StrategyShape {

    public static void main(String[] args) {

    }

    public void createdOPPFromParameters(List<String> stringList, ShapeFactory shapeFactory,StrategyShape strategyShape) {

        for (String string : stringList) {
            List<Integer> integerList = strategyShape.getLengthParameters(string);
            int count = integerList.size();
            if (count == 3) {
                shapeFactory.save(new Circle(integerList.get(0), integerList.get(1), integerList.get(2)));
            } else if (count == 6) {
                shapeFactory.save(new TriangleShape(integerList.get(0), integerList.get(1), integerList.get(2), integerList.get(3), integerList.get(4), integerList.get(5)));
            } else if (count == 8) {
                shapeFactory.save(new Quadrilateral(integerList.get(0), integerList.get(1), integerList.get(2), integerList.get(3), integerList.get(4), integerList.get(5), integerList.get(6), integerList.get(7)));
            } else {
                throw new RuntimeException("Dont same request");
            }

        }
    }

    public List<Integer> getLengthParameters(String string){
        int count =0;
        List<Integer> list = new ArrayList<>();
        for(String string1: string.split(" ")) {
            list.add(Integer.parseInt(string1));
        }
        return list;
    }
}
