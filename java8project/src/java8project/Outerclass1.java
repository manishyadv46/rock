package java8project;

public class Outerclass1 {

	public static void main(String[] args) {
		Outerclass.Inner in=new Outerclass().new Inner();
		in.show();

	}

}
