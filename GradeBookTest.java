import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	
	
	
	
	GradeBook gradebook;
	
	

	@BeforeEach
	void setUp() throws Exception {
		
		
		
		
		  gradebook = new GradeBook(5);
 
		gradebook.addScore(34.0);
		
		gradebook.addScore(54.0);
		
		 

	}

	@AfterEach
	void tearDown() throws Exception {
		
		gradebook = null;
	}

	@Test
	void testAddScore() {
 		
		assertTrue(gradebook.toString().equals("34.0 54.0 ") ) ;
		assertEquals(88, gradebook.getScoreSize() );

	}

	@Test
	void testSum() {
		 
		
		
		assertEquals(88, gradebook.sum() );
	}

	@Test
	void testMinimum() {
 		assertEquals(34, gradebook.minimum(), .001);
	}

	@Test
	void testFinalScore() {
 		assertEquals(54, gradebook.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
