package polymorphism;

public class Main {
    public static void main(String[] args) {
        CarShop carShop = new CarShop();

        for (Car car : carShop.findAllCar()) {
            System.out.println(car.getEngineType());
        }
    }
}
