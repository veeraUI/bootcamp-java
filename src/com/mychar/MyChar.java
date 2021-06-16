package com.mychar;

import java.util.ArrayList;

public class MyChar {
    private char myChar;
   private char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public void setmyChar(char myChar){
        this.myChar = myChar;
    }
    public char getmyChar() {
        return myChar;
    }
    MyChar() {

    }
    MyChar(char m){
        setmyChar(m);
    }

    public boolean isVowel() {
        int count = 0;
        for(char c : vowels) {
            if(c == myChar) {
                count++;
            }
        }
        return count > 0;
    }

    public boolean isNumber() {
        return myChar >=48 && myChar <= 57;
    }
    public boolean isAlphabet() {
        return  myChar >= 97 && myChar <=122;
    }

    public static void printLoweCaseAlphabets() {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    };

    public static void printNumbers() {
        for(int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
    }

    public static void printUpperCaseAlphabets() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    };

}
