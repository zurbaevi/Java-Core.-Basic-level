package ru.geekbrains.lesson6;

/**
 * Java Core. Basic level. Lesson 6
 *
 * @author Nika Zurbaevi
 * @version dated October 30, 2020
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog(400, 5, 0.5F),
                new Cat(250, 3)
        };
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() +
                    "\nrun: " + animal.run(400) +
                    "\njump: " + animal.jump(0.7) +
                    "\nswim: " + animal.swim(7));
        }
    }
}
