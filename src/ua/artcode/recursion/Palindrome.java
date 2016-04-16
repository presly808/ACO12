package ua.artcode.recursion;

/**
 * Created by serhii on 16.04.16.
 */
public class Palindrome {

    // abcba
    // bcb
    // c
    // ''
    public static boolean isPalindrome(String input){

        if(input.length() <= 1){
            return true;
        }

        if(input.charAt(0) != input.charAt(input.length() - 1)){
           return false;
        }

        String substring = input.substring(1, input.length() - 1);
        return isPalindrome(substring);
    }


}
