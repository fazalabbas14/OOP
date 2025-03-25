public class Student extends Person{
	String rollNumber;
	
	public Student(String name,int age,String rollNumber){
		super(name,age);
		this.rollNumber=rollNumber;
	}

	public void setrollNumber(String rollNumber){
		this.rollNumber=rollNumber;
	}
	public String getrollNumber(){
		return rollNumber;	
	}

	public String toString(){
		return String.format("\nName:%s \nAge:%d \nRoll number:%s \n",getname(),getage(),rollNumber);
	}
}