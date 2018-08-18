package pt.pcaleia;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author Pedro Caleia
 */
public final class BarFooTest {
	
	
	@Test
	public void testMultiply() {
		BarFoo barFoo = new BarFoo( 10, 20 );
		
		Assertions.assertEquals( 201, barFoo.multiply() );
	}

}
