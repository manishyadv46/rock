package java8project;

public class Pattern2 
{
public static  void main(String[]args) 
{
	
	int row=4, star=7,space=row-1;
	for (int i = 1; i <=row; i++) 
	{
		for (int j = 1; j <=space; j++) 
		{
			System.out.print(" ");
			
		}
		for (int k = 1; k <=star; k++) 
		{
			System.out.print("*");
			
		}
		System.out.println();
		star=star-2;
		space++;
		
	}
}

}

