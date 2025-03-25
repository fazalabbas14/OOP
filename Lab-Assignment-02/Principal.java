public class Principal extends Person{
	String experience;

	public Principal(String name,int age,String experience){
		super(name,age);
		this.experience=experience;
	}

	public void setexperience(String experience){
		this.experience=experience;
	}
	public String getexperience(){
		return experience;	
	}

	public String toString(){
		return String.format("\nName:%s \nAge:%d \nExperience:%s",getname(),getage(),experience);
	}
}