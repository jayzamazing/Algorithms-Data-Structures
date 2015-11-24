package com.adrianjaylopez.leetcode;

/**
 * Created by Jay on 11/22/15.
 */
public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int [] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c: count){
            if (c != 0)
                return false;
        }
        return true;
    }
}
