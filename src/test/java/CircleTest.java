import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void test_Circle() {
        Circle circle = new Circle(3,8,6);
        circle.showInfo();
    }

    @Test
    public void test_getPerimeter() {
        Circle circle = new Circle(3,4,6);
        assertEquals(circle.getPerimeter(),37.69,0.01);
    }

    @Test
    public void test_getArea() {
        Circle circle = new Circle(3,4,6);
        assertEquals(circle.getArea(),113.09,0.01);
    }
}
