package chapter01;

public class PrintlnTest {

    // 准备阶段，只会为n分配内存并且赋值为0
    public static int n = 1;
    // 在编译期间已经分配内存，准备阶段赋值
    public static String name = "Sam";

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
