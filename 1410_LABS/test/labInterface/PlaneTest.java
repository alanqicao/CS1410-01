/**
 * 
 */
package labInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author Qi Cao
 *
 */
class PlaneTest {
	private static ByteArrayOutputStream message;
	private static PrintStream consoleOutput;
	private Plane plane = new Plane(2,"A380");
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		consoleOutput =System.out;
		// redirect System.out to write to a byteArray instead
		message = new ByteArrayOutputStream();
		PrintStream newOutPut = new PrintStream(message);
		System.setOut(newOutPut);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.setOut(consoleOutput);
	}

	/**
	 * Test method for {@link labInterface.Plane#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("A380 with 2 engines",plane.toString());
	}

	/**
	 * Test method for {@link labInterface.Plane#launch()}.
	 */
	@Test
	void testLaunch_validatePrinteMessage() {
		plane.launch();
		String expected = "Rolling until take-off"+System.lineSeparator();
		String actual = message.toString();
		assertEquals(expected,actual);
		message.reset();
	}

	/**
	 * Test method for {@link labInterface.Plane#land()}.
	 */
	@Test
	void testLand_validatePrinteMessage() {
		plane.land();
		String expected = "Rolling to a stop"+System.lineSeparator();
		String actual = message.toString();
		assertEquals(expected,actual);
		message.reset();
	}

}
