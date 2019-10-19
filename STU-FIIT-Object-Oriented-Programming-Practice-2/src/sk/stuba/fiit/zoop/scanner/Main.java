package sk.stuba.fiit.zoop.scanner;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\s*");
		
		while (!scanner.hasNext("q")) {
			
			char input = scanner.next().charAt(0);
			System.out.println("[" + input + "] ");
		}
		
		scanner.close();
	}
}
