package patterns.PrefixAndSuffixPattern;

import patterns.PrefixAndSuffixPattern.codes.ProductExceptSelf;
import patterns.PrefixAndSuffixPattern.codes.SumExceptSelf;

import java.util.Arrays;

public class PrefixAndSuffix {

    // Product of the element of the array except the self
    ProductExceptSelf productExcept = new ProductExceptSelf();
    public  void productExceptSelfMethod(){
        int[] arr = {1, 2, 3, 4};
        int[] result = productExcept.productExceptSelf(arr);
        System.out.println("Prefix And Suffix Pattern - product of the array except self: "  + Arrays.toString(result));
    }
    // Product of the element of the array except the self
    SumExceptSelf sumExcept = new SumExceptSelf();
    public  void sumExceptSelfMethod(){
        int[] arr = {1, 2, 3, 4};
        int[] result = sumExcept.sumExceptSelf(arr);
        System.out.println("Prefix And Suffix Pattern - sum of the array except self: "  + Arrays.toString(result));
    }
}
