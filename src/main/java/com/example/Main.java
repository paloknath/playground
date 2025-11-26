package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BarcodeScanner barcodeScanner = new BarcodeScanner();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add numbers");
            System.out.println("2. Calculate");
            System.out.println("3. Count letters");
            System.out.println("4. Send email");
            System.out.println("5. Add two numbers");
            System.out.println("6. Scan Barcode (Simulated)");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        Adder adder = new Adder();
                        System.out.print("Enter a number to add: ");
                        int numberToAdd = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Result: " + adder.add(numberToAdd));
                        break;
                    case 2:
                        Calculator calculator = new Calculator();
                        System.out.print("Enter expression (e.g., 1 + 1): ");
                        String expression = scanner.nextLine();
                        System.out.println("Result: " + calculator.calculate(expression));
                        break;
                    case 3:
                        LetterCounter letterCounter = new LetterCounter();
                        System.out.print("Enter a string: ");
                        String inputString = scanner.nextLine();
                        System.out.print("Enter the letter to count: ");
                        char letterToCount = scanner.nextLine().charAt(0);
                        System.out.println("Result: " + letterCounter.countLetters(inputString, letterToCount));
                        break;
                    case 4:
                        EmailSender emailSender = new EmailSender();
                        System.out.print("Enter recipient email: ");
                        String recipient = scanner.nextLine();
                        System.out.print("Enter email subject: ");
                        String subject = scanner.nextLine();
                        System.out.print("Enter email body: ");
                        String body = scanner.nextLine();
                        try {
                            emailSender.sendEmail(recipient, subject, body);
                            System.out.println("Email sent successfully!");
                        } catch (Exception e) {
                            System.out.println("Error sending email: " + e.getMessage());
                        }
                        break;
                    case 5:
                        NumberAdder numberAdder = new NumberAdder();
                        System.out.print("Enter first number: ");
                        int num1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter second number: ");
                        int num2 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Sum: " + numberAdder.add(num1, num2));
                        break;
                    case 6:
                        try {
                            String barcodeData = barcodeScanner.simulateScan(); // Simulate scanning
                            System.out.println("Scanned Barcode: " + barcodeData);
                        } catch (BarcodeScannerException e) {
                            System.out.println("Error scanning barcode: " + e.getMessage());
                        }
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}