package singleton;

/**
 * Responsible for creating only one instance of a project
 * Example :  Runtime.getRuntime()
 * It can be used when one wants one common place to do things e.g
 * managing threads, managing database connection, user interface etc ...
 */
public class SingletonExample {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager other = SingletonEager.getInstance();
        System.out.println(eager == other);
    }
}
