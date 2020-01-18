package java8project;

public class Pattern3 
{
	public static void main(String[]args)
	{
		int row=7,star=1;
		for (int i = 1; i <=row; i++) 
		{
			for (int j = 1; j <=star; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
				if(i<=(row/2))
				{
					star++;
					
				}
				else {
					star--;
				}
				
			}
			
		}
		
	}


