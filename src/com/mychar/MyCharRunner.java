package com.mychar;

public class MyCharRunner {
    public static void main(String[] args) {

        MyChar myChar = new MyChar('e');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isNumber());
        MyChar.printLoweCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
        MyChar.printNumbers();

    }
}
