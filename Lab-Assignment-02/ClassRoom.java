public class ClassRoom{
	private String className;
	private String classCode;
	private Teacher teacher;
	Student[] student=new Student[5];
	private int stdCount=0;

	public ClassRoom(String className,String classCode,Teacher teacher,Student[]student){
		this.className=className;
		this.classCode=classCode;
		this.teacher=teacher;
		for(int i=0;i<5;i++){
			this.student[i]=student[i];
		}
	}

	public void setclassName(String className){
		this.className=className;
	}
	public String getclassName(){
		return className;
	}

	public void setclassCode(String classCode){
		this.classCode=classCode;
	}
	public String getclassCode(){
		return classCode;
	}

	public void setteacher(Teacher teacher){
		this.teacher=teacher;
	}
	public Teacher getteacher(){
		return teacher;
	}

	public String toString(){
		StringBuilder sb=new StringBuilder("\nClass Name: "+className +"\nClass Code: "+classCode +"\nTeacher name: "+teacher +"\nStudent: ");
		for(int i=0;i<5;i++){
			sb.append(student[i]);
		}
		sb.append("\n");
		return sb.toString();
	}
}