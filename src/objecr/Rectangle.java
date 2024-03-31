package objecr;

public class Rectangle {

    private double rectangleLength;
    private double rectangleWidth;

    public Rectangle(double rectangleLength, double rectangleWidth) {
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }

    public double getRectangleLength() {
        return rectangleLength;
    }

    public void setRectangleLength(double rectangleLength) {
        this.rectangleLength = rectangleLength;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }
    public double calculateArea() {
        return rectangleLength * rectangleWidth;
    }
    public double calculatePerimeter() {
        return 2 * (rectangleLength + rectangleWidth);
    }

}
