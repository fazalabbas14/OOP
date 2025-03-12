public class LibraryApp{
	
	public static void main(String args[]){
		Library lib=new Library("CUI Library",new Book("AI","123-321",new Date(10,12,2025),new Person("Fazal ",new Address("Lahore","Pakistan"))),new Person ("Incharge",new Person ("Ali",new Address("Ali Housing","Lahore"))),new Person ("Staff",new Person ("Ahmad",new Address("Damman Housing","Lahore"))));
	System.out.println(library);
	}

}