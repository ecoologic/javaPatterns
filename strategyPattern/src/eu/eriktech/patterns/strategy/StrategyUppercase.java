package eu.eriktech.patterns.strategy;

public class StrategyUppercase implements ConversionStrategyInterface {
	@Override
	public String convert(String source){
		return source.toUpperCase();
	}
	
}
