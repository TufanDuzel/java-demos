import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The user is asked to enter the number of characters.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int digit = scanner.nextInt();

        String lowercases = "qwertyuopasdfghjklizxcvbnm";
        String uppercases = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String password = "";

        for(int i = 0; i<digit; i++) {
            //Whether it is an uppercase or lowercase letter or a integer number is chosen randomly.
            int rand = (int) (Math.random() * 3);

            switch (rand) {
                case 0:
                    //Random number between 0-9 is generated and converted to String and added to the password.
                    password += String.valueOf((int) (Math.random() * 9));
                    break;
                case 1:
                    //Random number is selected from the total index number of lowercases.
                    rand = (int) (lowercases.length() * Math.random());
                    //Lowercase letter corresponding to the selected number is converted to String and added to the password.
                    password += String.valueOf(lowercases.charAt(rand));
                    break;
                case 2:
                    //Random number is selected from the total index number of uppercases.
                    rand = (int) (uppercases.length() * Math.random());
                    //Uppercase letter corresponding to the selected number is converted to String and added to the password.
                    password += String.valueOf(uppercases.charAt(rand));
                    break;
            }
        }

        System.out.println("Password: " + password);
    }
}