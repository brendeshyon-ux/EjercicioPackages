import java.util.ArrayList;
import java.util.List;

public class Courses {
	public String courseName;
	public String professorName;
	public int year;

	public List<Student> students = new ArrayList<Student>();

	public void enroll(Student student) {
		// TODO add the student to the collection
		students.add(student);
		System.out.println(
				student.firstName + " " + student.lastName + ", este alumno esta inscrito en " + courseName + ".");
	}

	public void unEnroll(Student student) {
		// TODO remove this student from the collection
		// Hint: check if that really is this student
		if (students.contains(student)) {
			students.remove(student);
			System.out.println(
					student.firstName + " " + student.lastName + ", ha sido dado de baja en " + courseName + ".");
		} else {
			System.out.println("Ya no esta inscrito en este curso");
		}
	}

	public int countStudents() {
		// TODO implement
		return students.size();
	}

	public int bestGrade() {
		// TODO implement
		int best = 0;
		for (Student n : students) {
			if(n.grade > best) {
				best = n.grade;
			}
		}
		return best;
	}
	
	  public void enroll(Student[] students){
	      //TODO add all the students to the collection
		  for (Student n : students) {
			  enroll(n);
		  }
	   }

}// Course
