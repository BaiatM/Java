package com.java.mentoring;

public class Interview {
    public static void main(String[] args) {

        System.out.println(sumOfNumbers("Hello12343"));
        String str1 = "asdfadsfasdf3212312312";
        System.out.println(sumOfNumbers(str1));


        int[] arr = {0,1,1,1,0,1,0,1,0,1,0,1,0};

        zerosAndOnes(arr);

    }
    public static void zerosAndOnes(int [] arr){
        int[] sortedArr = new int[arr.length];
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < sortedArr.length; i++) {
            if(i<zeroCount){
                sortedArr[i]=0;
            }else{
                sortedArr[i]=1;
            }
        }
        for(int i=0;i<sortedArr.length;i++){
            System.out.print(sortedArr[i] + " ");
        }
    }


    public static int sumOfNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                // Convert the character to a digit and add it to the sum
                int digit = Character.getNumericValue(c);
                sum =sum+ digit;
            }
        }return sum;
    }
}