import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {


    @Test
    public void eatOnce() {
        Animal animal = new Animal();
        int expectedResult = 49;

        animal.eat();
        int result = animal.getHunger();

        assertEquals(expectedResult, result);
    }

    @Test
    public void eatMultipleTimes() {
        Animal animal = new Animal();
        int expectedResult = 45;

        for (int i = 0; i < 5; i++) {
            animal.eat();
        }
        int result = animal.getHunger();

        assertEquals(expectedResult, result);
    }

    @Test
    public void eatTooMuch() {
        Animal animal = new Animal();
        int expectedResult = 0;

        for (int i = 0; i < 100; i++) {
            animal.eat();
        }
        int result = animal.getHunger();

        assertEquals(expectedResult, result);
    }

    @Test
    public void playOnce() {
        Animal animal = new Animal();
        int expectedResult = 51;

        animal.play();
        int result = animal.getHunger();

        assertEquals(expectedResult, result);
    }

    @Test
    public void playMultipleTimes() {
        Animal animal = new Animal();
        int expectedResult = 45;

        for (int i = 0; i < 5; i++) {
            animal.play();
        }
        int result = animal.getHunger();

        assertEquals(expectedResult, result);
    }

    @Test
    public void playTooMuch() {
        Animal animal = new Animal();
        int expectedResult = 150;

        for (int i = 0; i < 100; i++) {
            animal.play();
        }
        int result = animal.getHunger();

        assertEquals(expectedResult, result);
    }

}