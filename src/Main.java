import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double length1 = 0.0;
        double length2 = 0.0;
        double area= 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;


        boolean done = false;
        do {
            System.out.println("Please enter the length of the first side of the rectangle:  ");
            if (in.hasNextDouble()) {
                length1 = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("You said your length was " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);
        done = false;

        do {
            System.out.println("Please enter the length of the second side of the rectangle: ");
            if (in.hasNextDouble()) {
                length2 = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.next();
                System.out.println("You said your second length was " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        } while (!done);

        area = length1 * length2;
        perimeter = length1 + length2;
        diagonal = Math.sqrt((length1 * length1) + (length2 * length2));
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is: " + diagonal);







    }
}