package w1.day2;
import java.util.Arrays;
public class SecondSmallestNo {
	public static void main(String[] args) {
		int[] num = {23,45,67,32,89,22};
		int i = 2;
		Arrays.sort(num);
		System.out.println("The " +i+" second smallest no is " +num[i-1]);
	}

}
