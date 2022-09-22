package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Mock
    Animal animal;

    @Test
    public void testAnimalGetFood() throws Exception {
        Mockito.when(animal.getFood(Mockito.anyString())).thenReturn((List) Collections.singletonList("Test"));
        System.out.println(animal.getFood("Травоядное")); // выведется 5
        System.out.println(animal.getFood("Т"));
        String actual;
        Assert.assertEquals(List.of("Test"), animal.getFood(Mockito.anyString()));
    }
}
