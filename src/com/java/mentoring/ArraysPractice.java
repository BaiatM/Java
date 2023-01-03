package com.java.mentoring;

import java.lang.reflect.Array;

public class ArraysPractice {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwpak"));
//   a+b+c+
    }

        public static int lengthOfLongestSubstring (String s){
            String[] stringL = new String[s.length()];
            String longest = "";
            int count = 0;
            int max = 0;

            for (int i = 0; i < s.length(); i++) {
                if (!longest.contains(s.substring(i, i + 1))) {
                    longest = longest + s.charAt(i);
                } else {
                    stringL[count] = longest;
                    count++;
                    break;
                }
            }

            for (String a : stringL) {
                if (a.length() > max) {
                    max = a.length();
                }
            }

        return max;
    }
}
