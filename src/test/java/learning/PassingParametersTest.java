package learning;

public class PassingParametersTest {
    public static void main(String[] args) {

        sayHello("Dusan");
        int sum = add(5, 5);
        System.out.println(sum);

        int result = sum * 5;
        System.out.println(result);

        System.out.println(add(5,8));

    }


    public static void sayHello (String name) {
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b) {
    return (a+b);
    }
}
