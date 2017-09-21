public class Main {
    public static void main(String[] args) {

        Car car = Car.builder()
                .withBrand("Volvo")
                .withWheels(4)
                .withWindows(6)
                .build();

        System.out.println(car);
    }
}
