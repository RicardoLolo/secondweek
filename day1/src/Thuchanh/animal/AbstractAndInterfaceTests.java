package Thuchanh.animal;

import Thuchanh.edible.Edible;
import Thuchanh.fruit.Apple;
import Thuchanh.fruit.Fruit;
import Thuchanh.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals [0] = new Tiger();
        animals [1] = new chicken();
        for (Animal animal : animals){
            animal.makeSound();

            if(animal instanceof chicken) {
                Edible edible = (chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit [] fruits = new Fruit[2];
        fruits [0] = new Orange();
        fruits [1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
     }
}
