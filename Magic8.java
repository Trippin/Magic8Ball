
import java.util.Scanner;
import java.util.Random;

public class Magic8 {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        Scanner myScanner = new Scanner(System.in);

        System.out.println(" Please as your question!");

        myScanner.nextLine();

        int newNumber = Math.round(randomNumber.nextInt(8));

        System.out.print("Magic 8-Ball Says: ");
        switch (newNumber) {
            case 1:
                System.out.println("It is certain, isn't  it?");
                break;
            case 2:
                System.out.println("It is so.");
                break;
            case 3:
                System.out.println("It is not at all so.");
                break;
            case 4:
                System.out.println("Not At all!");
                break;
            case 5:
                System.out.println("You may rely on it.");
                break;
            case 6:
                System.out.println("It is DECIDEDLY So.");
                break;
            case 7:
                System.out.println("Yes.");
                break;
            case 8:
                System.out.println("As I see it.");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
