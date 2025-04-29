public class ParkingZone {
    private int zoneCount=1;
    private static String zoneId;
    private int counter=0;
    private Vehicle vehicle[]=new Vehicle[5];

    public ParkingZone(){
        zoneId= "A"+zoneCount++;
    }

    public void addVehicle(Vehicle v){
        if(counter<5){
            vehicle[counter++]=v;
        }
        else{
            System.out.println("Zone Full: "+counter);
        }
    }
    
    public String display(){
        return String.format("Zone Id:%s \nVehicles:\n ",zoneId, vehicle);
    }

    
}
