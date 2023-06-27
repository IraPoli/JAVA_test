package org.example.codingTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class Solution {
    public static boolean isPalindrome(int x) {
            String strX= String.valueOf(x);
            for (int i = 0; i< strX.length()/2; i++ ){
                if (strX.charAt(i)!=strX.charAt(strX.length()-1-i))
                { return false;}
            }
            return true;
    }
    public static boolean isValid(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).matches("\\{|\\(|\\[")){
                queue.add(s.charAt(i));}
            if(String.valueOf(s.charAt(i)).matches("}")){
                if (!Objects.equals(queue.pollLast(), '{')){
                    return false;};
            }
            if(String.valueOf(s.charAt(i)).matches("]")){
                if (!Objects.equals(queue.pollLast(), '[')){
                    return false;};
            }
            if(String.valueOf(s.charAt(i)).matches("\\)")){
                if (!Objects.equals(queue.pollLast(), '(')){
                    return false;};
            }
        }
        return queue.isEmpty();
    }

    public static boolean uniqueOccurrences(int[] arr) {
        AtomicBoolean result = new AtomicBoolean(true);
        int[] arr1 ={1,3,6};
        Arrays.stream(arr).forEach(e->{
            if( Arrays.stream(arr).filter(num->num==e).count()!=e){
                result.set(false);
            }
        });
        return result.get();
    }}

