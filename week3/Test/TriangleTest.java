import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("Testing 2-2-2")
    public void testEdge2Edge2Edge2() {
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = ("Tam giac deu");

        String result = Triangle.triangle(a,b,c);
        assertEquals(result,expected );
    }

    @Test
    @DisplayName("Testing 2-2-3")
    public void testEdge2Edge2Edge3() {
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = ("Tam giac can");

        String result = Triangle.triangle(a,b,c);
        assertEquals(result,expected );
    }

    @Test
    @DisplayName("Testing 3-4-5")
    public void testEdge3Edge4Edge5() {
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = ("Tam giac vuong");

        String result = Triangle.triangle(a,b, c);
        assertEquals(result,expected );
    }

    @Test
    @DisplayName("Testing 8-2-3")
    public void testEdge8Edge2Edge3() {
        double a = 8;
        double b = 2;
        double c = 3;
        String expected = ("khong phai tam giac");

        String result = Triangle.triangle(a,b, c);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Testing -1-2-1")
    public void testEdgeEdge4Edge6() {
        double a = -1;
        double b = 2;
        double c = 1;
        String expected = ("khong phai tam giac");

        String result = Triangle.triangle(a,b, c);
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Testing 0-1-1")
    public void testEdge0Edge1Edge1() {
        double a = 0;
        double b = 1;
        double c = 1;
        String expected = ("khong phai tam giac");

        String result = Triangle.triangle(a,b, c);
        assertEquals(result, expected);
    }
}