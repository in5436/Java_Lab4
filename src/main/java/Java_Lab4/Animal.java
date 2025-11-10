package Java_Lab4;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (Ім'я: " + name + ")";
    }
}