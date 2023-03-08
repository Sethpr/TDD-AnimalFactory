package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    @Test
    public void testSpeak() {
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected,actual);
    }



    @Test
    public void setBirthDate() {
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();

        dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetId() {
        int expected = 12;
        Dog dog = new Dog(null, null, expected);

        int actual = dog.getID();

        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testAnimalInheritance() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testEat() {
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        int expected = 1;

        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
