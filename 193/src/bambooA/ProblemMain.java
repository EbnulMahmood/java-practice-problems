package bambooA;
import bambooB.Student;
import bambooC.Person;
public class ProblemMain {

	public static void main(String[] args) {

		Student s = new Student("13");
		Person p = s;
		Person c = new ClubMember("78", "Lit");
		s.printInfo();
		System.out.println(p.name);
	}
}
