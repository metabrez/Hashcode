package hashcode;

class CurrencyNote{
	
	private int value;
	CurrencyNote(int value){
		
		this.value=value;
	}
	
	public int hashCode(){
		
		return value;
	}
	
	public boolean equals(Object obj){
		
		CurrencyNote n=(CurrencyNote) obj;
		if(this.value==n.value)
			return true;
		else
			return false;
				
	}
}

public final class HashCodeEqual {
	
	public static void main(String[]args){
	
		
		CurrencyNote c1=new CurrencyNote(500);
		CurrencyNote c2=new CurrencyNote(500);
		
		System.out.println(c1==c2);//comparing original address
		System.out.println(c1.equals(c2));//compares current obj
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}

}
