public class Main{
	public static void main(String args[]){
		Teacher[] teacher=new Teacher[5];
	        for (int i = 0; i < 5; i++) {
			teacher[i]=new Teacher("Ali"+i,25+i,"SST"+i);
        	}
		Student[] student=new Student[5];
	        for (int i = 0; i < 5; i++) {
			student[i]=new Student("Ali Ahmad"+i,15+i,"FA24-BCS-00"+(i+1));
        	}
		Principal principal=new Principal("Mustafa Ali",50,"20 years");
		ClassRoom[] classroom=new ClassRoom[5];
	        for (int i = 0; i < 5; i++) {
			classroom[i]=new ClassRoom("Grade"+(i+1),"G-"+(i+1),teacher[i],student);
        	}
		School school=new School("CUI Lahore","Raiwind Lahore",classroom,principal);
		System.out.println(school.toString()+"\n");
	}
}