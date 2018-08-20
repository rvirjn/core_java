public class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	int classRank;
	
Employee(int empId,String empName,int classRank){
	this.empId=empId;
	this.empName=empName;
	this.classRank=classRank;
}

@Override
public int compareTo(Employee o)
{
	// TODO Auto-generated method stub
	
	return this.empId-o.empId;
}
}
