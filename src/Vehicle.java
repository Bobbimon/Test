public abstract class Vehicle extends ValueObject {

    private int wheels;
    private int windows;

    protected Vehicle() {
    }

    protected Vehicle(AbstractBuilder<?, ?> builder) {
        this.wheels = builder.wheels;
        this.windows = builder.windows;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWindows() {
        return windows;
    }

    public static abstract class AbstractBuilder<B extends AbstractBuilder<B, T>, T extends Vehicle>
            implements ParentBuilder<B, T> {

        private int wheels;
        private int windows;

        public B withWheels(int wheels) {
            this.wheels = wheels;
            return self();
        }

        public B withWindows(int windows) {
            this.windows = windows;
            return self();
        }
    }
}
