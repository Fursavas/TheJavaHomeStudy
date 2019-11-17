package OfficeHoursWithAli;

import java.util.ArrayList;

public class bf {
    public static void main(String[] args) {

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Lion");
        list3.add("Dog");
        list3.add("Tiger");
        list3.add("Cat");
        list3.add("Lizard");
        list3.add("Elephant");
        list3.add("Cow");


        ArrayList<String> list4 = new ArrayList<>();

        list4.add("Lion");
        list4.add("Elephant");
        list4.add("Dog");
        list4.add("Cow");
        list4.add("Lizard");
        list4.add("Cat");
        list4.add("Lizard");


//      please make sure list 3 contains list 4

//      nested for loop then use a if statment

        boolean check = false;

        for (int i = 0; i < list3.size(); i++) {

            for (int j = 0; j < list4.size(); j++) {

                if (list3.get(i).contains(list4.get(j))) {

                    check = true;

                    break;

                } else {

                    check = false;

                }

            }

            if (check == false) {

                break;

            }

        }

        System.out.println("Check is here ---->>>>   " + check);
    }
}