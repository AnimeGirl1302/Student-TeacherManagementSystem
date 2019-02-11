package abcd;

public class Subject {
	
	private String name;
    private int no_of_lectures;

    Subject(String name, int no_of_lectures) {
        this.name = name;
        this.no_of_lectures = no_of_lectures;
    }

    public String getname() {
        return this.name;
    }

    public int getNo_of_lectures() {
        return this.no_of_lectures;
    }
    
    
    public String toString(){
        String retval = "";
        retval += "Name : " + this.name;
        retval += "\nNumber of Lectures : " + this.no_of_lectures;
        return retval;
    }

}
