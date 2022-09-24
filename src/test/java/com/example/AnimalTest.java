package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {


    @Test
    public void testAnimalGetFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Травоядное");
        Assert.assertEquals(List.of("Трава", "Различные растения"), actual);
    }

    @Test
    public void testAnimalGetFoodPredator () throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Хищник");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void testAnimalanimalKind() {

        try {
            Animal animal = new Animal();
            System.out.println(animal.getFood("Насекомое"));
            Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e) {
            final String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            assertEquals( expected, e.getMessage());
            System.out.println("Exeption is checkec: " + expected);
        }
    }
}
