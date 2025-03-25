public class Person{
	private String name;
	int age;

	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}

	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	
	public String toString(){
		return String.format("\nName:%s \nAge:%d",name,age);
	}
}