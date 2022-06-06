package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;
    @Mock
    Predator predator;

    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(feline); // создали экземпляр класса
        String actual = cat.getSound(); // вызвали проверяемый метод
        String expected = "Мяу";
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }
}
