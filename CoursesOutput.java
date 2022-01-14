package soham;
import java.util.Scanner;

public class CoursesOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		CourseGrades cg=new CourseGrades();
		GradeActivity ga=new GradeActivity();
		Attendance at=new Attendance();
		ga.setScore(10);//Pass Lab Marks
		cg.setLab(ga);
		GradeActivity ga1=new GradeActivity();
		ga1.setScore(5);//Pass Assignment Marks
		cg.setAssignment(ga1);
		GradeActivity ga2=new GradeActivity();
		ga2.setScore(5);//Pass Project Marks
		cg.setProject(ga2);	
		at.setPercentage(60);//Pass Attendance Percentage
		at.setMarks();
		cg.setAttendance(at);
		System.out.println(cg.toString());
		

	}

}
