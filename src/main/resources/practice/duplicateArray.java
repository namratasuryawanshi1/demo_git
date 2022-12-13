
//duplicate no from array
package practice;

public class duplicateArray {

	public static void main(String[] args) {
		int a[]= {1,2,2,4,5,6,6,5,45,12,12};
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println("duplicate"+a[i]);
			}
		}
		

	}

}
