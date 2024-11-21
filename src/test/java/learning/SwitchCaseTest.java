package learning;

public class SwitchCaseTest {

    public static void main(String[] args) {

        String cat = "Lucy";

        switch (cat) {
            case "Tom":
                System.out.println("Good cat!");
                break;
            case "Lucy":
                System.out.println("Bad cat!");
                break;
            default:
                System.out.println("Try a different Cat");
        }
    }
}
