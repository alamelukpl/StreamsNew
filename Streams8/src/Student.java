import java.util.List;

public class Student {
	
	private String name;
	private int gradeLevel;
	private String gender;
	private String activities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public Student(String name, int gradeLevel, String gender, String activities) {
		
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gender = gender;
		this.activities = activities;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gender=" + gender + ", activities="
				+ activities + "]";
	}
	
	

}
