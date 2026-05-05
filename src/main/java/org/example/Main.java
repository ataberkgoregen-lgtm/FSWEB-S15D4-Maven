package org.example;


import org.apache.http.util.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        checkForPalindrome("Racecar");
        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String str){

        String lower = str.toLowerCase();
        String[] seperated = lower.split("[ .,?!_-]+");
        String first = String.join(" ", seperated);

        System.out.println(first);

        List <String > sentece = new ArrayList<>();
        for (int i = seperated.length -1 ; i >= 0; i-- ){
            String word = "";
            String[] letter = seperated[i].split("");
            for(int j = letter.length -1; j >= 0;j-- ){
                word = word + letter[j];
            }
            sentece.add(word);
        }

        String joinde = String.join(" ", sentece);
        System.out.println(joinde);

        if(joinde.equals(first)){
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


