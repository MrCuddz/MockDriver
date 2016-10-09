package SRS.StudentRegistrationSystem;

import org.joda.time.*;

public class Student {

	private String name;
	private String username;
	private int age;
	private LocalDate dob;


	public Student(String name, int dd, int mm, int yyyy){

		this.name = name;

		this.dob = new LocalDate(yyyy, mm, dd);
		LocalDate now = LocalDate.now();

		this.age = Years.yearsBetween(this.dob, now).getYears();

		this.username = getUsername();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		String n = name.trim();
		n = n.replaceAll(" ", "");
		n=n.replaceAll("\'", "");				
		String user = n+age;
		return user;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
