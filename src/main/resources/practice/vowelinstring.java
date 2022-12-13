package practice;

public class vowelinstring {

	public static void main(String[] args) {
		int count=0;
		String str="Selenium";
		String str1=str.replaceAll("[aeiou||AEIOU]","@");
		char[] c=str1.toCharArray();
		
		for(int i=0;i<str1.length();i++)	
		{
				if(c[i]=='@')
				{
					count++;
					System.out.println(c[i]+"  present");
					
				}
		}System.out.println(count++);

}
}
