public class Book{

	public String title;
	public String issn;
	Date publicationDate;
	Person author;

	public Book(String title,String issn, Date publicationDate, Person author){
		this.title=title;
		this.issn=issn;
		this.publicationDate=new Date(publicationDate);
		this.author=new Person(author);
	}
	public Book(Book other){
		this.title=other.title;
		this.issn=other.issn;
		this.publicationDate=new Date(other.publicationDate);
		this.author=new Person(other.author);		
	}
	void showBookDetails(){
		System.out.printf("Title: %s\n ISSN: %s\n Publication Data: \n Author: \n",title,issn,new Date(publicationDate),new Person(author));
	}
	public boolean equals(Object obj){

	}
	String getTitle(){
		return title;	
	}
	void setTitle(String Title){
		this.title=title;
	}
	String getIssn(){
		return issn;	
	}
	void setIssn(String issn){
		this.issn=issn;
	}

	
}