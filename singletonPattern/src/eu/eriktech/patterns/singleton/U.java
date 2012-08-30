package eu.eriktech.patterns.singleton;

public class U {
	private Integer value= 0;
	
	private static U SINGLETON = null;
		
	private U () {}
	
	public static U getInstance () {
		if ( SINGLETON == null )
			SINGLETON = new U();
		
		SINGLETON.value++;
		
		return SINGLETON;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	@Override
	public String toString(){
		return "[U: value= " + SINGLETON.value + "]";
	}
}
