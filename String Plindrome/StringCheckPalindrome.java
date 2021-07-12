public class StringCheckPalindrome{
	public static boolean checkPalindrome(StringBuffer str){
		StringBuffer tempString= new StringBuffer("");
		for(int i=(str.length()-1);i>=0;i--){
			tempString.append(str.charAt(i));
		}
		System.out.println(tempString);
		if(tempString.toString().equalsIgnoreCase(str.toString()))
			return true;

		return false;
	}

	public static void main(String [] args){
		StringBuffer toCheck=new StringBuffer("ABCDCBA");
		if(StringCheckPalindrome.checkPalindrome(toCheck)){
			System.out.println(" it is palindrome");
		}else{
			System.out.println(" it is not palindrome");
		}
	}

}