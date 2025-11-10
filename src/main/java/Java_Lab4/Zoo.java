package Java_Lab4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public List<Cage<? extends Animal>> cages;

    public Zoo() {
        this.cages = new ArrayList<>();
    }

    public void addCage(Cage<? extends Animal> cage) {
        this.cages.add(cage);
        System.out.println("Додано новий вольєр: " + cage);
    }

    public int getCountOfAnimals() {
        int total = 0;

        for (Cage<? extends Animal> cage : cages) {
            total += cage.getOccupancy();
        }
        return total;
    }
}