import java.util.Scanner;
public class Task01{
	
	public static void main(String args[]){
	
	Scanner input= new Scanner(System.in);
	Scanner input1= new Scanner(System.in);

	System.out.println("This is my first java task.");
	byte b=1;
	short s=100;
	long l=100000;
	int i=10;
	float f=109.0f;
 	double d=1000.0;
	boolean bool=true;
	String str="Fazal";
	char c='A';
	System.out.printf("Byte value:\t %d \n",b);
	System.out.printf("Short value:\t %d \n",s);
	System.out.printf("Long value:\t %d \n",l);
	System.out.printf("Integer value:\t %d \n",i);
	System.out.printf("Float value:\t %,.1f \n",f);
	System.out.printf("Double Value:\t %,.1f \n",d);
	System.out.printf("String:\t %s \n",str);
	System.out.printf("Character:\t %s \n",c);
	System.out.printf("Boolean value:\t %b \n",bool);

	System.out.printf("Enter byte value: ");
        byte b1=input.nextByte();
	System.out.println(b1);

	System.out.printf("Enter Short Value: ");
	short s1=input.nextShort();
	System.out.println(s1);

	System.out.printf("Enter Long value: ");
	long l1=input.nextLong();
	System.out.println(l1);

	System.out.printf("Enter integer value: ");
	int i1=input.nextInt();
	System.out.println(i1);

	System.out.printf("Enter float value: ");
	float f1=input.nextFloat();
	System.out.println(f1);

	System.out.printf("Enter double value: ");
	double d1=input.nextDouble();
	System.out.println(d1);

	System.out.printf("Enter First String: ");
	String str1=input.next();
	System.out.println(str1);

	System.out.printf("Enter second String: ");
	String str2=input1.nextLine();
	System.out.println(str2);

	System.out.printf("Enter Character: ");
	char c1=input1.next().charAt(0);
	System.out.println(c1);
	}
        

}