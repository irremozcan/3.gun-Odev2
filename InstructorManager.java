
public class InstructorManager {
	public void create(Instructor instructor) {
		System.out.println(instructor.getName()+" "+ instructor.getLastName()+" "+"tarafýndan "
				+instructor.getLesson()+" Kursu Oluþturuldu!");
		
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getName()+" "+ instructor.getLastName()+" tarafýndan "
				+instructor.getLesson()+" Kursu Silindi!");
		
	}

}
