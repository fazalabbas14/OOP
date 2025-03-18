public class Lab{
	
	private String labName;
	Employee labStaff;
	SystemUnit system;
	boolean multiMedia;

	public Lab(String labName,Employee labStaff,SystemUnit system,boolean multiMedia){
		this.labName=labName;
		this.labStaff=labStaff;
		this.system=system;
		this.multiMedia=multiMedia;
	}

	public void setlabName(String labName){
		this.labName=labName;
	}
	public String getlabName(){
		return labName;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Lab Name: ").append(labName)
		.append("\nLab Staff: ").append(labStaff)
		.append("\nSystem Unit: ").append(system)
		.append("\nMulti Media: ").append(multiMedia);
		return sb.toString();
	}
	
	
	

	
	
}