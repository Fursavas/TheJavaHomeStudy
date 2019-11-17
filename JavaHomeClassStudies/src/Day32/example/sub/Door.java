package Day32.example.sub;

public class Door {
    public String color;
    public int height;
    public int width;
    public boolean hasLock;
    public String material; // metal, wood
    public boolean hasFrame;

    public boolean isOpen() {
        if (hasLock == false) {
            return true;
        } else {
            return false;
        }
    }
}
