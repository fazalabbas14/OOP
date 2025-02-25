import java.util.Scanner;
public class StudentData{

	public static void main(String args[]){

	Scanner input=new Scanner(System.in);	
	String username;
	String password;
	
	System.out.print("Enter Username: ");
	username=input.nextLine();        
	System.out.print("Enter password: ");
	password=input.nextLine();
	Userinfo info=new Userinfo();
	
	if(username.equals(info.username)&&password.equals(info.password)){
		System.out.printf("Verification done! You can proceed further now.\n\n");
	}
	else{
		System.out.println("Verification failed!\n\n");
		System.exit(1);
	}



	
	Data std=new Data("Hassan Ali","Lahore",3.00,123456789);
	std.displayData();

	Data std1=new Data("Sian","Lahore",89.0,1233332);
        std1.displayData();


	Data std2=new Data("Sarfraz Hameed","Lahore",8.0,134679086);
        std1.displayData();
	
	}



}
