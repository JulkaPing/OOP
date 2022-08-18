package polymorphism;

public class Toyota extends Car {

    private String engine;

    public Toyota() {
    }

    public Toyota(String engine) {
        this.engine = engine;
    }

    public Toyota(Engine engine, String typeEngine) {
        super(engine);
        this.engine = typeEngine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String getEngineType() {
        return (toString() +"Type Engine Toyota: " + super.getEngineType());
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
