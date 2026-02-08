// File Name: HillPatternWeight.java
// Task: Weight of a Hill Pattern

public class HillPatternWeight {
    public static void main(String[] args) {

        int n = 4;
        int weight = 0;

        for (int i = 1; i <= n; i++) {
            weight += i;
        }

        for (int i = n - 1; i >= 1; i--) {
            weight += i;
        }

        System.out.println("Weight of hill pattern: " + weight);
    }
}

/*
Output:
Weight of hill pattern: 16
*/
