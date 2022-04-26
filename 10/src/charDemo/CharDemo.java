package charDemo;

public class CharDemo {

	public static void main(String[] args) {
		
		char ch1, ch2;
		
		ch1 = 65;
		ch2 = 97;
		
		System.out.print("ch1 and ch2: ");
		System.out.println(ch1 + " " + ch2);
		
		for (char i = ch1; i <= 90; i++) {
			
			System.out.println(i);
		}
		
		for (char i = ch2; i <= 122; i++) {
			
			System.out.println(i);
		}

	}

}
