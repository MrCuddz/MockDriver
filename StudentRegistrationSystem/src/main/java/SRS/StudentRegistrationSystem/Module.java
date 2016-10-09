package SRS.StudentRegistrationSystem;

import java.util.ArrayList;

public class Module {
	
	private String name;
	private String id;
	private ArrayList<Student> students;
	
	public Module(String name, String id){
		this.name = name;
		this.id = id;
		students= new ArrayList<Student>();
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student s){
		this.students.add(s);
	}
	
}
