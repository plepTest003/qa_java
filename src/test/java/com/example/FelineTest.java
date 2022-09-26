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
public class FelineTest {


    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);

    }
    @Test
    public void testFelineGetKittens(){
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());

    }
    @Test
    public void testFelineGetFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());

    }

}
