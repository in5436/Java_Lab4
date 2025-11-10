package Java_Lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CageTest {

    private Cage<Lion> lionCage;

    @BeforeEach
    void setUp() {
        lionCage = new Cage<>(2);
    }

    @Test
    void testAddAnimal_Success() {
        Lion simba = new Lion("Сімба");

        lionCage.addAnimal(simba);

        assertEquals(1, lionCage.getOccupancy());
        assertEquals(2, lionCage.getMaxCapacity());
    }

    @Test
    void testAddAnimal_ThrowsCageFullException() {
        lionCage.addAnimal(new Lion("Сімба"));
        lionCage.addAnimal(new Lion("Алекс"));

        Lion shram = new Lion("Шрам"); // Третій лев

        assertThrows(CageFullException.class, () -> {
            lionCage.addAnimal(shram);
        });
    }

    @Test
    void testRemoveAnimal_ThrowsAnimalNotFoundException() {
        Lion simba = new Lion("Сімба");
        Lion notInCageLion = new Lion("Муфаса");

        lionCage.addAnimal(simba);

        assertThrows(AnimalNotFoundException.class, () -> {
            lionCage.removeAnimal(notInCageLion);
        });
    }
}