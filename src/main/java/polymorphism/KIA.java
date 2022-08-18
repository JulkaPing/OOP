package polymorphism;

public class KIA extends Car {

    private String typeEngine;

    public KIA() {
    }

    public KIA(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public KIA(Engine engine, String typeEngine) {
        super(engine);
        this.typeEngine = typeEngine;
    }

    @Override
    public String getEngineType() {
        return (toString() + "Type Engine KIA: " + super.getEngineType());
    }

    @Override
    public String toString() {
        return "KIA{" +
                "typeEngine='" + typeEngine + '\'' +
                '}';
    }
}
