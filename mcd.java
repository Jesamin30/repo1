package strategy;

public class mcd implements StrategyOperation {
	public int modulo(int a, int b){
	    int q=a/b;
	    int r=a-(b*q);
	    if(r<0){
	        return b+r;
	    }
	    return r;
	}

	public int euclides(int a,int b) {
	    int cont;
	    cont=0;
	    int r=modulo(a,b);
	    while(r!=0)
	    {
	        a=b;
	        b=r;
	        r=modulo(a,b);
	        cont++;
	    }
	    return b;
	}
	
	public int operate(int a, int b) {
		return euclides(a,b);
	}

}