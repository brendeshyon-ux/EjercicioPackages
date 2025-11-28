public class Student {
	public String firstName;
	public String lastName;
	public int registration;
	public int grade;
	public int year;
	

	public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
		
	}

	public void printFullName() {
		// TODO implement
		System.out.println(this.firstName + " " + this.lastName);
	}
	
	public void isApproved() {
		// TODO implement: should return true if grade >= 60
		if (grade >= 60) {
			System.out.println(this.firstName + " " + this.lastName + ", Aprobó el curso.");
		} else {
			System.out.println(this.firstName + " " + this.lastName + ", Reprobó el curso.");
		}
	}

	public int changeYearIfApproved() {
		// TODO implement: the student should advance to the next year if he/she grade
		// is >= 60
		// Make year = year + 1, and print "Congratulations" if the student has been
		// approved
		if (grade >= 60) {
			year = year + 1;
			System.out.println(this.firstName + " " + this.lastName + ", Congratulations!!!" + " Pasas al siguiente año: " + year);
		} else {
			System.out.println(this.firstName + " " + this.lastName + ", Podrás intentarlo para el proximo año.");
		}return year;
	}

}