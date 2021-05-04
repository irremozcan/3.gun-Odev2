
public class Main {
	
	public static void main(String[] args) {
		Student student1 = new Student(1,"İrem","ÖZCAN","1234","Java Kamp");
		Instructor ınst1 = new Instructor(1,"Engin", "DEMİROĞ", "4321","Java Kamp");
		
		
		StudentManager studentMng = new StudentManager();
		UserManager userMng = new UserManager();
		InstructorManager ınstMng = new InstructorManager();
		
			studentMng.registered(student1);
			studentMng.CurrentHomework(student1);
		
		
			userMng.add(student1);
			userMng.delete(ınst1);
		

			ınstMng.create(ınst1);
			ınstMng.remove(ınst1);
		
	}
	
	
	
	
	
	
}
