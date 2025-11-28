public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("Brenda", "Montaño", 1, 80, 2025);
		Student studentDos = new Student("Jennie", "Meza", 2, 98, 2025);
		Student studentTres = new Student("David", "Honojosa", 3, 52, 2025);
		
		student.printFullName();
		studentDos.printFullName();
		studentTres.printFullName();
		
		student.isApproved();
		studentDos.isApproved();
		studentTres.isApproved();
		
		student.changeYearIfApproved();
		studentDos.changeYearIfApproved();
		studentTres.changeYearIfApproved();
					
		Courses generation = new Courses();
		generation.courseName = "Java";
		generation.professorName = "JC";
		generation.year = 2025;
	
		
		generation.enroll(student);
		generation.enroll(studentDos);
		generation.enroll(studentTres);
		
		
		

	}//void
}// Main


