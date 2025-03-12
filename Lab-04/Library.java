public class Library{

	public String name;
	Book book;
	Person incharge;
	Person staff;

	public Library(String name,Book book, Person incharge,Person staff){
		this.name=name;
		this.book=new Book(book);
		this.incharge=new Person(incharge);
		this.staff=new Person(staff);
	}
	public Library(Library other){
		this.name=other.name;
		this.book=other.new Book(book);
		this.incharge=other.new Person(incharge);
		this.staff=other.new Person(staff);
	}
	void showLibraryDetails(){
		System.out.println("Name: "+name);
		System.out.println("Book: "+new Book(book));
		System.out.println("Incharge: "+new Person(incharge));
		System.out.println("Staff: "+new Person(staff));
	}
	public boolean equals(Object obj){
		if(this.equals(obj)){
			return true;
		}
		else{
			return false;
		}
	}
	String getName(){
		return name;
	}
	void setName(String name){
		this.name=name;
	}
	
}