package figure;

public class PloskayaFigura extends GeometricFigura {
    private int perimetr;

    public PloskayaFigura(String color, int perimetr) {
        super("Green");
        this.perimetr = perimetr;
    }

    public int getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(int perimetr) {
        this.perimetr = perimetr;
    }
}
