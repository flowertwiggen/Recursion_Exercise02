import javax.swing.*;

/**
 * Created by Daniel on 2016-11-07.
 */

public class Main {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Skriv in en text och testa om det är ett Palindrom:");

        Palindrom test = new Palindrom();


        if(test.checkText(input.trim().toLowerCase(), 0, input.length()-1) == true)
            JOptionPane.showMessageDialog(null, "Ja, \"" + input + "\" är ett Palindrom");
        else
            JOptionPane.showMessageDialog(null, "Nej, \"" + input + "\" är inte ett Palindrom");

    }

}


