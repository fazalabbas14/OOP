public class Vehicle {
    private String licensePlate;
    private String type;
    private Owner owner;  
    
    public Vehicle(String licensePlate, String type, Owner owner){
        this.type=type;
        this.licensePlate=licensePlate;
        this.owner=owner;
    }

    public void setlicensePlate(String licensePlate){
        this.licensePlate=licensePlate;
    }
    public String getlicensePlate(){
        return licensePlate;
    }

    public void settype(String type){
        this.type=type;
    }
    public String gettype(){
        return type;
    }

    public String display(){
        return String.format("Type of Vehicle:%s \nLicense Plate:%s \nOwner: ",type,licensePlate,owner.display());
    }

}
