package ru.geekbrains.lesson5;

/**
 * Java Core. Basic level. Lesson 5
 *
 * @author Nika Zurbaevi
 * @version dated October 29, 2020
 */
public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Ivan", "Ivanov", "Engineer", "ivan.ivanov@mail.ru", "892312312", 4000, 29),
                new Person("Sergey", "Ivanov", "Physician", "sergey.ivanov@mail.ru", "892311234", 5000, 45),
                new Person("Nick", "Ivanov", "Baker", "nick.ivanov@mail.ru", "892314321", 3000, 19),
                new Person("John", "Ivanov", "Bricklayer", "john.ivanov@mail.ru", "892314567", 2000, 31),
                new Person("Patrick", "Ivanov", "Carpenter", "patrick.ivanov@mail.ru", "892317685", 1000, 43)
        };

        for (Person person : persons) {
            if (person.getAge() > 40) person.show();
        }
    }
}
