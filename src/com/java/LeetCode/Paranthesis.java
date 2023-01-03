package com.java.LeetCode;
import java.util.*;
public class Paranthesis {
    public static void main(String[] args) {
        System.out.println("Parenthesis example");
        System.out.println(isValid("(){[]"));
    }
    public static boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            } else {
                if (list.isEmpty()) {
                    return false;
                }else if(c == ')' && list.get(list.size() - 1) != '(') {
                    return false;
                }else if(c == ']' && list.get(list.size() - 1) != '[') {
                    return false;
                }else if(c == '}' && list.get(list.size() - 1) != '{') {
                    return false;
                }else {
                    list.remove(list.size() - 1);
                }
            }
        }
        return list.isEmpty();
    }
}

