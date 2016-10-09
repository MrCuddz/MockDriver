package SRS.StudentRegistrationSystem;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Course {
	
	private String name;
	
	private ArrayList<Module> modules;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String name, LocalDate sdate,LocalDate edate){
		this.name = name;
		this.endDate = edate;
		this.startDate = sdate;
		
		modules = new ArrayList<Module>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public void addModule(Module m){
		this.modules.add(m);
	}
}
