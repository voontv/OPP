import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StrategyShapeTest {

    @Test
    public void test_getLengthParameters() {
        StrategyShape strategyShape = new StrategyShape();
        List<Integer> expected  = strategyShape.getLengthParameters("5 7 8");
        List<Integer> actual = Arrays.asList(5,7,8);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void test_createdOPPFromParameters() {
        StrategyShape strategyShape = new StrategyShape();
        ShapeFactory shapeFactory = new ShapeFactory();
        List<String> stringList = new ArrayList<>();
        stringList.add("7 8 9");
        stringList.add("21 81 9");
        stringList.add("1 4 6 7 12 43");
        stringList.add("8 40 6 21 12 43 5 9");
        stringList.add("1 4 9 7 14 43 4 7");
        strategyShape.createdOPPFromParameters(stringList,shapeFactory,strategyShape);
    }
}
