public class Rectangle {
    private int width;
    private int height;

    private Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static Rectangle createRectangle(int width, int height) {
        return new Rectangle(width, height);
    }

    public static Rectangle createSquare(int sides) {
        return createRectangle(sides, sides);
    }

    public int perimeter() {
        return width * 2 + height * 2;
    }

    public int area() {
        return width * height;
    }
}