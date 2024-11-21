package learning;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // Integer

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(7);
        System.out.println(myNumbers.get(0));

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (String myCars : cars) {
            System.out.println(myCars);
        }



        //Change an Item
        cars.set(0, "Opel");
            System.out.println(cars.get(0));

        //Remove an Item
        cars.remove(0);
        System.out.println(cars.get(0));



        }
    }

