package Java_Lab4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Це файл Main.java
public class Main {
    public static void main(String[] args) {

        Lion simba = new Lion("Сімба");
        Eagle zoe = new Eagle("Зоя");
        Zebra marty = new Zebra("Марті");
        Giraffe melman = new Giraffe("Мелман");
        Lion alex = new Lion("Алекс");

        Cage<Lion> lionCage = new Cage<>(2);

        Cage<Bird> birdCage = new Cage<>(5);

        Cage<Hoofed> hoofedCage = new Cage<>(10);

        lionCage.addAnimal(simba);
        lionCage.addAnimal(alex);

        birdCage.addAnimal(zoe);

        hoofedCage.addAnimal(marty);
        hoofedCage.addAnimal(melman);

        System.out.println("\n--- Стан вольєрів ---");
        System.out.println("Леви: " + lionCage);
        System.out.println("Птахи: " + birdCage);
        System.out.println("Копитні: " + hoofedCage);

        try {
            System.out.println("\n--- Тестуємо винятки ---");
            lionCage.addAnimal(new Lion("Шрам"));

        } catch (RuntimeException e) {
            System.err.println("ПОМИЛКА: " + e.getMessage());
        }

        System.out.println("\n--- Тестуємо Зоопарк ---");
        Zoo myZoo = new Zoo();
        myZoo.addCage(lionCage);
        myZoo.addCage(birdCage);
        myZoo.addCage(hoofedCage);

        System.out.println("Загальна кількість тварин у зоопарку: " + myZoo.getCountOfAnimals());
    }
}