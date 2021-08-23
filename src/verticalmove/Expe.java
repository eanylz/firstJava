package verticalmove;

import java.util.Arrays;

public class Expe {
    public static int fun(int[] arr){
//        for(int i=0; i<arr.length-1;i++){
//           int temp=0;
//            if(arr[i]>arr[i+1]){
//                temp = arr[i+1];
//                arr[i+1] = arr[i];
//                arr[i]= temp;
//
//            }
//            for(int j:arr)
//            System.out.println(j);
//
//        }
        Arrays.sort(arr);
        int diff= Integer.MAX_VALUE;
        for (int i = 0; i <arr.length-1 ; i++) {
            if((arr[i+1]-arr[i])<diff){
                diff = arr[i+1]-arr[i];
            }
//            return diff;


        }
        return diff;



    }

    public static void main(String[] args) {
        int[] input = {1,5};
        System.out.println(fun(input));
        System.out.println(input.length);
    }

}
