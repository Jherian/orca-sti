public class TestCar {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Car.MAKE);
        System.out.println("Number of cars manufactured: " + Car.numCars);

        System.out.println("");

        Car car1 = new Car("Camry");
        System.out.println(car1);

        System.out.println("");

        Car car2 = new Car("Veloz");
        System.out.println(car2);

        System.out.println("");

        System.out.println("Number of cars manufactured: " + Car.numCars);
    }
}
