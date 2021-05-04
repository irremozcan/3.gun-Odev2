
public class UserManager {

		public void add(User user) {
			System.out.println("Kullanýcý EKLENDÝ! "+ user.getName()+" "+user.getLastName());
			
		}
		
		public void delete(User user) {
			System.out.println("Kullanýcý SÝLÝNDÝ! "+user.getName()+ " "+user.getLastName());
		}
}
