package w1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String num = "34345";
		
		String temp = "";
		
		for (int i=num.length()-1; i>=0;i--) {
			temp = temp+num.charAt(i);
			System.out.println(temp);
			
		}
		if(num.equals(temp))
		{
			System.out.println(num+ "This is Palindrome");
			
		}
		else {
			System.out.println(num+ "This is not a Palindrome");
		}
	}
	
}

