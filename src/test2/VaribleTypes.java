package test2;

public class VaribleTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		byte leftLimitOfByte =  -128;
		byte rightLimitOfByte = 127;
		
		long leftLimitOfLong = -100000000;
		long rightLimitOfLong = 100000000;
		
		char A = 'A';
		char B = 'B';
		
		char korGa = '가';
		char korGak = '각';
		String string1 = "I'm iron man";
		String string2 = "나는 \"자바\"를 배웁니다.";  // escape sequence
		
		
		float floatPi = 3.14f;
		double doublePi = 3.14;
		float floatPrecision = 0.123456789123456789f;
		double doublePrecision = 0.123456789123456789;
		float floatWithE = 3e6F;
		double doubleWithE = 3e-6;
		
		System.out.println(floatPrecision+ " / "+ doublePrecision);
		System.out.println(floatWithE+"  /  "+doubleWithE);
		
		boolean isRunning = true;
		if(isRunning) {
			System.out.println("I am Running");
			isRunning = false;
		}
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println("var1 "+var1 + " var "+ var2 + " var3 " + var3 + " var4 " + var4);
		
		

	}

}
