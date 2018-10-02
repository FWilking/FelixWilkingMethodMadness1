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
        String keytext = "";
        String cyphertext = "";
        while(i<plaintext.length()){
            plaintext.substring(i,i+1).compareTo(key.substring(i%key.length()))
            i++;
        }
        return keytext;

    }
}
