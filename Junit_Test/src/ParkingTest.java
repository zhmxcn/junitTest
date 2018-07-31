import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParkingTest {
	private Parking p = null; 
	@Before
	public void setUp() throws Exception {
		p = new Parking();
		p.setMax(1);
	}

	@Test
	public void when_park_car1_return_true() {
		assertEquals(true,p.park(new Car(1)));
	}
	@Test
	public void when_park_car2_return_false() {
		assertEquals(false,p.park(new Car(2)));
	}
	@Test
	public void when_get_car1_return_true() {
		assertEquals(true,p.getCar(1));
	}
	@Test
	public void when_get_car1_return_false() {
		assertEquals(false,p.getCar(1));
	}
	
}
