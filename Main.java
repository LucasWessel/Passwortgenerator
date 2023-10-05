import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int psmin = 4;
        int psmax = 30;
        int pslang = 0;
        boolean validInput = false;

        while (!validInput) {
            String input = JOptionPane.showInputDialog("Wie lang soll dein Passwort sein?\n(Mindestens " + psmin + " und maximal " + psmax + ")");
            if (input == null) {
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

        Progressbar(pslang);

        String password = Passwort_gen(pslang);
        JOptionPane.showMessageDialog(null, "Dein generiertes Passwort ist:\n" + password + "\n Es wurde automatisch in die Zwischenablage kopiert.");
        StringSelection selection = new StringSelection(password);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    }

    private static void Progressbar(int pslang) {
        String strength = (pslang >= 16) ? "stark" : (pslang >= 8 ? "mittel" : "schwach");

        JOptionPane.showMessageDialog(null, "Das Passwort entspricht der Stärke: " + strength, "Generiere Passwort", JOptionPane.PLAIN_MESSAGE);

        JProgressBar progressBar = new JProgressBar(0, 100);
        if (pslang >= 4) {
            progressBar.setValue(25);
        }
        if (pslang >= 8) {
            progressBar.setValue(50);
        }
        if (pslang >= 16) {
            progressBar.setValue(75);
        }
        if (pslang >= 30) {
            progressBar.setValue(100);
        }

        JOptionPane.showMessageDialog(null, progressBar, "Passwortstärke", JOptionPane.PLAIN_MESSAGE);
    }

    public static String Passwort_gen(int pslang) {
        StringBuilder fpassw = new StringBuilder();
        Random random = new Random();
        String able = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=[]{}|:;<>,.?/~'´";
        for (int i = 0; i < pslang; i++) {
            int index = random.nextInt(able.length());
            char symbol = able.charAt(index);
            fpassw.append(symbol);
        }
        StringSelection selection = new StringSelection(fpassw.toString());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        return fpassw.toString();
    }
}
