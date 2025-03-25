public class School{
	private String name;
	private String address;
	ClassRoom[] classRoom=new ClassRoom[5];
	private Principal principal;

	public School(String name,String address,ClassRoom[] classRoom,Principal principal){
		this.name=name;
		this.address=address;
		for(int i=0;i<5;i++){
			this.classRoom[i]=classRoom[i];
		}
		this.principal=principal;
	}

	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}

	public void setaddress(String address){
		this.address=address;
	}
	public String getaddress(){
		return address;
	}

	public void setprincipal(Principal principal){
		this.principal=principal;
	}
	public Principal getprincipal(){
		return principal;
	}

	public String toString(){
		StringBuilder sb=new StringBuilder("\nSchool Name: "+name +"\nAddress: "+address +"\nPrincipal: "+principal +"\nClassrooms: ");
		for(int i=0;i<5;i++){
			sb.append(classRoom[i]);
		}
		sb.append("\n");
		return sb.toString();
	}
}