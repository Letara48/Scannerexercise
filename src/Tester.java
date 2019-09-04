import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
//        String firstInitial = "P";
//        String lastName = "Sherman";
//        int houseNumber = 42;
        System.out.println("Enter your first initial, last name, and house number: ");

        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        int houseNumber = keyboard.nextInt();

        keyboard.nextLine();
//        String streetName = "Wallaby";
//        String streetType = "Way";
//        String city = "Sydney";
        System.out.println("Enter your street name, street type, and city: ");
        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


    }


}
