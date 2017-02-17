package coinpurse;

public class BankNote implements Comparable<BankNote>, Valuable{
	private double value;
	private String currency;
	private static long nextSerialNumber = 1000000;
	private long serialNumber;
	public static final String DEFAULT_CURRENCY = "Baht";
	
	public BankNote(double value){
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
	}
	
	public BankNote(double value, String currency){
		this.value = value;
		this.currency = currency;
	}
	
	public double getValue(){
		return this.value;
	}
	
	public String getCurrency(){
		return this.currency;
	}
	
	public long getSerial(){
		return this.serialNumber;
	}
	
	public boolean equals(Object obj) {
    	if (obj==null)return false;
    	if (obj.getClass()!=this.getClass())return false;
    	BankNote other = (BankNote) obj;
    	if (value == other.value)return true;
    	return false;
    }
	
	public String toString(){
		return this.value+""+"-"+this.currency+" note ["+this.serialNumber+"]";
	}
	
	public int compareTo(BankNote bn){
		if(bn == null)return -1;
    	if(this.value > bn.value)return 1;
    	else if(this.value < bn.value)return -1;
    	else return 0;
    }
}
