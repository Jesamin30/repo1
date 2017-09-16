package strategy;

public class Division implements StrategyOperation {
	@Override
	public int operate(int a, int b) {
		if (b==0){
			return -1;
		}
		else {
			return a/b;
		}
	}

}