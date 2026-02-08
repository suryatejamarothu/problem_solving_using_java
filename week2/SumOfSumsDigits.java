// File Name: SumOfSumsDigits.java
// Task: Sum of Sums of Digits in Cyclic Order

public class SumOfSumsDigits {
    public static void main(String[] args) {

        int num = 999;
        int totalSum = 0;

        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            totalSum += sum;
            num = sum;
        }

        System.out.println("Sum of sums of digits: " + totalSum);
    }
}

/*
Output:
Sum of sums of digits: 36
*/
