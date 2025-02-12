package Hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	//Shared Test Names
	Person R;
	Person J;
	Person M;
	Person Y;
	
	@BeforeEach
	void setUp() throws Exception {
		R = new Person("Romeo", "Mon", 15);
		J = new Person("Juliet", "Cap", 13);
		M = new Person("Count","Dukoo", 54);
		Y = new Person("Yo","Da",973);
	}

	@Test
	void testToString() {
		assertEquals("Person: Romeo Mon, Age: 15", R.toString());
	}
	
	@Test
	void testMakePerson() {
		Person child;
		
		assertThrows(UnderAgeException.class, 
				() -> {R.makePerson(J);});
		assertThrows(UnderAgeException.class, 
				() -> {M.makePerson(J);});
		
		try {
			child = M.makePerson(Y);
			
			assertEquals(M.getFirst_name(), child.getFirst_name());
			assertEquals(Y.getLast_name(), child.getLast_name());
			assertEquals(0, child.getAge());
		} catch (UnderAgeException e) {
			e.printStackTrace();
			fail("threw exception");
		}
	}

}

