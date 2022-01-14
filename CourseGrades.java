package soham;

public class CourseGrades {
	private GradeActivity[] grades=new GradeActivity[4];
	public void setLab(GradeActivity aLab) {
		grades[0]=aLab;
		
	}
	public void setAssignment(GradeActivity aAssignment) {
		grades[1]=aAssignment;
	}
	public void setAttendance(Attendance aAttendance) {
		grades[2]=aAttendance;
	}
	public void setProject(GradeActivity aProject) {
		grades[3]=aProject;
	}
	public String toString() {
		double result=	grades[0].getScore()+grades[1].getScore()+grades[2].getScore()+grades[3].getScore();
		String str=("Lab Marks: "+grades[0].getScore()+"\nAssignment Marks: "+grades[1].getScore()+"\nProject Marks :"
				+grades[3].getScore()+"\nAttendance Marks: "+grades[2].getScore()+"\nTotal Score: "+result+
				(grades[2].getMessage()!=null ?("\nMessage: "+grades[2].getMessage()):" "));
		return str;
	}
	
	
}
