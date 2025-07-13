package patterns.TwoPointers;

public class RemoveDuplicates {

    /**************************************************************
     ************************* METHOD 1
    public void removeDuplicatesMethod(int[] arr){

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        System.out.print("Unique elements: ");
        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k] + " ");
        }

    }
    *********************************
*****************************************/

//    /*******************************************************
//     ********************* METHOD 2
     public void removeDuplicatesMethod(int[] arr){

        int i =0;

        for(int j = 1; j < arr.length; j++){
          if(arr[i] != arr[j]){
              i++;
              arr[i] = arr[j];
          }
     }

         System.out.println("Unique Elements: ");
        for(int k = 0; k < arr.length; k++){
        System.out.println(arr[k]);
        }

     }


//     **********************************
//     ********************************************************/
}
