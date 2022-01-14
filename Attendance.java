package soham;

public class Attendance extends GradeActivity{
	private double percentage;
	double marks;
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void setMarks()
	{
		if(percentage<50) {
			marks=0;
			this.message="Repeat Term";
		}
		else if(percentage>50 && percentage<75) {
			marks=2;
		}
		else if(percentage>75 && percentage<85)
			marks=3;
		else if(percentage>85 && percentage<90) {
			marks=4;
		}
		else {
			marks=5;
		}
		this.score=marks;
	}
//	public void setScore(){
//		this.score=marks;
//	}
//	@Override
//	public double getScore() {
//		return score;
//	}
	
	
}
