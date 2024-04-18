package singletonDesignPattern;

public class EgerInitialization {


    private static EgerInitialization obj = new EgerInitialization();

    private EgerInitialization() {
        System.out.println("EgerInitialization object created");
    }

    public static EgerInitialization getInstance() {
        return obj;
    }
}
