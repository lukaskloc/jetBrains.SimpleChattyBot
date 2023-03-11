import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int typedNumber = scanner.nextInt();

        boolean result = typedNumber > -15 && typedNumber <= 12 ||
                typedNumber > 14 && typedNumber < 17 ||
                typedNumber >= 19;

        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}