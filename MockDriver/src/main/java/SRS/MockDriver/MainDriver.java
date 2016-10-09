package SRS.MockDriver;

import org.joda.time.LocalDate;

import SRS.StudentRegistrationSystem.Course;
import SRS.StudentRegistrationSystem.Module;
import SRS.StudentRegistrationSystem.Student;


public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Course
		LocalDate start = new LocalDate("2013-09-05");
		LocalDate end = new LocalDate("2018-09-05");
		Course compSci = new Course("CS & IT", start, end);
		
		//modules
		Module ct417 = new Module("Software Engineering III", "CT417");
		Module ct475 = new Module("Machine Learning and Data Mining", "CT475");
		Module ct561 = new Module("Systems Modelling and Simulation", "CT561");
		
		//Students
		Student s1 = new Student("Clams Caino", 12, 5, 1987);
		Student s2 = new Student("Kendrick Lamar", 17, 6, 1987);
		Student s3 = new Student("Danny Brown", 16, 3, 1981);
		Student s4 = new Student("Donald Glover", 25, 9, 1983);
		Student s5 = new Student("Curtis Jackson", 6, 07, 1975);
		Student s6 = new Student("Marshall Mathers", 17, 10, 1972);
		Student s7 = new Student("Kanye West", 8, 6, 1977);
		
		//add students to modules
		ct417.addStudent(s1);
		ct417.addStudent(s2);
		ct417.addStudent(s3);
		ct417.addStudent(s4);
		ct417.addStudent(s5);
		ct417.addStudent(s6);
		ct417.addStudent(s7);
		
		ct475.addStudent(s7);
		ct475.addStudent(s4);
		ct475.addStudent(s1);
		
		ct561.addStudent(s2);
		ct561.addStudent(s3);
		ct561.addStudent(s5);
		ct561.addStudent(s6);
		
		//addmodules to course
		compSci.addModule(ct417);
		compSci.addModule(ct475);
		compSci.addModule(ct561);
		
		//p[rinting
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("Course: "+ compSci.getName());
		System.out.println("-------------------------------------------");
		System.out.println("Modules");
		System.out.println("-------------------------------------------");
		System.out.println(ct417.getName());
		System.out.println(ct475.getName());
		System.out.println(ct561.getName());
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("Module: "+ct417.getName());
		System.out.println("-------------------------------------------");
		System.out.println("Students");
		System.out.println("-------------------------------------------");
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		System.out.println(s4.getName());
		System.out.println(s5.getName());
		System.out.println(s6.getName());
		System.out.println(s7.getName());
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("Module: "+ct475.getName());
		System.out.println("-------------------------------------------");
		System.out.println("Students");
		System.out.println("-------------------------------------------");
		System.out.println(s1.getName());
		System.out.println(s4.getName());
		System.out.println(s7.getName());
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("Module: "+ct561.getName());
		System.out.println("-------------------------------------------");
		System.out.println("Students");
		System.out.println("-------------------------------------------");
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		System.out.println(s5.getName());
		System.out.println(s5.getName());
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		
		
		
	}

}
