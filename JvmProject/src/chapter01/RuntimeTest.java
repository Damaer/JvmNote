package chapter01;

public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.getClass().getName());

        System.out.println("maxMemory:  "+runtime.maxMemory()/1024/1024);
        System.out.println("totalMemory:  "+runtime.totalMemory()/1024/1024);
        System.out.println("freeMemory:  "+runtime.freeMemory()/1024/1024);
    }
}
