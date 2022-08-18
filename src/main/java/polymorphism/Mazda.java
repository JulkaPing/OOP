package polymorphism;

public class Mazda extends Car{
    private String typeEngine;

    public Mazda() {
    }

    public Mazda(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public Mazda(Engine engine, String typeEngine) {
        super(engine);
        this.typeEngine = typeEngine;
    }

    @Override
    public String getEngineType() {
        return (toString() + "Type Engine Mazda: " + super.getEngineType());
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "typeEngine='" + typeEngine + '\'' +
                '}';
    }
}
