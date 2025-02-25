public class Data{
	private String name;
	private String city;
	private double gpa;
	private int mobile;
	private static int reg_no=0;  

	public Data(String name1,String city1,double gpa1,int mobile1){
		name=name1; //this.name=name, in this you don't want to 
		city=city1;
		gpa=gpa1;
		mobile=mobile1;
                reg_no++;
	}

	public String getname(){
               return name;
	}
	public void setname(String n){
               name=n;
	}

	public String getcity(){
               return city;
	}
	public void setcity(String c){
               city=c;
	}

	public double getgpa(){
               return gpa;
	}
	public void setgpa(double g){
               gpa=g;
	}

	public int getmobile(){
               return mobile;
	}
	public void setmobile(int m){
               mobile=m;
	}

	public void displayData(){
		System.out.println("Student Name: "+name);
		System.out.println("Student City: "+city);
		System.out.println("Student CGPA: "+gpa);
		System.out.println("Student mobile number: "+mobile);
		System.out.printf("Student Reg. No: FA24-BCS-%s\n\n",String.format("%03d",reg_no));
	}

}