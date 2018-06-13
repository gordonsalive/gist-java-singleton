package playground;

public class Singleton {
    private static int count = 0;
    private Singleton() {
        // private constructor
        count++;
    }
    private static Singleton myInstance;
    public static class SingletonHolder {
        //this inner class will only get created when it is first used, thread-safe
        public static Singleton singleton = new Singleton();
    }
    public static Singleton getSingleton() {
        return SingletonHolder.singleton;//only now will single get created, thread-safe, and be available from now on
    }
    public String sayHello() {
        return "Hello! count=" + count;
    }
}