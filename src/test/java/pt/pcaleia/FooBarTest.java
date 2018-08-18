package pt.pcaleia;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author Pedro Caleia
 */
public final class FooBarTest {
	
	
	@Test
	public void testMultiply() {
		FooBar fooBar = new FooBar( 10, 20 );
		
		Assertions.assertEquals( 201, fooBar.multiply() );
	}

}
