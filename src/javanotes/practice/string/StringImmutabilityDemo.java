package javanotes.practice.string;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        // String
        String str = "Hello";
        System.out.println(System.identityHashCode(str)); // 原对象地址
        str += " World"; // 修改
        System.out.println(System.identityHashCode(str)); // 新对象地址

        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(System.identityHashCode(sb)); // 原对象地址
        sb.append(" World"); // 修改
        System.out.println(System.identityHashCode(sb)); // 地址不变

        // StringBuilder
        StringBuilder sbuilder = new StringBuilder("Hello");
        System.out.println(System.identityHashCode(sbuilder)); // 原对象地址
        sbuilder.append(" World"); // 修改
        System.out.println(System.identityHashCode(sbuilder)); // 地址不变
    }
}