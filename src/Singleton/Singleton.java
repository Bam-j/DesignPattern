package Singleton;

class Singleton {
    private static Singleton onlyOneInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (onlyOneInstance == null) {
            onlyOneInstance = new Singleton();
        }
        return onlyOneInstance;
    }
}
