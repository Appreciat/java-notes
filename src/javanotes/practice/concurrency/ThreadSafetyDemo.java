package javanotes.practice.concurrency;

public class ThreadSafetyDemo {
    public static void main(String[] args) throws InterruptedException {
        // 线程安全的 StringBuffer
        StringBuffer safeBuffer = new StringBuffer();
        // 非线程安全的 StringBuilder
        StringBuilder unsafeBuilder = new StringBuilder();

        Runnable task1 = () -> {
            for (int i = 0; i < 10000; i++) {
                safeBuffer.append("A");
                unsafeBuilder.append("A");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 10000; i++) {
                safeBuffer.append("B");
                unsafeBuilder.append("B");
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuffer长度：" + safeBuffer.length());   // 预期 20000
        System.out.println("StringBuilder长度：" + unsafeBuilder.length()); // 可能小于20000，出现线程安全问题
    }
}