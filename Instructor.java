
public class Instructor extends User {
	int id;
	String name;
	String LastName;
	String password;
	String lesson;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String name, String LastName, String password, String lesson) {
		this.id=id;
		this.name=name;
		this.LastName=LastName;
		this.password = password;
		this.lesson=lesson;
		
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

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
}
