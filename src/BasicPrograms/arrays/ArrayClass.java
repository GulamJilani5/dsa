package BasicPrograms.arrays;


import BasicPrograms.arrays.codes.MaxAndMinValues;
import BasicPrograms.arrays.codes.ProductOfArray;
import BasicPrograms.arrays.codes.TwoArraysExponentSameOrNot;
import patterns.TwoPointers.codes.ArrayEqualityChecker;

public class ArrayClass {


    //Finding the maximum and minimum value in the given array
    MaxAndMinValues maxAndMinValues = new MaxAndMinValues();
    public void maxAndMinValuesMethod(){
        int[] arr = {10,15,20,8,5};
        int maxValue = maxAndMinValues.maxValue(arr);
        System.out.println("Array - Maximum Value is:" + maxValue);
        int minValue = maxAndMinValues.minValue(arr);
        System.out.println("Array - Minimum Value is:" + minValue);
    }

    // Product of two array
    ProductOfArray productOfArray = new ProductOfArray();
    public void productOfArrayMethod(){
        int[] arr = {1, 2, 3, 4, 5};
        int product = productOfArray.productOfArray(arr);
        System.out.println("Array - Product of array: " + product);
    }
    // One Array's exponent is same as another arrays values or not
    TwoArraysExponentSameOrNot twoArraysExponentSameOrNot = new TwoArraysExponentSameOrNot();
    public void twoArraysExponentSameOrNotMethod(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {9, 1, 4};
        boolean result = twoArraysExponentSameOrNot.isSameSquared(arr1, arr2);
        System.out.println("Array - One Array's exponent is same as another arrays values or not " + result);
    }

    // Two arrays are equal or not
    ArrayEqualityChecker arrayEqualityChecker = new ArrayEqualityChecker();
    public void arrayEqualityCheckerMethod(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 1};

        boolean result = arrayEqualityChecker.twoArraysAreEqual(arr1, arr2);
        System.out.println("Array - Two Arrays are equal ? " + result); // true
    }



}
