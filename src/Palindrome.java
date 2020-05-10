
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "CIVIC";

		if (ispalindrome2(str))
			System.out.println("isPalindrome");
		else
			System.out.println("isnotPalindrome");

	}

	private static boolean ispalindrome(String str) {
		char[] str1 = str.toCharArray();
		System.out.println(str.toString());
		int j = (str1.length - 1);
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str1[j]) {
				return false;
			}j--;
		}
		return true;
	}

	private static boolean ispalindrome2(String str) {
		StringBuffer res = new StringBuffer(str);
		String result = res.reverse().toString();
		System.out.println(res);
		if(str.equals(result)) {
			return true;
		}
		
		return false;
	}	
	
}
