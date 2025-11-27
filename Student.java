
public class Student {
	public String firstName;
	public String lastName;
	public int registration;
	public int grade;
	public int year;

	public Student(String firstName, String lastName) {
		this.firstName = firstName.toUpperCase();
		this.lastName = lastName.toUpperCase();
	}

	public void printFullName() {
		// TODO implement
		System.out.println(this.firstName + " " + this.lastName);
	}

	public void isApproved() {
		// TODO implement: should return true if grade >= 60
		if (grade >= 60) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Reprobado");
		}
	}

	public int changeYearIfApproved() {
		// TODO implement: the student should advance to the next year if he/she grade
		// is >= 60
		// Make year = year + 1, and print "Congratulations" if the student has been
		// approved
		if (grade >= 60) {
			year = year + 1;
			System.out.println("Congratulations");
		} else {
			System.out.println("Reprobado");
		}
		
		return year;
	}

}