package org.example;


import org.apache.http.util.TextUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        checkForPalindrome("Racecar");
        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String str){

        String lower = str.toLowerCase(Locale.ENGLISH);
        String[] separated = lower.split("[ .,?!_-]+");
        String first = String.join("", separated); // boşluksuz birleştir

        System.out.println(first);

        String reversed = "";

            for(int j = first.length() -1; j >= 0;j-- ) {
                reversed = reversed + first.charAt(j);
            }

        System.out.println(reversed);

        if(reversed.equals(first)){
            System.out.println("Çalıştı");
            return true;
        } else {
            System.out.println("Hata");
            return false;
        }
    }

    public static String convertDecimalToBinary(int val) {
        List <String> arr = new ArrayList<>();

        if (val == 0) return "0";

        while(val > 0) {
            arr.add(String.valueOf(val %2));
            val = val / 2;
        }
        Collections.reverse(arr);

        return String.join("", arr);
    }
}


