package learning;

public class IFStatementTest {
    public static void main(String[] args) {

        myNumber();
        myAge();
        myTime();







    }

    static void myNumber() {

        int num = 10;
        if (num < 100) {
            System.out.println("My number is lesser then 100!");

        } else {
            System.out.println("My number is greater then 100!");
        }

    }

    static void myAge() {

        int myNumber = 18;
        if (myNumber > 18) {
            System.out.println("My number is greater the  18");
        } else if (myNumber == 18) {

            System.out.println("My number is equal to 18");
        }
        else {
            System.out.println("My number is not greater the 18");
        }
    }

    static void myTime() {
        int time = 7;
        if (time < 10) {
            System.out.println("Good Morning!");
        } else if (time < 20) {
            System.out.println("Good day!");
        }else {
            System.out.println("Good evening!");
        }
    }
}
