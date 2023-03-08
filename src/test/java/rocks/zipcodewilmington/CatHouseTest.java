package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Test
    public void testAddCat(){
        CatHouse.clear();
        int expectedCats = 1;
        Cat cat = AnimalFactory.createCat("fluffy", new Date());

        CatHouse.add(cat);

        int actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void testRemoveById(){
        CatHouse.clear();
        int expectedCats = 0;
        Cat cat = AnimalFactory.createCat("mittens", new Date());
        int id = cat.getId();
        CatHouse.add(cat);

        CatHouse.remove(id);
        int actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void testRemoveByCat(){
        CatHouse.clear();
        int expectedCats = 0;
        Cat cat = AnimalFactory.createCat("garfield", new Date());
        CatHouse.add(cat);

        CatHouse.remove(cat);
        int actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        CatHouse.clear();
        Cat expectedCat = AnimalFactory.createCat("charmian meow", new Date());
        int id = expectedCat.getId();
        CatHouse.add(expectedCat);

        Cat actualCat = CatHouse.getCatById(id);

        Assert.assertTrue(expectedCat.equals(actualCat));
    }

    @Test
    public void testGetNumberOfCats(){
        CatHouse.clear();
        int expectedCats = 1;
        CatHouse.add(AnimalFactory.createCat("ra", new Date()));

        int actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }
}
