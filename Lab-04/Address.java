public class Address{

	public String street;
	public String city;

	public Address(String street,String city){
		this.street=street;
		this.city=city;
		
	}
	public Address(Address other){
		this.street=other.street;
		this.city=other.city;
	}
	void showAddress(){
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
	}

	boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		else{
			return false;
		}
	}
	void setStreet(String street){
		this.street=street;
	}
	String getCity(){
		return city;
	}
	void setCity(String city){
		this.city=city;
	}
}