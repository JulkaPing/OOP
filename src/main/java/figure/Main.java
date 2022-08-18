package figure;

public class Main {
    public static void main(String[] args) {
        PloskayaFigura parallelogramm = new PloskayaFigura("Green", 4);
        PloskayaFigura ellipse = new PloskayaFigura("Green", 9);
        ObemnayaFigura cylinder = new ObemnayaFigura("Yellow", 8);
        ObemnayaFigura parallelepiped = new ObemnayaFigura("Yellow", 16);

        System.out.println(parallelogramm.getColor() + " " + parallelogramm.getPerimetr());
        System.out.println(ellipse.getColor() + " " + ellipse.getPerimetr());
        System.out.println(cylinder.getColor() + " " + cylinder.getVolume());
        System.out.println(cylinder.getColor() + " " + cylinder.getVolume());


    }
}
