package pt.pcaleia;


/**
 * @author Pedro Caleia
 */
public final class BarFoo {
	
	
	private final int a;
	private final int b;
	
	
	public BarFoo( int a, int b ) {
		this.a = a;
		this.b = b;
	}
	
	
	public int multiply() {
		return this.a * this.b;
	}


	public int getA() {
		return this.a;
	}


	public int getB() {
		return this.b;
	}

}
