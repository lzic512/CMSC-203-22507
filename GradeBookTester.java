import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook book1;
	GradeBook book2;
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		book1.addScore(67);
		book1.addScore(86);
		book2.addScore(92);
		book2.addScore(47);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}
	@Test
	void testAddScore() {
		assertTrue(book1.toString().equals("67.0 86.0"));
	}

	@Test
	void testSum() {
		assertEquals( book1.sum(), 153);
	}

	@Test
	void testMinimum() {
		assertEquals( book1.minimum(), 67);
	}

	@Test
	void testFinalScore() {
		assertEquals( book1.finalScore(), 86);
	}

}
