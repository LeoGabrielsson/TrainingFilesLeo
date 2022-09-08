import java.io.*;

public class Filhantering {
    public static void main(String[] args) {
        String filnamn = "minfil.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filnamn);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);
        FileReader fr = null;
        try {
            fr = new FileReader(filnamn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFil = new BufferedReader(fr);
    }
}
