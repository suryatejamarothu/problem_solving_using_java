// File Name: AllPairs.java
// Task 6: Print all possible pairs in an array

public class AllPairs {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println("All possible pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}

/*
Output:
All possible pairs:
(1, 2)
(1, 3)
(2, 3)
*/
