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
    @Mock
    Feline feline;

    @Test
    public void testFelineEatMeat() throws Exception {

        System.out.println(feline.eatMeat());
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Т", "Р"));
        System.out.println(feline.eatMeat());
        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Т", "Р"), actual);

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
