public class SystemUnit{

	private String cpuName;
	private String ram;
	private String diskSize;
	private int systemId;
	private String lcdModel; 

	public SystemUnit(String cpuName,String ram,String diskSize,int systemId,String lcdModel){
		this.cpuName=cpuName;
		this.ram=ram;
		this.diskSize=diskSize;
		this.systemId=systemId;
		this.lcdModel=lcdModel;
	}
	public void setcpuName(String cpuName){
		this.cpuName=cpuName;
	}
	public String getcpuName(){
		return cpuName;
	}

	public void setram(String ram){
		this.ram=ram;
	}
	public String getram(){
		return ram;
	}

	public void setdiskSize(String diskSize){
		this.diskSize=diskSize;
	}
	public String getdiskSize(){
		return diskSize;
	}

	public void setsystemId(int systemId){
		this.systemId=systemId;
	}
	public int getsystemId(){
		return systemId;
	}

	public void setlcdModel(String lcdModel){
		this.lcdModel=lcdModel;
	}
	public String getlcdModel(){
		return lcdModel;
	}

	public String toString(){
		return String.format("System Units\nCPU name:%s \nRAM size:%s \nDisk size:%s \nSystem ID:%d \nLCD Model:%s",cpuName,ram,diskSize,systemId,lcdModel);	
	}








}