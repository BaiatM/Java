package com.java.hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.String.valueOf;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt2("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<String, Integer> data = new HashMap<>();
        data.put("I",1);
        data.put("V",5);
        data.put("X",10);
        data.put("L",50);
        data.put("C",100);
        data.put("D",500);
        data.put("M",1000);
        int result=0;
        for(int i=0;i<s.length()-1;i++){
            if(data.get(valueOf(s.charAt(i)))<data.get(valueOf(s.charAt(i+1)))){
                result =result + (data.get(valueOf(s.charAt(i+1)))-data.get(valueOf(s.charAt(i))));
                i++;
            }else{
                result = result + data.get(valueOf(s.charAt(i)));
            }
        }
        return result+data.get(valueOf(s.charAt(s.length()-1)));
        }

    public static int romanToInt2(String s) {
        int answer = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            Set<Character> keys = roman.keySet();
            for (Character key : keys) {
                if (s.charAt(i) == key) {
                    if (roman.get(key) * 3 < answer) {
                        answer = answer - roman.get(key);
                    } else {
                        answer = answer + roman.get(key);
                    }
                }

            }
        }
        return answer;
    }
}
