/*Example of Singleton Pattern.
 * Purpose: to ensure that a class has only one instance.
 * Typical use: logging class, managing connection to database, file manager
 */
package pl.patterns.singleton;

public class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {
        System.out.println("SingletonExample instance created.");
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
