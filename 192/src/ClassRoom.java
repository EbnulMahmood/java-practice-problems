
public class ClassRoom extends Room {
	
	private String department;
	private boolean isProjectorAvailable;
	
	public ClassRoom(String roomNo) {
		super(roomNo);
		this.department = department;
		this.isProjectorAvailable = isProjectorAvailable;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean getisProjectorAvailable() {
		return isProjectorAvailable;
	}

	public void setProjectorAvailable(boolean isProjectorAvailable) {
		this.isProjectorAvailable = isProjectorAvailable;
	}
	
	public void toggleProjectorAvailability() {
		System.out.println("Toggle Projector Available");
	}
}
