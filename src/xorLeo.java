import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class xorLeo {
    static void crypt(){
        //String meddelande = JOptionPane.showInputDialog("Skriv");
        int message = 'H';
        int key = '(';
        String message2 = Integer.toBinaryString(message);
        String keystep2 = Integer.toBinaryString(key);
        int message3 = Integer.parseInt(message2);
        int keystep3 = Integer.parseInt(keystep2);
        char crypted = (char)(message3^keystep3);
        System.out.println(crypted);

    }
    public static void main(String[] args) {
        crypt();
    }
}
