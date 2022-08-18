package figure;

public class ObemnayaFigura extends GeometricFigura {
    private int volume;

    public ObemnayaFigura(String color, int volume) {
        super("Yellow");
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
