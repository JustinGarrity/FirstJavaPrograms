package test2;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int keyCode;
		boolean isRunning = true;
		
		while(isRunning) {
			keyCode = System.in.read();
			System.out.println("input's keyCode: " + keyCode);
			System.out.println("q to quit");
			if (keyCode == 113)
				isRunning = false;
			
			
		}
		System.out.println("bye");

	}

}
