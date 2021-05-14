
public class Main {

	public static void main(String[] args) {

		User s1= new Student ("Sümeyye", "Bayraktar",21);
		Student s2= new Student ("Esma", "Arslan",40);
		Student s3= new Student ("Kübra", "Güneþ",26);
		User s4= new Student ("Sueda", "Akýn",28);
		
		User i1 = new Instructor();
		StudentManager sm1 = new StudentManager();
		sm1.register(s1);
		sm1.login(s1);

	}

}
