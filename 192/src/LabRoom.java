
public class LabRoom extends Room {

	private String attendantName;
	private String courseList[] = new String[5];
	
	public LabRoom(String roomNo, String attendantName, String[] courseList) {
		super(roomNo);
		this.attendantName = attendantName;
		this.courseList = courseList;
	}

	public String getAttendantName() {
		return attendantName;
	}

	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
	}

	public String[] getCourseList() {
		return courseList;
	}

	public void setCourseList(String[] courseList) {
		this.courseList = courseList;
	}
	
	public void checkCourseInLab(String course) {
//		for (String x: courseList)
//			if (x.equalsIgnoreCase(course))
//			System.out.println("Yes");
//		
////		return false;
	}
}
