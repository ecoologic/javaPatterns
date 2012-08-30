package eu.eriktech.patterns.strategy;

// similar to state, use together with singleton
public abstract class Writer {
	// ? with the following code and non abstract class strategy becomes state pattern
//	private ConversionStrategyInterface defaultStrategy;
//	
//	public Writer(ConversionStrategyInterface defaultStrategy){
//		this.defaultStrategy = defaultStrategy;
//	}
//	
//	public String write(String source){
//		return defaultStrategy.convert(source);
//	}

	public static String write(String source, ConversionStrategyInterface strategy){
		return strategy.convert(source);
	}


	
}
