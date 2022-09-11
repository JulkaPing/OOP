package fly;

public interface Flyable {
    public default void isFlying() {
        System.out.println("Flying");
    }
}
