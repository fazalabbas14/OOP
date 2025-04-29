public class ParkingSystem {
    private ParkingSystem instance;
    private String designation;
    private Supervisor supervisor;
    private ParkingZone zone[]=new ParkingZone[2];
    private int zoneCount=0;

    public ParkingSystem(String designation, Supervisor supervisor){
        this.designation=designation;
        this.supervisor=supervisor;
    }

    public ParkingSystem getInstance(String designation,Supervisor supervisor){
        instance=new ParkingSystem(designation, supervisor);
        return instance;
    }

    public void addzone(ParkingZone zone){
        if(zoneCount<zone.length){
            zone[zoneCount++]=zone;
        }
    }

    

}
