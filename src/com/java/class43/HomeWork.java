package com.java.class43;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentMarks = new HashMap<>();

        List<Integer> marksOfAli = new ArrayList<>(Arrays.asList(94, 51, 34, 60, 23));
        List<Integer> marksOfChirag = new ArrayList<>(Arrays.asList(34, 45, 34, 43, 89));
        List<Integer> marksOfMaria = new ArrayList<>(Arrays.asList(93, 56, 24, 85, 23));
        List<Integer> marksOfAlina = new ArrayList<>(Arrays.asList(100, 65, 23, 62, 77));
        List<Integer> marksOfCharlie = new ArrayList<>(Arrays.asList(22, 50, 87, 60, 90));

        studentMarks.put("Ali", marksOfAli);
        studentMarks.put("Chirag", marksOfChirag);
        studentMarks.put("Maria", marksOfMaria);
        studentMarks.put("Alina", marksOfAlina);
        studentMarks.put("Charlie", marksOfCharlie);

        System.out.println(getStudentNameHavingGreatestTotal(studentMarks));
    }

    // Implement below method to find total greatest mark
    public static String getStudentNameHavingGreatestTotal(Map<String, List<Integer>> studentMarks) {
            String studentName =null;
            Set<Map.Entry<String, List<Integer>>> pairs = studentMarks.entrySet();
            int maxTotalGrades = 0;
            for(Map.Entry<String, List<Integer>> grades: pairs){
                int total=0;
                List<Integer> listOfGrades = grades.getValue();
                for(int data: listOfGrades){
                    total = total + data;
                }
                if(total>maxTotalGrades){
                    maxTotalGrades = total;
                    studentName = grades.getKey()+" has greatest marks in total, that is: "+ maxTotalGrades;
                }
            }
            return studentName;
    }
}


