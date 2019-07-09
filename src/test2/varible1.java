package test2;

public class varible1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 50;
		int totalMinute = (hour * 60) + minute;
		System.out.println(hour + "h  "+ minute +"m ");
		System.out.println(totalMinute+"m");
		
		int a = 10;
		int b = 20;
		int c = b;
		System.out.println(a + "  "+ b);
		b = a;
		a = c;
		System.out.println(a + "  "+ b);

	}

}
