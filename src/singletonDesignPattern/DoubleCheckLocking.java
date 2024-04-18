package singletonDesignPattern;

public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking instance;

    private DoubleCheckLocking() {
        System.out.println("DoubleCheckLocking created");
    }

    public static DoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }

}
