import javax.swing.*;

public class Greetings {
    public static void main(String[] args) {
        String greeting = JOptionPane.showInputDialog(null, "Greet me with optional ammounts of e's in Hey");
        String greetingReply = "";
        String es = "";
        for (int bokstav = 0; bokstav < greeting.length(); bokstav++){
            char c = greeting.charAt(bokstav);
            if (c == 'e'){
                es += "ee";
            }else{
                es += c;
            }
        }
        System.out.println(es);
    }
}
