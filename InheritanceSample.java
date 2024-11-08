public class InheritanceSample {
	public static void main(String[] args) {
		Student student1 = new Student ("Iverene Grace M. Causapin", "Balayan, Batangas", "BSIT", 2);
		System.out.println("Student Name: " + student1.getname());
		System.out.println("Student Address: " + student1.getaddress());
		System.out.println("Student Program: " + student1.getprogram());
		System.out.println("Student Year: " + student1.getyear());
		
		System.out.println(" \n ");
		
		Staff staff1 = new Staff ("Staff 1", "Balayan, Batangas", "BSU Balayan", 15000.00);
		System.out.println("Staff Name: " + staff1.getname());
		System.out.println("Staff Address: " + staff1.getaddress());
		System.out.println("Staff School: " + staff1.getschool());
		System.out.println("Staff Salary: " + staff1.getsalary());
	}
}

class Person {
    protected String name;
    protected String address;
    
    public void setname (String name) {
        this.name = name;
    }
    
    public void setaddress (String address) {
        this.address = address;
    }
    
    public String getname() {
        return name;
    }
    
    public String getaddress() {
        return address;
    }
}

class Student extends Person {
    private String program;
    private int year;
    
    public Student (String name, String address, String program, int year) {
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
    }
    
    public void setprogram (String program) {
        this.program = program;
    }
    
    public void setYear (int year) {
        this.year = year;
    }
    
    public String getprogram() {
        return program;
    }
    
    public int getyear() {
        return year;
    }
}

class Staff extends Person {
    private String school;
    private double salary;
    
    public Staff (String name, String address, String school, double salary) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }
    
    public void setschool (String school) {
        this.school = school;
    }
    
    public void setsalary (double salary) {
        this.salary = salary;
    }
    
    public String getschool() {
        return school;
    }
    
    public double getsalary() {
        return salary;
    }
}