package learning;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {


        Scanner calculator = new Scanner(System.in);
        double firstNum, secondNum, sum;
        System.out.println("Enter first Number");
        firstNum = calculator.nextDouble();
        System.out.println("Enter second Number");
        secondNum = calculator.nextDouble();
        sum = firstNum / secondNum;
        System.out.println("The result of dividing your numbers is " + sum);
    }
}
