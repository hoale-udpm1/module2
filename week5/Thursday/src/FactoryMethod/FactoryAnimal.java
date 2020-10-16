package FactoryMethod;

public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("Canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
