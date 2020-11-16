package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken : Chíp Chíp";
    }
    @Override
    public String howtoEat(){
        return "Chicken . . .";
    }

}
