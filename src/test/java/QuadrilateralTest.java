import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadrilateralTest {

    @Test
    public void test_QuadrilateralTest() {
        Quadrilateral quadrilateral = new Quadrilateral(2,35,3,7,1,8,9,21);
        quadrilateral.showInfo();
    }

    @Test
    public void test_getPerimeter() {
        Quadrilateral quadrilateral = new Quadrilateral(2,2,2,4,6,4,6,2);
        assertEquals(quadrilateral.getPerimeter(),12,0);
    }

    @Test
    public void test_getArea() {
        Quadrilateral quadrilateral = new Quadrilateral(2,2,2,4,6,4,6,2);
        assertEquals(quadrilateral.getArea(),8,0);
    }


    @Test
    public void test_getArea_Triangle() {
        Quadrilateral quadrilateral = new Quadrilateral(2,-1,4,4,5,7,9,21);
        assertEquals(quadrilateral.getAreaTriangle(3,4,5),6,0);
    }

    @Test
    public void test_getPerimeter_Triangle() {
        Quadrilateral quadrilateral = new Quadrilateral(2,-1,4,4,5,7,9,21);
        assertEquals(quadrilateral.getPerimeterTriangle(12.5,14,18),44.5,0);
    }

}
