public class Supervisor extends Person1 {
    int yearsofexperience;

    public Supervisor(String name ,int yearsofexperience){
        super(name);
        this.yearsofexperience=yearsofexperience;
    }
    
    public void setyearsofexperience(int yearsofexperience){
        this.yearsofexperience=yearsofexperience;        
    }
    public int getyearsofexperience(){
        return yearsofexperience;
    }

    public String display(){
        return String.format("Name:%s Years Of Experience:%d",getname(),yearsofexperience);
    }    
}
