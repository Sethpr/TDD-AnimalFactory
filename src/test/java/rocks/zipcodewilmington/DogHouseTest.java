package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Test
    public void testAddDog(){
        int expectedDogs = DogHouse.getNumberOfDogs()+1;
        Dog Dog = AnimalFactory.createDog("fido", new Date());

        DogHouse.add(Dog);

        int actualDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void testRemoveById(){
        int expectedDogs = DogHouse.getNumberOfDogs();
        Dog Dog = AnimalFactory.createDog("spot", new Date());
        int id = Dog.getId();
        DogHouse.add(Dog);

        DogHouse.remove(id);
        int actualDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void testRemoveByDog(){
        int expectedDogs = DogHouse.getNumberOfDogs();
        Dog Dog = AnimalFactory.createDog("cat", new Date());
        DogHouse.add(Dog);

        DogHouse.remove(Dog);
        int actualDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, actualDogs);
    }
    @Test
    public void testGetDogById(){
        Dog expectedDog = AnimalFactory.createDog("creative dog name", new Date());
        int id = expectedDog.getId();
        DogHouse.add(expectedDog);

        Dog actualDog = DogHouse.getDogById(id);

        Assert.assertTrue(expectedDog.equals(actualDog));
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
