import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int psmin=4;
        int psmax=30;
        int pslang = 0;
        boolean validInput = false;

        while (!validInput) {
            String input = JOptionPane.showInputDialog("Wie lang soll dein Passwort sein?\n(Mindestens " + psmin + " und maximal " + psmax );
            if(input == null) {
                System.exit(0);
            }
            try {
                pslang = Integer.parseInt(input);
                if (pslang < psmin || pslang > psmax) {
                    JOptionPane.showMessageDialog(null, "Bitte gib eine Zahl zwischen " + psmin + " und " + psmax + " ein.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte gib eine gültige Zahl ein.");
            }
        }
        String password = Passwort_gen(pslang);
        JOptionPane.showMessageDialog(null, "Dein generiertes Passwort ist :\n" + password + "\n Es wurde automatisch in die Zwischenablage kopiert.");
        StringSelection selection = new StringSelection(password);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
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
