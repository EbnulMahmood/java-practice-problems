
public class StringTest {

	public static void main(String[] args) {

		String me = "Shovon";
		
		if (me == "Shovon")
			System.out.println("Yes, I am me");
		else
			System.out.println("No, I am not me?");
		
		String shortName = me.substring(0, 3);
		System.out.println(shortName);
		
		if (shortName == "Sho")
			System.out.println("Very Good");
		else
			System.out.println("Trouble here");
		if (shortName.equals("Sho"))
			System.out.println("Do it this way");
	}
}
