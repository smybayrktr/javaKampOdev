
public class Student extends User{

	private String firstName;
	private String lastName;
	private int yas;
	
	public Student(String firstName, String lastName, int yas) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.yas = yas;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		if(yas>7) {
			this.yas = yas;
		}
		else {
			System.out.println("Sisteme üye olmak için en az 8 yaþýnýzda olmanýz gerekmektedir.");
		}
	}
}
