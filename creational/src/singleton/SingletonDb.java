package singleton;

public class SingletonDb {
    private static SingletonDb instance;

    public static SingletonDb getInstance() {

        if (instance == null )
            synchronized (SingletonDb.class) {
                if (instance == null)
                    instance = new SingletonDb();
            }

        return instance;
    }
}
