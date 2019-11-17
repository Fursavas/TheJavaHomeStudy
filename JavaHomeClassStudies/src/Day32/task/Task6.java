package Day32.task;

public class Task6 {
    // Hint: use substring
    // Write a String method called firstHalf,
    //    which takes an String as input and returns first half
    // Write second method called secondHalf
    //    which takes an String as input and returns second half
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        int start = 0;
        int middle = text.length()/2;

        String firstHalf = firstHalf(text);
        String secondHalf = secondHalf(text);

        System.out.println(firstHalf);
        System.out.println(secondHalf);


        String text2 = "Contrary to popular belief, Lorem Ipsum is not simply random text";
        System.out.println(firstHalf(text2));
    }

    public static String firstHalf(String text){
        int start = 0;
        int middle = text.length()/2;

        return text.substring(start, middle);
    }

    public static String secondHalf(String text){
        int middle = text.length()/2;

        return text.substring(middle);
    }
}
