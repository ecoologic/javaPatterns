package eu.eriktech.patterns.strategy;

public class StrategyNoChange implements ConversionStrategyInterface {

	@Override
	public String convert(String source) {
		return source;
	}

}
