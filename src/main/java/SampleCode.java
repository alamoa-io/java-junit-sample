public class SampleCode {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = addNumbers(a, b);
        System.out.println("Result: " + result);

        for (int i = 0; i < 3; i++) {
            System.out.println("Loop i = " + i);
        }

        greet("Taro");
    }

    public static int addNumbers(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void greet(String name) {
        String message = "Hello, " + name + "!";
        System.out.println(message);
        test();
    }
    public static void test(){
        System.out.println("test");
    }
}
