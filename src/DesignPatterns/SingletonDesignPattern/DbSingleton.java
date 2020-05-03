package DesignPatterns.SingletonDesignPattern;

public class DbSingleton {
    private static DbSingleton instance;

    private DbSingleton() {
        if (instance == null) {
            throw new RuntimeException("Use getInstance() to create a instance");
        }

    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }

        }
        return instance;
    }


}
