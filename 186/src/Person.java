
public class Person {
	
	public String name;
	public String countryName;
	public Person uniF;
	
	public Person(String name, String countryName) {
		this.name = name;
		this.countryName = countryName;
	}
	
	public void print() {
		System.out.println(name + " " + countryName);
	}
	
	public void universeFriend(Person p) {
		uniF = p;
		uniF.countryName = "Uganda";
	}
}
