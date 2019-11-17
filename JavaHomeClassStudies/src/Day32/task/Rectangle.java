package Day32.task;

public class Rectangle {
    public int shortSide;
    public int longSide;

    // getPerimeter => (a+b+a+b) => 2*(a+b)
    public int getPerimeter() {
        return (shortSide + longSide) * 2;
    }

    // getArea => (a*b)
    public int getArea() {
        return shortSide * longSide;
    }
}
