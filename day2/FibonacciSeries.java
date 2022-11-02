package w1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8, firstNum = 0,secNum = 1; 
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i < range-1; i++) {
			int sum;
			sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
			
		}

	}

}
