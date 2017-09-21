public abstract class ValueObject {

    @Override
    public String toString() {
        return ReflectionBasedToStringBuilder.toString(this);
    }
}
