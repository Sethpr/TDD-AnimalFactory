package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void testCreateDog(){
        Date expectedDate = new Date();
        String expectedName = "fido";

        Dog dog = AnimalFactory.createDog(expectedName, expectedDate);

        Date actualDate = dog.getBirthDate();
        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }


    @Test
    public void testCreateCat(){
        Date expectedDate = new Date();
        String expectedName = "fido";

        Cat cat = AnimalFactory.createCat(expectedName, expectedDate);

        Date actualDate = cat.getBirthDate();
        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
