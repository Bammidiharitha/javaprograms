package empid;
public class empid {
	public int emp_id;
	public String emp_name;
	
	empid(int emp_id,String emp_name){
		this.emp_id = emp_id;
		this.emp_name = emp_name;}
	public class employee {
		public void main(String[]args) {
			empid[]employeeArray;
			employeeArray = new empid[5];
			employeeArray[0]= new empid(1,"abcd");
			employeeArray[1]= new empid(2,"abc");
			employeeArray[2]= new empid(3,"abd");
			employeeArray[3]= new empid(4,"acd");
			employeeArray[3]= new empid(5,"bcd");
			
			for(int i=0;i<employeeArray.length;i++)
				System.out.println("Element at " +i+":"+employeeArray[i].emp_id +" "+ employeeArray[i].emp_name);
			
			
			
		
			
		}

	}
	
}
	