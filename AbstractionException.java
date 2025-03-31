import java.util.Scanner;

class AbstractionException {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance tv = new TV();

        fan.turnOn();
        tv.turnOn();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter integer numbers only."); // more specific message
        } finally {
            scanner.close();
        }
    }
}