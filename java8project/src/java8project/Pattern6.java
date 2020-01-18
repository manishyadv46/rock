package java8project;

public class Pattern6 {

	public static void main(String[] args) 
	{
	int row=4,num=1,space=row-1;
	for (int i = 1; i <=row; i++) 
	{
		for (int j = 1; j <=space; j ++) 
		{
			System.out.print(" ");
			
		}
		for (int k = 1; k <=num; k++) {
			System.out.print(k+" ");
		}
		System.out.println();
	
		num+=2;
		space--;
			
			
		}
		
	}

	}


 