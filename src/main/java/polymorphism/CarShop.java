package polymorphism;

public class CarShop {
    public Car[] findAllCar() {
        return new Car[] {
                new Toyota("benz"),
                new Mazda("dizel"),
                new KIA("gaz")
        };
    }
}
