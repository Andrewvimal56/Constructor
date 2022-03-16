package constructor.org;

public class Company {
	public Company() {
		this(34567);
		System.out.println("Default constructor");
	}

	public Company(int id) {
		this("vimal");
		System.out.println(id);
	}

	public Company(String name) {
		this(987656777l);
		System.out.println(name);
	}

	public Company(long department) {
		System.out.println(department);
	}

	public static void main(String[] args) {
	//	Company c= new Company();
	}

}
