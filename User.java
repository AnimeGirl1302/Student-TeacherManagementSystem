package abcd;


	public class User {
	    private String name;
	    private String email;
	    private Integer age;

	    User(String name, String email, Integer age) {
	        this.name = name;
	        this.email = email;
	        this.age = age;

	    }

	    public String getName() {
	        return this.name;
	    }

	    public String getEmail() {
	        return this.email;
	    }

	    public Integer getAge() {
	        return this.age;
	    }
	}


