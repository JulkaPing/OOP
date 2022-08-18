package polymorphism;

public class Car {
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getEngineType() {
        return (toString() + "Type Engine: " + engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
