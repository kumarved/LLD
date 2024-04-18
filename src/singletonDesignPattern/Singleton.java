package singletonDesignPattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Instance Created");
    }

    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static void doSomeThing(){
        System.out.println("Somethong is Done.");
    }
}
