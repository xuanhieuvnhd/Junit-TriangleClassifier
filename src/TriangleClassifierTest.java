import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("equilateral triangle")
    void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c=2;
        String expected ="equilateral";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("isosceles triangle")
    void isoscelesTriangle(){
        int a = 2;
        int b = 2;
        int c=3;
        String expected ="isosceles";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("is triangle")
    void isTriangle(){
        int a = 3;
        int b = 4;
        int c = 5;
        String expected ="triangle";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("is Not triangle")
    void isNotTriangle(){
        int a = 8;
        int b = 2;
        int c = 3;
        String expected ="Nottriangle";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expected, result);
    }
}