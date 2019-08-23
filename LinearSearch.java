package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static int search(int arr[],int x) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int z = scn.nextInt(); // Size of the array
		int arr[] = new int[z];
		for (int i = 0; i < z; i++) {
			int element = scn.nextInt();
			arr[i] = element;
		}
		System.out.println("Your input array is :" + Arrays.toString(arr));
		System.out.println("Enter the element to find:");
		int x = scn.nextInt();
		int idx = search(arr,x);
		if(idx == -1) {
			System.out.println("Element not found!");
		}
		else {
			System.out.println(" Element found at:"+ idx);
		}

	}

}

