import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pslang;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Gib die gewünschte Länge an: ");
            try {
                pslang = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println ("Bitte gib eine Zahl ein");
            }
        }
        System.out.printf("Dein Passwort: "+"///retun von Methode///");
    }



    public static String Passwort_gen(int pslang) {

        Random random =new Random();
        String able = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=[]{}|:;<>,.?/~'´";


        StringBuilder fpassw = new StringBuilder();


        return null;
    }

}