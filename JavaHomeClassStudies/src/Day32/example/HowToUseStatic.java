package Day32.example;

import day32.example.sub.Person;

public class HowToUseStatic {

    public static void main(String[] args) {
        Person ali = new Person();
        ali.name = "Ali";

        System.out.println(ali.getBody());
        System.out.println(ali.getName());

        System.out.println("-------------------------------------");
        Person richard = new Person();

        System.out.println(richard.getBody());
        System.out.println(richard.getName());

        Person mark = new Person();
        mark.name = "Mark";
        System.out.println(mark.getName());
        System.out.println(Person.urlToGoogle);
    }

}
