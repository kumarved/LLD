package factoryDesignPattern;

public class FactoryMethod {

    public Pet createPet(String petName){

        if(petName.equals("cat")) {
            return new Cat();
        }
        else if (petName.equals("dog")) {
            return new Dog();
        }
        else{
            return null;
        }
    }
}
