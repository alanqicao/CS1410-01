/**
 * 
 */
package nuisance;



/**
 * @author caose_000
 *
 */
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		if(age>=1 && age<=150) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("Age between 1 and 150 (inclusive)");
		}
		this.name = name;
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return name+"("+age+ ")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
