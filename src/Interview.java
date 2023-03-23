import java.util.Arrays;

public class Interview {
    public static void main(String[] args) {
        // put all zeros at the end
        int [] arr = {1,0,2,0,0,4,0,5,0,6,8};

        // another array of number which r not equal to 0
        // size of the initial array
        //System.out.println(example1(arr));

        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }


//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(example1(arr)[i]+" ");
//        }
    }

    public static int[] example1(int [] arrEx){
        int [] resultOfArr = new int[arrEx.length]; // 0,0,0,0,0,0
        //pointer will exactly the one we want
        String result="";
        // all the number which r not 0
        int pointer = 0;
        for(int i=0; i<arrEx.length; i++){
            if(arrEx[i]!=0){
                resultOfArr[pointer] = arrEx[i];
                pointer++;
            }
        }

        return resultOfArr;
    }
}
