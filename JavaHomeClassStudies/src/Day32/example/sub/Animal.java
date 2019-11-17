package Day32.example.sub;

public class Animal {
    public String name; // cat, dog
    public String breed;
    public int age;
    public double weight;
    public int legs;
    public boolean poisonous;

    public int getSpeed() {
        return legs * 10;
    }

    public boolean canJump() {
//        if (legs >= 2) {
//            return true;
//        } else {
//            return false;
//        }

        return legs >= 2;
    }

    public void cuteness() {
        if (legs == 0) {
            System.out.println("Not cute");
        } else if (legs == 2) {
            System.out.println("Some what cute");
        } else if (legs == 4) {
            System.out.println("Perfect");
        } else if (legs < 0) {
            System.out.println("OMG");
        } else if (legs > 4) {
            System.out.println("MUTANT");
        }
    }

    public String getCuteness() {
        String result = "";
        if (legs == 0) {
            result = "Not cute";
        } else if (legs == 2) {
            result = "Some what cute";
        } else if (legs == 4) {
            result = "Perfect";
        } else if (legs < 0) {
            result = "OMG";
        } else if (legs > 4) {
            result = "MUTANT";
        }

        return result;
    }


    // Name: Richard Parker
    // Age:  5
    // Weight: 200.10
    // Breed : Bangal
    public String toString() {
        String output = "Name: " + name + "\n";
        output += "Age: " + age + "\n";
        output += "Weight: " + weight + "\n";
        output += "Breed: " + breed + "\n";
        output += "Cuteness: " + getCuteness() + "\n";

        return output;
    }

}
