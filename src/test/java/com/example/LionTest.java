package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sexOption;
    private final boolean expected;

    public LionTest(String sexOption, boolean expected) {
        this.sexOption = sexOption;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getListOfMealDataForHerbivoreAndPredator() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testSexLionPositive() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sexOption);
        boolean actual = lion.hasMane;
        assertEquals(expected, actual);
    }

    @Test
    public void testLionDoesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sexOption);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void testSexLionException() throws Exception {
        Feline feline = new Feline();
        String sexInvalidOption = "неизвестно";
        Exception actualException = null;
        try {
            new Lion(feline, sexInvalidOption);
            } catch (Exception e) {
                actualException = e;
            }
            Assert.assertNotNull(actualException);
        }


    @Test
    public void testLionGetKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sexOption);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }


    @Test
    public void testLionGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sexOption);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}