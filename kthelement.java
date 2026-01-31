package pst_java;
	import java.util.*;

	public class kthelement {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] num = {3, 5, 2, 6, 7, 1, 9, 34};

	        System.out.print("Enter value of K: ");
	        int k = sc.nextInt();

	        // Check for valid K
	        if (k <= 0 || k > num.length) {
	            System.out.println("Invalid value of K");
	            return;
	        }

	        Arrays.sort(num);  // sort the array

	        System.out.println("Kth smallest element is: " + num[k - 1]);
	    }
	}


