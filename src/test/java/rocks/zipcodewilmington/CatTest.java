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
public class CatTest {
    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Milo";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }


    @Test
    public void testSpeak() {
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected,actual);
    }



    @Test
    public void setBirthDate() {
        Cat cat = new Cat(null, null, null);
        Date expected = new Date();

        cat.setBirthDate(expected);

        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testEat() {
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        int expected = 1;

        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetId() {
        int expected = 12;
        Cat cat = new Cat(null, null, expected);

        int actual = cat.getID();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
