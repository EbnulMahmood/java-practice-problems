package bambooA;
import bambooB.Student;
public final class ClubMember extends Student {
	
	public String status;
		
	public ClubMember(String id, String status) {
		super(id);
		this.status = status;
	}

	public void printStatus() {
		System.out.println(status);
	}
}
