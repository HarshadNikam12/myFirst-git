package Project;

public class Employee 
{
	private int id;
	private String name;
	private String dept;
	private long sallary;
	public Employee(int id, String name, String dept, long sallary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sallary = sallary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSallary() {
		return sallary;
	}
	public void setSallary(long sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sallary=" + sallary + "]";
	}
	
	
	
	
	

}
