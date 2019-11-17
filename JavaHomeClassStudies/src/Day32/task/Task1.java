package Day32.task;

public class Task1 {
    // Write a program with a method named getTotal
    // that accepts two integers as an argument and print its sum.
    public static void main(String[] args) {
        printGetTotal(1, 2);
        int a = 1;
        printGetTotal(a, 5);

        printGetTotal(10, 10);
        printGetTotal(25, 25);
        printGetTotal(30, 30);
    }

    public static void printGetTotal(int number1, int number2) {
        int total = number1 + number2;
        System.out.println(total);
    }

}
