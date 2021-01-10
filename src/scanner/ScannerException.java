package scanner;

import java.util.Scanner;

public class ScannerException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert the first number: ");
        int a = scanner.nextInt();


        System.out.println("insert the second number: ");
        int b = scanner.nextInt();

        int c = a + b;
        System.out.println("the total is: " + c);


    }
}
