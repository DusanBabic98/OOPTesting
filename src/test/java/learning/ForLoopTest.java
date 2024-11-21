package learning;

public class ForLoopTest {
    public static void main(String[] args) {

        //Loop
        for (int i = 0; i <=5; i++) {
            System.out.println("Loop " + i);
        }

        //Break loop
        for (int i = 1; i <=10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("Break Loop " + i);
            }
        //Continue Loop
        for (int i = 1; i <=10; i++) {
            if (i == 7) {
                continue;
            }
                System.out.println("Continue Loop " + i);
            }
        }
        }


