// File Name: NthPrime.java
// Task 7: Find the Nth Prime Number

public class NthPrime {

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 10; // Find 10th prime
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th prime number is: " + num);
                    break;
                }
            }
            num++;
        }
    }
}

/*
Output:
10th prime number is: 29
*/
