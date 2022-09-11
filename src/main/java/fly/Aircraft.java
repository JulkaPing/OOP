package fly;

public class Aircraft implements Flyable{

    @Override
    public void isFlying() {
        System.out.println("Fly with an engine");
    }
}