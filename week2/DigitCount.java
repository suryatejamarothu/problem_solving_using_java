// File Name: DigitCount.java
// Task: Count all digits in a number

public class DigitCount {
    public static void main(String[] args) {

        int num = 12345;
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println("Total digits: " + count);
    }
}

/*
Output:
Total digits: 5
*/
