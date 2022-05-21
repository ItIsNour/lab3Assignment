import java.util.Scanner;

public class AtmPin {

    public static boolean validPIN(int user, int orignal){



        return user==orignal;

    }

    public static int getPin(Scanner sc){



        System.out.print("Enter PIN: ");

        int pin = sc.nextInt();

        return pin;

    }


}