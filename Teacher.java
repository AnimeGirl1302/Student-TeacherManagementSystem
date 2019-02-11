package abcd;

public class Teacher extends User {
	private String department;
	private String subject;

	Teacher(String name, String email, Integer age, String department, String subject) {
		super(name, email, age);
		this.department = department;
		this.subject = subject;
	}

	public String getDepartment() {
		return this.department;
	}

	public String getSubject() {
		return this.subject;
	}

	public String toString() {
		String retval = "";
		retval += "Name : " + this.getName();
		retval += "\nAge : " + this.getAge();
		retval += "\nEmail : " + this.getEmail();
		retval += "\nDepartment : " + this.getDepartment();
		retval += "\nSubject : " + this.getSubject();
		return retval;
	}

}
