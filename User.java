public class User {
	
    private String firstName;
	private String lastName;
	private String fullName;
	
    User(String firstName, String lastName){
		
        this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
	}

	public String getfirstName(){
		return this.firstName;
	}

	public void setfirstName(String firstName){
		this.firstName = firstName;
	}

    public String getlastName(){
		return this.lastName;
	}

	public void setlastName(String lastName){
		this.lastName = lastName;
	}

    public String getfullName(){
		return this.fullName;
	}

	public void setfullName(String fullName){
		this.fullName = fullName;
	}
}