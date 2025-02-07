package Hello;

public class Person {
	//Data Fields
	String first_name;
	String last_name;
	int age;
	
	//Constructors
	
	/** Params:
	 * chosen_name 	-- preferred name
	 * name        	-- arr of first and last name
	 * age      	-- age of person
	 */
	public Person(String first_name, String last_name, int age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}

	//Methods
	
	public Person makePerson(Person that) throws UnderAgeException {
		if (this.age < 18 || that.age < 18) {
			throw new UnderAgeException();
		}
		
		Person child = new Person(this.first_name,that.last_name,0);
		
		return child;
	}
	
	@Override
	public String toString() {
		return "Person: " + first_name + " " + last_name + ", Age: " + age;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
