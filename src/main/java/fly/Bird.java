package fly;

public class Bird implements Flyable {

    @Override
    public void isFlying() {
        System.out.println("Fly with wings");
    }

    @Override
    public void isEating() {
        System.out.println("Eats grain");
    }
}