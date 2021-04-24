package Interval;

public class Intervall {
	private int _lowerBound;
	private int _upperBound;

	Intervall(){
//		_lowerBound=0;
//		_upperBound=0;
	}
	Intervall(int l,int u){
		_lowerBound=l;
		_upperBound=u;
	}
	
	
	public String sout () {
	 String ergebnis;
	 ergebnis="["+this._lowerBound+","+this._upperBound+"]";
	 return ergebnis;
	}
    public void drucken(String s) {
    	sout();
    	System.out.print(s);
    }
    
    public boolean contains(int zahl) {
    	return (	zahl>=_lowerBound && zahl<=	_upperBound);
    }
    
    public boolean contains(Intervall intervall) {
    	return (this.contains(intervall._lowerBound) && 
    			this.contains(intervall._upperBound));
    }
    
    public boolean disjoint(Intervall intervall) { 
    	return (this._upperBound<intervall._lowerBound ||
    			this._lowerBound>intervall._upperBound);
     }
    public Intervall intersection(Intervall intervall) {
    	Intervall ergebnis;
    	int lb,ub;
    	lb=Math.max(this._lowerBound,intervall._lowerBound);
    	ub=Math.min(this._upperBound,intervall._upperBound);
    	ergebnis=new Intervall(lb,ub);
    	return ergebnis;
    	
    }

}
