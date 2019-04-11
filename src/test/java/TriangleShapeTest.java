import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleShapeTest {

    @Test
    public void test_TriangleShape() {
        TriangleShape triangleShape = new TriangleShape(1,2,8,6,8,10);
        triangleShape.showInfo();
    }

    @Test
    public void test_getPerimeter() {
        TriangleShape triangleShape = new TriangleShape(2,4,5,-1,-4,7);
        assertEquals(triangleShape.getPerimeter(),23.19481603796878,0.001);
    }

    @Test
    public void test_getArea() {
        TriangleShape triangleShape = new TriangleShape(2,4,5,-1,-4,7);
        assertEquals(triangleShape.getArea(),12.5,0.001);
    }
}
