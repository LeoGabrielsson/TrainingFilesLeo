import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Filhantering{
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        String fil = "minfil.txt";
        int x;
        Random r = new Random();

        for (int i = 0; i <= 1920*1080; i++) {
            x = r.nextInt(0xffffff);
            intList.add(x);

        }
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(fil));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for (int i = 0; i < intList.size(); i++){
            try {
                out.write(intList.get(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}