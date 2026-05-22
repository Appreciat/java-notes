package javanotes.pattern.creational.singleton;

/**
 * @author 杨渡翔
 */
public class Singleton {
    /**
     * 将构造方法private
     * 使其外部无法通过new 来实例化Singleton
     */
    private Singleton() {}
    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
