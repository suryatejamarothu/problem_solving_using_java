package pst_java;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		//Search for a given element in a sorted array using Binary Search.
		Scanner sc = new Scanner(System.in);
		int[] num = {8,4,5,2,9,3};
		boolean found = false;
		Arrays.sort(num);
		int k = 3;
		int l=0;
		int h=num.length-1;
		while(l<=h) {
			int mid = (l+h)-l/2;
			if(num[mid] == k) {
				System.out.print("element found at index:"+mid);
				found = true;
				break;
			}else if(num[mid]<k) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		if(!found) {
			System.out.print("element not found");
		}
		

	}

}
