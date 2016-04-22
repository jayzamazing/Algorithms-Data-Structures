package com.adrianjaylopez;

/**
 * This class is used to see if a word is an anagram of another word or not. O(n) time
 * @author Adrian J Lopez
 * @since <pre>11/22/15</pre>
 * @version 1.0
 */
public class Anagram {
    /**
     * Method to verify if a word is an anagram of another.
     * @param s first string to compare
     * @param t second string to compare
     * @return true if word is anagram false if not anagram or word lengths do not match
     */
    public boolean isAnagram(String s, String t) {
        //if the length of the first word does not match the second word
        if(s.length() != t.length())
            return false;
        int [] count = new int[26];//declare and initialize array
        //loop while length of string is not reached
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;//add one to array for character
            count[t.charAt(i) - 'a']--;//substract one from array for character
        }
        //loop over count array
        for(int c: count){
            if (c != 0)//if any character in array is not zero
                return false;
        }
        return true;//true if strings are anagram
    }
}
