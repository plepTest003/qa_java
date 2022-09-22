package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Predator predator;

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
    public void testLionExeptionSex() {

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
        Lion lion = new Lion(predator);
        System.out.println(lion.getKittens());
        Mockito.when(lion.getKittens()).thenReturn(4);
        int countKittens = lion.getKittens();
        System.out.println(lion.getKittens());
        assertEquals(4, countKittens);}
    @Test
    public void testLionDoesHaveMane(){
        Lion lion = new Lion(predator);
        System.out.println(lion.doesHaveMane());

        assertEquals(false, lion.doesHaveMane());
    }
    @Test
    public void testLionGetFood() throws Exception {

        Lion lion = new Lion(predator);

        System.out.println("Лев питаеться: " + lion.getFood());

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, lion.getFood());
    }


}