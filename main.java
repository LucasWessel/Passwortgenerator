import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int psmin=4;
        int psmax=30;
        Scanner scanner = new Scanner(System.in);
        int pslang;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Gib die Lange ein: ");
            try {
                pslang = Integer.parseInt(scanner.nextLine());
                if (pslang < psmin || pslang > psmax) {
                    System.out.println("Die Passwort lange muss zwischen 4 und 30 liegen");
                } else {
                    validInput = true;
                }
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