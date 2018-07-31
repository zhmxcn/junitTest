import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal = new Calculator();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void should_return_2_when_input_1_and_1() {
		assertEquals(cal.cal(1, 1, '+'),2);
	}
	@Test
	public void should_return_3_when_input_6_devide_2() {
		assertEquals(cal.cal(6, 2, '/'),3);
	}
	@Test
	public void should_return_6_when_input_2_mul_3() {
		assertEquals(cal.cal(3, 2, '*'),6);
	}
	@Test
	public void should_return_4_when_input_6_sub_2() {
		assertEquals(cal.cal(6, 2, '-'),4);
	}
}
