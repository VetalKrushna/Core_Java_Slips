/*10. Write a program to display the Employee(Empid, Empname, Empdesignation,
Empsal) information using toString().*/

package First;

public class Que10 
{
	
	    private int empid;
	    private String empname;
	    private String empdesignation;
	    private double empsal;

	    public void accept(int empid, String empname, String empdesignation, double empsal) {
	        this.empid = empid;
	        this.empname = empname;
	        this.empdesignation = empdesignation;
	        this.empsal = empsal;
	    }

	    
	    public String toString()
	    {
	        return "Employee ID: " + empid + "\n" + "Employee Name: " + empname + "\n" + "Employee Designation: " 
	                +  empdesignation +	"\n" + "Employee Salary: " + empsal;
	    }

	    public static void main(String[] args) 
	    {
	        Que10 emp = new Que10();
	        emp.accept(1, "ABC", "Software Engineer", 60000.00);
	        System.out.println(emp);
	    }
	}

