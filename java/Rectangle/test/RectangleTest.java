import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void should_have_a_perimeter() {

        assertEquals(20, Rectangle.createRectangle(5, 5).perimeter());
        assertEquals(18, Rectangle.createRectangle(4, 5).perimeter());

    }

    @Test
    public void should_have_an_area() {

        assertEquals(1, Rectangle.createRectangle(1, 1).area());
        assertEquals(20, Rectangle.createRectangle(4, 5).area());

    }

    @Test
    public void square_is_a_special_instance() {
        assertEquals(Rectangle.createRectangle(5, 5).area(), Rectangle.createSquare(5).area());
        assertEquals(Rectangle.createRectangle(6, 6).perimeter(), Rectangle.createSquare(6).perimeter());
    }

}