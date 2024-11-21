package learning;

public class StringsTesting {

    public static void main(String []args) {

        String name = "Dusan Babic";

        System.out.println("My Name is " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Lenght: " + name.length());
        System.out.println("Substring: " + name.substring(6,  11));
    }
}
