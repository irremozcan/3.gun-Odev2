
public class User {
	int id;
	String name;
	String LastName;
	String password;
	 

	public User() {
		
	}
	
	
	public User(int id, String name, String LastName, String password) {
		this.id=id;
		this.name=name;
		this.LastName=LastName;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
