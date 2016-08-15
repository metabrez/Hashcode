package hashcode;

public class HashEqual {
	
	private int value;
	
	HashEqual(int value){
		
		this.value=value;
		
	}
	public int HashCode(){
		return value;
		
		
	
}
//class Demo2{
	
	public static void main(String[]args){
		
		HashEqual e1=new HashEqual(500);
		
		HashEqual e2=new HashEqual(500);
		System.out.println("printing Hashcode in decimal");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println("Printing Hexadecimal code");
		
		System.out.println(Integer.toHexString(e1.hashCode()));
		System.out.println(Integer.toHexString(e2.hashCode()));
		
	}

}
