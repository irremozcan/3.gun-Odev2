
public class InstructorManager {
	public void create(Instructor instructor) {
		System.out.println(instructor.getName()+" "+ instructor.getLastName()+" "+"tarafından "
				+instructor.getLesson()+" Kursu Oluşturuldu!");
		
	}
	
	public void remove(Instructor instructor) {
		System.out.println(instructor.getName()+" "+ instructor.getLastName()+" tarafından "
				+instructor.getLesson()+" Kursu Silindi!");
		
	}

}
