package w1.day2;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,5,8};
		Arrays.sort(arr);
		for (int i=0;i < arr.length; i++) {
			
			if(i+1!=arr[i]) {
				System.out.println(i+1);
				break;
			}
			
		}

	}

}
