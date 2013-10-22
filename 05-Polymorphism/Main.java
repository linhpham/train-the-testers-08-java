public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walk();

		Person p2 = new Trainer();
		p2.walk();
	}

}

class Person {
	protected String name;
	protected int yearOfBirth;

	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}


	public void walk() {
		System.out.println("I can walk at the pace of 4 km/h.");
	}
}

class Trainer extends Person {
	public Trainer() {

	}

	/*public Trainer(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}*/

	public void walk() {
		System.out.println("I can walk at the pace of 8 km/h.");
	}

	public void run() {
		System.out.println("I can run as well.");
	}
}