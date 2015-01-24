// The class is serialized for IO operations
public class Person implements java.io.Serializable {
	// attributes declared as private
	private String name;
	private boolean deceased;
 
 
	// Default Constructor
	public Person() { }
 
	// getXxxx to access the name attribute
	public String getName() {
		return this.name;
	}
 
	// setXxxx to mutate the name attribute
	public void setName(String name) {
		this.name = name;
	}
 
	// isXxxx to access boolean attribute
	public boolean isDeceased() {
		return this.deceased;
	}
 
	// setXxxx to mutate boolean attribute
	public void setDeceased(boolean deceased) {
		this.deceased = deceased;
	}
}