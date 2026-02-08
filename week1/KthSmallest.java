// File Name: KthSmallest.java
// Task 5: Find Kth smallest element

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(k + "rd smallest element is " + arr[k - 1]);
    }
}

/*
Output:
3rd smallest element is 7
*/
