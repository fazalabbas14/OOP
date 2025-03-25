public class Teacher extends Person{
	String subject;

	public Teacher(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
	}

	public void setsubject(String subject){
		this.subject=subject;
	}
	public String getsubject(){
		return subject;	
	}

	public String toString(){
		return String.format("\nName:%s \nAge:%d \nSubject:%s \n",getname(),getage(),subject);
	}
}