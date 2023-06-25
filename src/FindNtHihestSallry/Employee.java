package FindNtHihestSallry;


public class Employee 
{
	private int eId;
	private String name;
	private String email;
	private double sallary;
	public Employee(int eId, String name, String email, double sallary) {
		super();
		this.eId = eId;
		this.name = name;
		this.email = email;
		this.sallary = sallary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSallary() {
		return sallary;
	}
	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
	
	
	
	
	

}
