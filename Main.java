
public class Main {

	public static void main(String[] args) {

		User s1= new Student ("S�meyye", "Bayraktar",21);
		Student s2= new Student ("Esma", "Arslan",40);
		Student s3= new Student ("K�bra", "G�ne�",26);
		User s4= new Student ("Sueda", "Ak�n",28);
		
		User i1 = new Instructor();
		StudentManager sm1 = new StudentManager();
		sm1.register(s1);
		sm1.login(s1);

	}

}
