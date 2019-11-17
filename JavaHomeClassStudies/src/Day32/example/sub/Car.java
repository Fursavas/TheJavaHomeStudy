package Day32.example.sub;

import java.util.ArrayList;

public class Car {
    public int speed;
    public Door doors;
    public ArrayList<Integer> seats;
    public int wheels;
    public String model;
    public String color;
    public double engine;
    public String state; // new or old

    public boolean drive() {
        if (wheels > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void repair() {
        if (state.equals("NEW")) {
            System.out.println("Its new, you dont have to repair it");
        } else {
            System.out.println("You might think about repairing it");
        }
    }
}

