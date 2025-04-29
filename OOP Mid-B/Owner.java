public class Owner extends Person1 {
    public Owner(String name){
        super(name);
    }
    public String display(){
        return String.format("Name: ",getname());
    }

}
