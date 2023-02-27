package org.example.codingTasks;

public class StringTask {
    // reverse a string
    public static String reverseString(String str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }


    // ?              zero or one occurrence
    // *              zero or more occurrence
    // +              a+b  is - ab, aab..
    // {n}            exact number of occurrence  [ab]{4}
    //{min, max}      minimum and maximum occurrence
    // .              mach any  character
    //[^abc]          accept abc
    //[a-z]           range
    // \s             space
    // \S             not space
    // \d             digit
    // \D             motDigit
    // \w             any words, character
    // ^              beginning of string
    // $              end of string

    public static boolean isVowelPresent(String str){
         String regex =".*[aeiou].*";
        return str.toLowerCase().matches(regex);
    }
}
