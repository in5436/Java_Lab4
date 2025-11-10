package Java_Lab4;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {

    private final int maxCapacity;

    private List<T> animals;

    public Cage(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        if (animals.size() >= maxCapacity) {
            throw new CageFullException("Вольєр повний! Неможливо додати " + animal);
        }

        animals.add(animal);
        System.out.println(animal + " був доданий у вольєр.");
    }

    public void removeAnimal(T animal) {
        boolean removed = animals.remove(animal);

        if (!removed) {
            throw new AnimalNotFoundException(animal + " не знайдено у вольєрі.");
        }
        System.out.println(animal + " був видалений з вольєра.");
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getOccupancy() {
        return animals.size();
    }

    @Override
    public String toString() {
        return "Вольєр [" + getOccupancy() + "/" + getMaxCapacity() + " зайнято]";
    }
}