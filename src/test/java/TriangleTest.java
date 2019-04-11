import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void test_Triangle() {
        Triangle triangle = new Triangle(1,2,4,6,8,10);
        assertEquals(triangle.getType(),"NORMAL");
    }

    @Test
    public void test_isSquare() {
        Triangle triangle = new Triangle(2,0,4,3,2,-1);
        assertTrue(triangle.isSquare());
    }

    @Test
    public void test_isIsosceles () {
        Triangle triangle = new Triangle(-1,1,2,1,3,0);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void test_getType () {
        Triangle triangle = new Triangle(-1,1,2,1,3,0);
        assertEquals(triangle.getType(),"ISOSCELES");
        triangle = new Triangle(2,0,67,3,2,-1);
        assertEquals(triangle.getType(),"NORMAL");
        triangle = new Triangle(2,0,4,3,2,-1);
        assertEquals(triangle.getType(),"SQUARE");
        triangle = new Triangle(-1,1,1,1,3,-1);
        assertEquals(triangle.getType(),"SQUARE_ISOSCELES");
    }

    @Test
    public void test_getCircumferenceTriangle() {
        Triangle triangle = new Triangle(2,4,5,-1,-4,7);
        assertEquals(triangle.getPerimeter(),23.19481603796878,0.001);
    }

    @Test
    public void test_getAreaTriangle() {
        Triangle triangle = new Triangle(2,4,5,-1,-4,7);
        assertEquals(triangle.getArea(),12.5,0.001);

    }
}
