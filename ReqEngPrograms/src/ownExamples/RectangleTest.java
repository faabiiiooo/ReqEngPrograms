package ownExamples;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
	
	Rectangle rec = new Rectangle(20.5, 13.3);
	
	
	@Test
	public void checkCreate() {
		assertEquals(rec.getWidth(), 13.3);
		assertEquals(rec.getLength(), 20.5);
		
	}
	
	@Test
	public void checkScope() {
		assertEquals(rec.calcScope(),67.6);
	}
	
	@Test
	public void checkArea() {
		assertEquals(rec.calcArea(), 272.65, 0.0001);
	}
	
	@Test
	public void checkDeletion() {
		rec = null;
		assertNull(rec);
	}

}
