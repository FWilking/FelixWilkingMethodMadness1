package FelixWilking;

import java.lang.reflect.Array;

public class FelixWilkingLib {
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length(); ++i) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
                return false;
            }
        }

        return true;
    }
    public static String cutout(String strMain, String strSub){
        return strMain.substring(0,strMain.indexOf(strSub)) + strMain.substring(strMain.indexOf(strSub)+strSub.length());
    }
    public static String cypher(String plaintext, String key){
        int i = 0;
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cyphertext = "";
        while(i<plaintext.length()){
            int letter = plaintext.substring(i,i+1).compareTo(key.substring(i%key.length(),i%key.length()+1));
            cyphertext += alpha.substring(letter+24,letter+25);
            i++;
        }
        return cyphertext;

    }
}
