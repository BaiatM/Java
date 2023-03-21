package com.java.codingBat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InterviewPrep {
    public static void main(String[] args) {
        //Reverse Words of String
        // This is Java Programs -> Programs Java is This
        String str = "London is capital of Great Britain";
        System.out.println("Example1 output: "+example1(str));

        //Compress String
        // aabbbccccd -> a2b3c4d1
        String exp = "asdfffddssaasaasasdf";
        System.out.println("\nExample2 output: "+example2(exp));

    }

    public static HashMap<Character,Integer> example2 (String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,count);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        return map;
    }

    public static String example1 (String str){
        String [] arr = str.split(" ");
        String reversed="";
        for(int i = arr.length;i>0;i--){
            reversed=reversed+arr[i-1]+" ";
        }
        return reversed;
    }
}
