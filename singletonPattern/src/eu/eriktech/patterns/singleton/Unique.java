package eu.eriktech.patterns.singleton;

public class Unique {
	
	private static Unique SINGLETON;
		
	private Integer value = null;
	
	public Unique(){
		if (SINGLETON == null){
			value = 0;
			SINGLETON = this;
		}
		SINGLETON.value++;
	}

	//** this is delegation
	public Integer getValue(){
		return SINGLETON.value;
	}
	
	public void setValue(Integer value){
		SINGLETON.value = value;
	}
	
	public String toString(){
		return "[Unique: value= " + SINGLETON.value.toString() + "]";
	}
	
}
