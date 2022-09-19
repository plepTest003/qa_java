package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Mock
    Lion lion;
    @Mock
    WildСat wildСat;

    @Mock
    Animal animal;

    @Mock
    Feline feline;

    @Mock
    Cat cat;

    @Test
    public void testLionGetFood() throws Exception {
        Animal animal = new Animal();
        Lion lion = new Lion(animal);

        System.out.println("Лев питаеться: " + lion.getFood());
        
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        
        assertEquals(expected, lion.getFood());

    };

    @Test
    public void testLionTrueSex() throws Exception {
        Lion lion = new Lion("Самец");
        System.out.println(lion.hasMane);
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void testLionFalseSex() throws Exception {
        Lion lion = new Lion("Самка");
        System.out.println(lion.hasMane);
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void testLionExeptionSex() throws Exception {

        try {
            Lion lion = new Lion("Кот");
            System.out.println(lion.hasMane);
            lion.doesHaveMane();
            Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e) {
            final String expected = "Используйте допустимые значения пола животного - самей или самка";
            assertEquals( expected, e.getMessage());
            System.out.println("Exeption is checkec: " + expected);
        }
    }

    @Test
    public void testLionGetKittens(){
        Lion lion = new Lion(wildСat);
        System.out.println(lion.getKittens());
        Mockito.when(lion.getKittens()).thenReturn(4);
        int countKittens = lion.getKittens();
        System.out.println(lion.getKittens());
        assertEquals(4, countKittens);
    }

    @Test
    public void testLionDoesHaveMane(){
        Lion lion = new Lion(wildСat);
        System.out.println(lion.doesHaveMane());

        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void testAnimalGetFoodFerbivore() throws Exception {
        Animal animal = new Animal();
        System.out.println(animal.getFood("Травоядное"));
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, animal.getFood("Травоядное"));
    }
    @Test
    public void testAnimalGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        System.out.println(animal.getFood("Хищник"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, animal.getFood("Хищник"));
    }
    @Test
    public void testAnimalGetFamily(){
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals( expected, animal.getFamily());
    }
    @Test
    public void testCatGetSound(){
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void testCatGetFood() throws Exception {
        WildСat feline = new Feline();
        Cat cat = new Cat((Feline) feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        System.out.println(cat.getFood());
        assertEquals(expected, cat.getFood());

    };

    @Test
    public void testFelineGetKittens(){
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());

    }

    @Test
    public void testFelineGetKittensParm(){
        Feline feline = new Feline();
        System.out.println(feline.getKittens(2));

        int countKittens = feline.getKittens(2);

        assertEquals(2, countKittens);

    }

    @Test
    public void testFelineGetFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());

    }

}
