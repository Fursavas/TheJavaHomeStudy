package Day32.task;

public class Task8 {
    // Create class named Rectangle
    // then add attributes: short side, long side
    // then add methods:
    //      getPerimeter => (a+b+a+b)
    //      getArea => (a*b)
    // in other class print those perimeter and area
    // ex:
    //  Rectangle r = new Rectangle();
    //  r.short side = 4;
    //  r.long side = 5;
    //
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.longSide = 10;
        rect1.shortSide = 5;

        int perimeter = rect1.getPerimeter();
        System.out.println("Perimeter is: " + perimeter);

        int area = rect1.getArea();
        System.out.println("Area is: " + area);
    }

}
