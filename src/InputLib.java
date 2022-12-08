import java.util.Scanner;

public class InputLib {

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean hasGoodInput = false;
        int input = 0;

        do {
            System.out.printf("%s between %d and %d: ", prompt, low, high);

            if(pipe.hasNextInt()) {
                input = pipe.nextInt();

                if(input >= low && input <= high) {
                    hasGoodInput = true;
                }
                else {
                    if(input < low) {
                        System.out.println("The number you entered was below the acceptable range. Please try again");
                    }
                    else {
                        System.out.println("The number you entered was above the acceptable range. Please try again");
                    }
                }
            }
            else {
                System.out.println("You did not enter an integer. Please try again.");
            }

            pipe.nextLine();
        } while(!hasGoodInput);

        return input;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean hasGoodInput = false;
        double input = 0;

        do {
            System.out.print(prompt +" between " + low + " and " + high + ": ");

            if(pipe.hasNextDouble()) {
                input = pipe.nextDouble();

                if(input >= low && input <= high) {
                    hasGoodInput = true;
                }
                else {
                    if(input < low) {
                        System.out.println("The number you entered was below the acceptable range. Please try again");
                    }
                    else {
                        System.out.println("The number you entered was above the acceptable range. Please try again");
                    }
                }
            }
            else {
                System.out.println("You did not enter an double. Please try again.");
            }

            pipe.nextLine();
        } while(!hasGoodInput);

        return input;
    }

    public static boolean getYNComfirm(Scanner pipe, String prompt) {
        boolean confirm = false;
        char input;

        System.out.print(prompt + " (Y/N): ");

        input = pipe.nextLine().toLowerCase().charAt(0);

        if(input == 'y') {
            confirm = true;
        }

        return confirm;
    }
}