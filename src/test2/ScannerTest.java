package test2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("Input String :" + inputData);
			if(inputData.equals("q")){
				break;
			}
		}

	}

}
