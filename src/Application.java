import java.util.Arrays;
import java.util.Scanner;

public class Application {
    private static boolean newOne;
    private static Person[] people = new Person[1];
    private static int counter = people.length - 1;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fillArray();
        printAllPeople();
    }

    private static void printAllPeople() {
        System.out.println(Arrays.toString(people));
    }

    public static void fillArray() {
        System.out.println("Create a new Person. Type in: firstname, lastname, age, isMarried (true/false)");
        people[counter] = new Person(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        if (counter == people.length - 1) {
            doubleArrayLength();
        }
        System.out.println("Do you want to create another Person? true / false");
        if (scanner.nextBoolean()) {
            fillArray();
        }
    }

    public static void doubleArrayLength() {
        Person[] newArray = new Person[people.length * 2];
        for (int i = 0; i < people.length; i++) {
            newArray[i] = people[i];
        }
        people = newArray;
    }
}
