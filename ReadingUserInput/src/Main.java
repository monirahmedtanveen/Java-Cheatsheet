import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2022 - yearOfBirth;
//
//            if (age >= 0 && age <= 100) {
//                System.out.println("Your Name: " + name + " and your year of birth: " + yearOfBirth + " and your age is " + age);
//            } else {
//                System.out.println("Invalid year of birth Input");
//            }
//
//
//        } else {
//            System.out.println("Unable to parse your year of birth.");
//        }

//        int number;
//        int sum = 0;
//        int counter = 1;
//        while (counter <= 10) {
//            System.out.println("Enter Number #" + counter);
//            boolean isNextInt = scanner.hasNextInt();
//            if (isNextInt) {
//                number = scanner.nextInt();
//                sum += number;
//                counter++;
//            } else {
//                System.out.println("Invalid Input.");
//            }
//
//            scanner.hasNextLine();
//        }
//
//        System.out.println("Sum of 10 numbers: " + sum);
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter Number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Sum of 10 numbers: " + sum);

        scanner.close();
    }
}
