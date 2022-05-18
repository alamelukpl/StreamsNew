import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentClass {

	public static void main(String[] args) {
		List<Student> s1 = getListStudents();
		List<Student> s = s1.stream().filter(d-> d.getGender() == "Female")
				.filter(x -> x.equals("football")).collect(Collectors.toList());
				
				//.filter(i-> i.getActivities() == "football").collect(Collectors.toList());
		System.out.println(s);
		

	}

	private static List<Student> getListStudents() {
		
		List<String> l1 = Arrays.asList("Football","volleyball","cricket");
		List<Student> student = Arrays.asList(
				new Student("AA",1,"Female","football"),
				new Student("BA",2,"Female","football"),
				new Student("CA",3,"Male","football"),
				new Student("DA",4,"Female","Cricket"),
				new Student("EA",5,"Female","football"));
		return student;
	}

}
