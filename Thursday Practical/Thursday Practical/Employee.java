class Employee {
	String name;
	int yearOfJoining;
	String address;
	
	public Employee(String name,  int yearOfJoining,   String address) 
        {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	
	
	public String toString() 
        {
		return (name + "\t\t" +yearOfJoining + "\t\t" +address + "\t\t") ;
	}



	public static void main(String[] args) 
        {
		Employee e1 = new Employee("Robert ", 1994,  "64C-Walls Streat");
		Employee e2 = new Employee("Sam",     2000,  "68C-Walls Streat");
		Employee e3 = new Employee("jhon",    1999,  "26B-Walls Streat");
		

		
		
		System.out.println("Employee Name\t Year of Joining \t Address");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}
	
	

}