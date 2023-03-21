package com.java.codingBat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InterviewPrep {
    public static void main(String[] args) {
        //Reverse Words of String
        // This is Java Programs -> Programs Java is This
        String str = "This is Java Programs";
        String [] arr = str.split(" ");
        System.out.println(str);
        for(int i = arr.length;i>0;i--){
            System.out.print(arr[i-1]+" ");
        }

        //Compress String
        // aabbbccccd -> a2b3c4d1
        String exp = "aabbbccccd";
        HashMap<Character,Integer> set = new HashMap<>();
        int count = 1;
        for(int i=0;i<exp.length();i++){
            Character c = exp.charAt(i);
            if(!set.containsKey(c)){
                set.put(c,count);
            }else{
                set.put(c,set.get(c)+1);
            }
        }
        System.out.println("\n"+set);
    }
}
