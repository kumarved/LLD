package factoryDesignPattern;

public class factoryMainMethod {
    public static void main(String[] args) {

        FactoryMethod method = new FactoryMethod();

        Pet pet = method.createPet("cat");
        pet.playSound();
        Pet pet2 = method.createPet("dog");
        pet2.playSound();
    }
}
