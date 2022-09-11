package fly;

public interface Eatable {

    public default void isEating() {
        System.out.println("Eating");
    }
}
