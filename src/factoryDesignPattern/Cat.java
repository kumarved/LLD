package factoryDesignPattern;

public class Cat implements Pet{

    @Override
    public void playSound() {
        System.out.println("Meew Meew");
    }
}
