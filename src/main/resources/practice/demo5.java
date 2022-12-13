
////count number of vowels in java  ex: "javaProgrammingLanguage"
package practice;

public class demo5 {

	public static void main(String[] args) {

		String str="javaProgrammingLanguage";
		int count=0;
		String str1=str.replaceAll("[aeiou]","");
		//String [] s=str1.toCharArray();
	
		System.out.println(str1.length());
		int d=str.length()-str1.length();
		System.out.println(d);
				
	}
	
}


