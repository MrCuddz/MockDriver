package SRS.StudentRegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testUsername {
	
	@Test
	public void testUser(){
		Student s1 = new Student("LeBron James", 30, 12, 1984);
		Student s2 = new Student("Ja Rule",29, 2, 1976);
		assertEquals("username must be LeBronJames31","LeBronJames31",s1.getUsername());
		assertEquals("username must be JaRule40","JaRule40",s2.getUsername());
	}
}
