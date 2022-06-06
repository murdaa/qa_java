package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest { // создали тестовый класс

        private final String kindOfAnimal;
        private final List<String> expected; // создали поля тестового класса

        public AnimalTest(String kindOfAnimal, List<String> expected) {
            this.kindOfAnimal = kindOfAnimal;
            this.expected = expected; // создали конструктор тестового класса
        }

        @Parameterized.Parameters
        public static Object[] getListOfMealDataForHerbivoreAndPredator() {
            return new Object[][] {
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                    {"Рептилия", List.of("1", "2", "3")} // передали тестовые данные
            };
        }

        @Test
        public void testOfAnimalGetFood() throws Exception {
            Animal animal = new Animal(); // создали экземпляр класса
            try {
                List<String> actual = animal.getFood(kindOfAnimal); // обратились к полям тестового класса
                assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
            }
            catch (Exception exception) {
                System.out.println("Произошла ошибка!");
            }
        }

        @Test
        public void testOfAnimalGetFamily() {
            Animal animal = new Animal(); // создали экземпляр класса
            String actual = animal.getFamily(); // вызвали проверяемый метод
            String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
            assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }
}
