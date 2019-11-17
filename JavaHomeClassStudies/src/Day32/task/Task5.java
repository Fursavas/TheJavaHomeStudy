package Day32.task;

public class Task5 {
    // Write a boolean method called isOdd,
    //    which takes an int as input and returns true if the it is odd.
    public static void main(String[] args) {
        int myNumber = 10;

        System.out.println();
    }

//    1 3 5 7 9  odd
//    2 4 6 8 even
    public static boolean isOdd(int n) {
        boolean oddCondition = n % 2 != 0;

        boolean result = false;
        if (oddCondition) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static boolean isOdd2(int n) {
        return n % 2 != 0;
    }

}
