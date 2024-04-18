package singletonDesignPattern;

public class mainMethod {

    public static void main(String[] args) {

        //Singleton s1 = Singleton.getInstance();

        //EgerInitialization egerInitialization = EgerInitialization.getInstance();

        DoubleCheckLocking singleton = DoubleCheckLocking.getInstance();
    }
}
