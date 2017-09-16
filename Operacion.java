package strategy;

public class Operacion implements StrategyOperation{
	public StrategyOperation sum=new Suma();
	public StrategyOperation res=new Resta();
	public StrategyOperation mul=new Multiplicacion();
	public StrategyOperation div=new Division();
	
	public int operate(int a, int b) {
		return div.operate(res.operate(mul.operate(2,a),b),sum.operate(3,a));
	}
}
