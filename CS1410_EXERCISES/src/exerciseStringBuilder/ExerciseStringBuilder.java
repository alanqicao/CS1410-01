package exerciseStringBuilder;

public class ExerciseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* */
		
		StringBuilder sb = new StringBuilder("Cats live");
		
		//sb.replace(0,sb.length()-1,"c");
		//sb.insert(sb.length()-1," on ");
		sb.setCharAt(0,'r');
		sb.append(" on ");
		System.out.println(sb);
		
		//StringBuilder sb3 = new StringBuilder(sb);
		
		//StringBuilder reverseString = new StringBuilder(sb.reverse());
		
		//StringBuilder sb2 = new StringBuilder(sb3.append(reverseString));
		
		//System.out.printf("%s => %s",sb3,sb2);
		
		StringBuilder temp = new StringBuilder(sb);
		sb.append(temp.reverse());
		System.out.println("sb: " + sb);
		
		//int doubleSpace = sb.indexOf("  ");
		//StringBuilder temp2 = new StringBuilder(sb.replace(doubleSpace,doubleSpace," "));
		
		int doubleSpace = sb.indexOf("  ");
		sb.deleteCharAt(doubleSpace);
		sb.append('.').setCharAt(0, 'C');
		System.out.println("sb: " + sb);
		

	}

}
