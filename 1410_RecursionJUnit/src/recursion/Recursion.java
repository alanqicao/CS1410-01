package recursion;

public class Recursion {
	

		
		public static String toUpper(String str) {
			str= str.toUpperCase();
			if(str.length()<=1)return str;
			return str.charAt(0)+ " " +toUpper(str.substring(1));

		}
		
		public static int countSmiles(char[] letters, int index){
			//if(letters.length == 0 )return 0;
	        if (letters == null || index < 0 || (index + 1) >= letters.length) return 0;
			
			if(letters[index] ==':' &&  letters[index+1] == ')')
				return 1 + countSmiles(letters,index+2);
			
			return countSmiles(letters,index+1);
				
			
		}
		

		public static int sumOfDigits(int n) {
			
				if(n==0) return 0;
			return (Math.abs(n)%10)+sumOfDigits(Math.abs(n)/10);
			
		}
		
		public static double harmonic(int n){
			
			 if (n == 0)
			      throw new IllegalArgumentException("The argument n can't be zero.");

			   if (n == 1)
			      return 1;
			   else if (n < 0)
			      return -1 * harmonic(-n);
			   else // n > 1
			      return 1.0/n + harmonic (n - 1);
		}
		
		
		
}
