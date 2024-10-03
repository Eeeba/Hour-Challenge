import java.util.Scanner;

public class calculator {
    static int sub(int dif) {
            System.out.println("Subtraction Result: " + dif);
            return dif;
        }
        static int add(int sum) {
            System.out.println("Addition Result: " + sum);
            return sum;
        }
    public static void main(String[] args) {
        // variables and scanner
        int numberOne;
        int numberTwo;
        Scanner kbd = new Scanner(System.in);
        // receive information and use methods
        System.out.println("Enter the first number: ");
        numberOne = kbd.nextInt();
        System.out.println("Enter the second number: ");
        numberTwo = kbd.nextInt();
        // close scanner
        kbd.close();
        // display results
        add(numberOne + numberTwo);
        sub(numberOne - numberTwo);
    }
}
