package java8project;


public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int temp=0;
		for(int i=0 ; i<=100; i= i+1)
		{
			System.out.println(i);
			 temp=counter+1;
			 counter=temp;
		}
	}

}
