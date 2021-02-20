package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodingBatTest {
	private CodingBat newWord;

	@BeforeEach
	void setUp() throws Exception {
		newWord = new CodingBat();
		
	}



	@Test
	void testWordEndsCase1() {
		
		String expected = "c13i";
		String actual = newWord.wordEnds("abcXY123XYijk","XY");
		assertEquals(expected,actual);
		
		
	}
	
	@Test
	void testWordEndsCase2() {
		String expected = "13";
		String actual = newWord.wordEnds("XY123XY","XY");
		assertEquals(expected,actual);
	}
	
	@Test
	void testWordEndsCase3() {
		String expected = "11";
		String actual = newWord.wordEnds("XY1XY","XY");
		assertEquals(expected,actual);
		}
	
	@Test
	void testWordEndsCase4() {
		String expected = "XY";
		String actual = newWord.wordEnds("XYXY","XY");
		assertEquals(expected,actual);
		}
	
	@Test
	void testWordEndsCase5() {
		String expected = "";
		String actual = newWord.wordEnds("XY","XY");
		assertEquals(expected,actual);
	}
	
	@Test
	void testWordEndsCase6() {
		String expected = "";
		String actual = newWord.wordEnds("Hi","XY");
		assertEquals(expected,actual);
	}
	
	@Test
	void testWordEndsCase7() {
		String expected = "";
		String actual = newWord.wordEnds("","XY");
		assertEquals(expected,actual);
	}
	
	@Test
	void testWordEndsCase8() {
		String expected = "cxziij";
		String actual = newWord.wordEnds("abc1xyz1i1j","1");
		assertEquals(expected,actual);
	}
	@Test
	void testWordEndsCase9() {
		String expected = "cxz11";
		String actual = newWord.wordEnds("abc1xyz11","1");
		assertEquals(expected,actual);
	}
	@Test
	void testWordEndsCase10() {
		String expected = "11";
		String actual = newWord.wordEnds("abc1xyz1abc","abc");
		assertEquals(expected,actual);
	}
	@Test
	void testWordEndsCase11() {
		String expected = "acac";
		String actual = newWord.wordEnds("abc1xyz1abc","b");
		assertEquals(expected,actual);
	}
	@Test
	void testWordEndsCase12() {
		String expected = "1111";
		String actual = newWord.wordEnds("abc1abc1abc","abc");
		assertEquals(expected,actual);
	}

	

}
