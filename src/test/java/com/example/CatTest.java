package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void testCatGetSound(){
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void testCatGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        System.out.println(cat.getFood());
        assertEquals(expected, cat.getFood());
    };
}
