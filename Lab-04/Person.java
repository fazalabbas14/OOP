public class Person{

	public String name;
	public String role;
	Address address;

	public Person(String name, Address address){
		this.name=name;
		this.address=new Address(address);
	}
	public Person(String name, String role, Address address){
		this.name=name;
		this.role=role;
		this.address=new Address(address);
	}
	public Person(Person other){
		this.name=other.name;
		this.role=other.role;
		this.address=other.new Address(address);
	}
	void showPersonDetails(){
		System.out.println("Name: "+name);
		System.out.println("Role: "+role);
		System.out.println("Address: "+address.showAddress);
	}
	boolean equals(Object obj){	
		if(this==obj){	
			return true;
		}
		else{						
			return false;
		}
	}
	String getName(){
		return name;
	}
	void setName(String name){
		this.name=name;
	}
	String getrole(){
		return role;
	}
	void setrole(String role){
		this.role=role;
	}
}