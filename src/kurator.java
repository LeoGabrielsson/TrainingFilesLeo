import java.util.Scanner;

public class kurator {
    public static void main(String[] args) {
        Scanner talk = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Curator: Good day! What would you like to talk about?");
        int samleng = (int) Math.round((Math.random() * 4) + 1);
        String subject = talk.nextLine();  // Read user input

        String[] responses ={"Curator: F.", "Curator: 💀. Buy the expansion: Sympathetic Responses for 19,99£ for a better response.", "Curator: Sucks to suck.", "Curator: Bozo.", "Curator: Don't care. Didn't ask.", "Curator: You fucking garbage ass fucking scrub!", "Curator: MAN I CAN'T FUCKING DEAL WITH THIS! *throws stethoscope*", "Curator: Dude we can't talk about that... Not since the accident."};
        int response = (int) Math.round((Math.random() * 8));

        System.out.println(responses[response]);
    }
}
