package constructor.org;

// Constructor Chaining
public class Employee extends Company {

	// The key Word this or Super should be present in the first line of the
	// constructor

	public Employee() {
		super();

		System.out.println("Default constructor");

	}

	public Employee(int id) {
	
		this("Vimal");
		System.out.println("ID:" + id);
	}

	public Employee(String name) {
		this(9876556432l);
		System.out.println("Name:" + name);
	}

	public Employee(long phno) {
		System.out.println("Phone no:" + phno);
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		// Company c = new Company();

	}
}
