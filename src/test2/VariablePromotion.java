package test2;

public class VariablePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 10;
		byte y = 20;
		int result2 = x+y;
		
		int intX = 10;
		double doubleY = 20.5;
		int intResult = intX + (int)doubleY;
		double doubleResult = intX + doubleY;
		
		System.out.println(intResult +" "+ doubleResult);
		int val1 =1;
		int val2 =2;
		double divResult = (double)val1/(double)val2;
		System.out.println(divResult);
		
		String str = "10";
		byte value = Byte.parseByte(str);
		value =(byte)(value + 10);
		str = Byte.toString(value);
		System.out.println(str);
		
		String str2 = String.valueOf(1234);
		int x1 = 10;
		System.out.println(x1);
		System.out.println(str2);

	}

}
