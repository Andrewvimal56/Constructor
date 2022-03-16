package constructor.org;

public class ExampleConstructor {

	// Class name constructor name should be same
	// It dosen't have any writtern type (Void)
	// When we create object the default constructor will invoke automatically
	// Two types One is non-parameterized or default
	public ExampleConstructor() {
		System.out.println("Default constructor");
	}

	// Second one parameterized constructor or argument based constructor
	public ExampleConstructor(int id) {
		System.out.println("Paraconstructor" + id);
	}

	public static void main(String[] args) {

		ExampleConstructor eC = new ExampleConstructor();// It will react for the default constructor automatically
		ExampleConstructor e = new ExampleConstructor(1234);// The second one will react to the parameterized
															// constructor

	}

}
