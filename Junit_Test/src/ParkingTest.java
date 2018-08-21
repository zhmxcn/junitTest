import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParkingTest {
	private Parking p = null; 
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void when_park_car1_return_true() {
		p = new Parking();
		p.setMax(1);
		assertEquals(true,p.park(new Car(1)));
	}
	@Test
	public void when_park_car2_return_false() {
		p = new Parking();
		p.setMax(1);
		p.park(new Car(1));
		assertEquals(false,p.park(new Car(2)));
	}
	@Test
	public void when_get_car1_return_true() {
		p = new Parking();
		p.setMax(1);
		p.park(new Car(1));
		assertEquals(true,p.getCar(1));
	}
	@Test
	public void when_get_car1_return_false() {
		p = new Parking();
		p.setMax(1);
		p.park(new Car(1));
		assertEquals(false,p.getCar(1));
	}
	
}
