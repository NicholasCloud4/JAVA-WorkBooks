public class Main {
  
    public static void main(String[] args) {
    	Employee zack = new Employee("Zack", "Programmer");
    	Employee gio = new Employee("Gio", "Analyst");
    	Employee thomas = new Employee("Thomas", "Programmer");
      
		System.out.println(Employee.getHiredCount());
		doStuff();
    }
    
    public static void doStuff() {
    	System.out.println("I AM DOING STUFF");
    }
  
}
