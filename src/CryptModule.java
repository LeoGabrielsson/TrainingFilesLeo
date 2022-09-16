import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class CryptModule {

    String text = JOptionPane.showInputDialog(null,"Write message");
    char[] textArray;
    int[] cryptArray;
    String crypt;
    int key = '¤';

    while(key.length() < text.length()){
            key += key;
        }
    public void StrToArr(String text){
        for(int x = 0 ; x < text.length() ; x++){
            textArray[x] += text.charAt(x);
        }

    }


    public void ArrToInt(){
        for(int x = 0 ; x <= text.length() ; x++){}

    }


    public void encrypt(int text, int key){
        for(int x = 0 ; x <= () ; x++){
            crypt[x] = encrypt(crypt);
        }
    }
    public String getCrypt(){
        return crypt;
    }

    }

