package badamLand;

import java.util.Scanner;

public class BadamCricket {

	public static void main(String[] args) {
		
		int badamAverage = 0;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Number of innings: ");
		n = input.nextInt();
		int badam[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("no.%d innings score: ", i + 1);
			badam[i] = input.nextInt();
		}
		int first = 0;
		int second = 0;
		int third = 0;
		for (int i = 0; i < n; i++) {
	        if (badam[i] > first) {
	            third = second;
	            second = first;
	            first = badam[i];
	        }
	  
	        else if (badam[i] > second) {
	            third = second;
	            second = badam[i];
	        }
	  
	        else if (badam[i] > third) {
	            third = badam[i];
	        }
		}
		badamAverage = (first + second + third) / 3;
		System.out.println("Badam Average: " + badamAverage);
	}
}
