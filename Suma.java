package strategy;

public class Suma implements StrategyOperation {
	@Override
	public int operate(int a, int b) {
		return a + b;
	}

}
