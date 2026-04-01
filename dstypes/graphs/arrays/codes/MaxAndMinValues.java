package BasicPrograms.arrays.codes;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMinValues {


public int maxValue(int[] arr){
         int len = arr.length;
         int maxV = arr[0];
         for(int i =1; i < len; i++){
            maxV = Math.max(maxV, arr[i]);
//             if(arr[i] > maxV)
//                 maxV = arr[i];
         }
       return maxV;
     }

    public int minValue(int[] arr){
        int len = arr.length;
        int minV = arr[0];
        for(int i =1; i < len; i++){
            minV = Math.min(minV, arr[i]);
//             if(arr[i] < maxV)
//                 minV = arr[i];
        }
        return minV;
    }

    public static void MinMaxWithStreams (String[] args) {
        int[] arr = {10, 5, 10, 4, -4, 7};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }


        public static void MinMaxWithSorting(String[] args) {
            int[] arr = {10, 5, 10, 4, -4, 7};

            Arrays.sort(arr); // sorts in ascending order

            int min = arr[0];
            int max = arr[arr.length - 1];

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

    }


        public static void MinMaxWithCollections(String[] args) {
            Integer[] arr = {10, 5, 10, 4, -4, 7};

            int max = Collections.max(Arrays.asList(arr));
            int min = Collections.min(Arrays.asList(arr));

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

           }


}
