import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int psmin=4;
        int psmax=30;
        int pslang = 0;
        boolean validInput = false;

        while (!validInput) {
            String input = JOptionPane.showInputDialog("Gib die Lange ein:");
            try {
                pslang = Integer.parseInt(input);
                if (pslang < psmin || pslang > psmax) {
                    JOptionPane.showMessageDialog(null, "Die Passwort lange muss zwischen 4 und 30 liegen");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte gib eine Zahl ein");
            }
        }
        String password = Passwort_gen(pslang);
        JOptionPane.showMessageDialog(null, "Dein Passwort ist: " + password);
    }



    public static String Passwort_gen(int pslang) {
        StringBuilder fpassw = new StringBuilder();
        Random random =new Random();
        String able = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=[]{}|:;<>,.?/~'´";
        for (int i = 0; i < pslang; i++) {
            int index = random.nextInt(able.length());
            char symbol = able.charAt(index);
            fpassw.append(symbol);
        }

        return fpassw.toString();

    }

}