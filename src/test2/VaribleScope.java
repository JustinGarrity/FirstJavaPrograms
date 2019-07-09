package test2;

public class VaribleScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 10;
		int value2 = 0;
		if (value1 > 5) {
			
			value2 = value1  - 10;
		}
		
		int value3 = value1 + value2 + 5;
		
		{
			int iAmHere = 10;
			System.out.println(iAmHere);
		}
		int iAmHere = 20;
		System.out.println(iAmHere);
		
		 

	}

}
