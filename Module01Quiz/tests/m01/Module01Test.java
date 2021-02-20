/**
 * 
 */
package m01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author caose_000
 *
 */

class Module01Test {
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void methodA() {
		String expected = "barberrebrab";
		String actual = Module01Quiz.methodA("barber");
		assertEquals(expected, actual);
	}

	@Test
	void methodA_fiveChar() {
		String expected = "AyubaabuyA";
		String actual = Module01Quiz.methodA("ayuba");
		assertEquals(expected, actual);
	}

	@Test
	void methodA_4CharAndCapLetter() {
		String expected = "clayyalc";
		String actual = Module01Quiz.methodA("ClAy");
		assertEquals(expected, actual);
	}

	@Test
	void methodA_4CharAndCapLetterB() {
		String expected = "buzZZzub";
		String actual = Module01Quiz.methodA("Buzz");
		assertEquals(expected, actual);
	}

	@Test
	void methodA_8Char() {
		String expected = "hihoohih";
		String actual = Module01Quiz.methodA("Hi_ho");
		assertEquals(expected, actual);
	}

	@Test
	void methodA_null() {

		String actual = Module01Quiz.methodA(null);
		assertEquals(null, actual);
	}

	@Test
	void methodB() {
		String expected = "hi..2";
		String actual = Module01Quiz.methodB("hi");
		assertEquals(expected, actual);
	}

	@Test
	void methodB_twoAsOneLetter() {
		String expected = "Heu..2";
		String actual = Module01Quiz.methodB("Heu");
		assertEquals(expected, actual);
	}

	@Test
	void methodB_4LetterWith1combinations() {
		String expected = "Eule..3";
		String actual = Module01Quiz.methodB("Eule");
		assertEquals(expected, actual);
	}

	@Test
	void methodB_4LetterWith0combinations() {
		String expected = "Hund..4";
		String actual = Module01Quiz.methodB("Hund");
		assertEquals(expected, actual);
	}

	@Test
	void methodB_6LetterWith1combinations() {
		String expected = "maehen..5";
		String actual = Module01Quiz.methodB("maehen");
		assertEquals(expected, actual);
	}

	@Test
	void methodB_7LetterWith1combinations() {
		String expected = "maehen..5";
		String actual = Module01Quiz.methodB("maehen");
		assertEquals(expected, actual);
	}

}
