public class Demo{

	public static void main(String args[]){
		Employee employee;
		SystemUnit systemUnit;
		Lab lab=new Lab("CUI Lab",new Employee("Ahmad","CEO"),new SystemUnit("i7","8GB","512GB",0001,"HP-1010"),true);
		System.out.println(lab.toString());

//		System.out.println(employee.toString());
//		System.out.println(systemUnit.toString());
	}
}