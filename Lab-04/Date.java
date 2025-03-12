public class Date{

	public int day;
	public int month;
	public int year;

	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date(Date other){
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}
	void showDate(){
		System.out.printf(day,month,year);
	}
	boolean equals(Object obj){
		if(this==obj){
			return true;	
		}	
		else{
			return false;
		}
	}
	int getDay(){
		return day;
	}
	void setDay(int day){
		this.day=day;
	}
	int getMonth(){
		return month;
	}
	void setMonth(int month){
		this.month=month;
	}
	int getyear(){
		return year;
	}
	void setyear(int year){
		this.year=year;
	}
}