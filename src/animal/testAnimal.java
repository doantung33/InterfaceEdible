package animal;

import edible.Fruit;
import Fruit.*;

public class testAnimal {
    public static void main (String[]arge){
        Animal[]animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[]fruits=new Fruit[2];
        fruits[0]=new Apple();
        fruits[1]=new Orange();
        for (Fruit a:fruits){
            System.out.println(a.howtoEat());
        }


    }
}
