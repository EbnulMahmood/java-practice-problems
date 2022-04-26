
public class Movie {
	
	public String name;
	public static String movie;
	public Movie(String name, String movie) {
		this.name = name;
		this.movie = movie;
	}
	
	public void details() {
		System.out.println(name + " (" + movie + ")");
	}
}
