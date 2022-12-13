package practice;

//import java.util.Scanner;

public class peimenoSeries {

	public static void main(String[] args) {
		int count;
		
		for(int j=1;j<=10;j++)
		{
			count=0;
			for(int i=1;i<=j;i++)
		  {
				
			    if(j%i==0)
				count++;
			    //System.out.println(count);
		  }
			if(count==2)
			System.out.println(j);
			
		  
		}
		

	}

	}


