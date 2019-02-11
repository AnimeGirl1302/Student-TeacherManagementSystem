package abcd;

public class Student extends User {
	    private String branch;
	    private String section;
	    private String roll;
	    Subject[] subjects;

	   Student(String name, String email, Integer age, String roll, String branch, String section) {
	        super(name, email, age);
	        this.roll = roll;
	        this.branch = branch;
	        this.section = section;
	        this.subjects = new Subject[3];
	        this.setSubjects();
	    }

	    public String getRoll() {
	        return this.roll;
	    }

	    public String getBranch() {
	        return this.branch;
	    }

	    public String getSection() {
	        return this.section;
	    }

	    private void setSubjects() {
	        if (this.branch.equals("COE")) {
	            this.subjects[0] = new Subject("COEsub1", 24);
	            this.subjects[1] = new Subject("COEsub2", 18);
	            this.subjects[2] = new Subject("COEsub3", 28);

	        } else if (this.branch.equals("IT")) {


	            this.subjects[0] = new Subject("ITsub1", 24);
	            this.subjects[1] = new Subject("ITsub2", 18);
	            this.subjects[2] = new Subject("ITsub3", 28);


	        } else {

	            this.subjects[0] = new Subject("MEsub1", 24);
	            this.subjects[1] = new Subject("MEsub2", 18);
	            this.subjects[2] = new Subject("MEsub3", 28);


	        }
	    }

	    public Subject[] getSubjects() {
	        return this.subjects;
	    }

	    public String toString() {
	        String retval = "";
	        retval += "Name : " + this.getName();
	        retval += "\nRollno : " + this.getRoll();
	        retval += "\nAge : " + this.getAge();
	        retval += "\nEmail : " + this.getEmail();
	        retval += "\nBranch : " + this.getBranch();
	        retval += "\nSection : " + this.getSection();
	        retval += "\nSubjects : \n";
	        for (Subject s : subjects) {
	            retval += s.toString();
	            retval += "\n";
	        }
	        return retval;
	    }
	}



