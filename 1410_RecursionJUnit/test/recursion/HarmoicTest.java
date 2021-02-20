package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class HarmoicTest {
	
	private final double DELTA= 1e-9;
	private final double DELTA2=0.000000001;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void harmonic_negativeNumber_singular() {
		assertEquals(-2.2833333333333333333333333333333, Recursion.harmonic(-5),DELTA2);
	}
	
	
	@Test
	void harmonic_numberEqualToOne(){
		assertEquals(1, Recursion.harmonic(1),DELTA2);
	}
	

	
	@Test
	void harmonic_zeroNumber() {
		assertThrows(IllegalArgumentException.class,()-> {Recursion.harmonic(0);});
	}
	
	@Test
	void harmonic_positiveNumber_singular() {
		assertEquals(2.7178571428571428571428571428571, Recursion.harmonic(8),DELTA2);
	}
	


}
