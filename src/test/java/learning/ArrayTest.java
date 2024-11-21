package learning;

import javax.print.attribute.standard.NumberUpSupported;

public class ArrayTest {

    public static void main(String[] args) {

        //Array - Store multiple values in a single variable

        String[] cars = {"Ford", "BMW", "Tesla", "Yugo"};

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers[2]);
        System.out.println(cars[0]);

        cars[0] = "Mustang";
        numbers[2] = 7;

        System.out.println(cars[0]);
        System.out.println(numbers[2]);


        //Second example

        String[] states = new String[5];
        states[0] = "New York";
        states[1] = "Florida";
        states[2] = "California";
        states[3] = "Alaska";
        states[4] = "Montana";

        System.out.println(states[0]);
        System.out.println(states[1]);
        System.out.println(states[2]);
        System.out.println(states[3]);
        System.out.println(states[4]);

        //CARS

        for (String myCars : cars) {
            System.out.println(myCars);
        }

        //NUMBERS

        for (int myNumbers : numbers) {
            System.out.println(myNumbers);
        }




    }
}
