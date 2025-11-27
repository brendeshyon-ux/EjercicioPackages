
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Student student = new Student("Brenda", "Montaño");
	student.printFullName();
	
	student.grade = 80;
	student.isApproved();
	
	student.year = 2025;
	int nuevoYear = student.changeYearIfApproved();
    System.out.println("Ahora pasas al siguiente año: " + nuevoYear);
	}

}
