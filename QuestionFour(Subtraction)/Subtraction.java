import java.util.Scanner;
import java.util.Random;

public class Subtraction {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate two random single-digit integers
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        // Ensure number1 >= number2, if not, swap them
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the student with the subtraction question
        System.out.println("What is " + number1 + " - " + number2 + "?");

        // Get the student's answer
        int answer = input.nextInt();

        // Check if the student's answer is correct
        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }

        // Close the scanner
        input.close();
    }
}
