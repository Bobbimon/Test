public class Car extends Vehicle {

    private String brand;

    private Car() {
    }

    private Car(Builder builder) {
        super(builder);
        this.brand = builder.brand;
    }

    public String getBrand() {
        return brand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Vehicle.AbstractBuilder<Builder, Car> {

        private String brand;

        public Builder withBrand(String brand) {
            this.brand = brand;
            return self();
        }

        @Override
        public Builder self() {
            return this;
        }

        @Override
        public Car build() {
            return new Car(this);
        }
    }
}
