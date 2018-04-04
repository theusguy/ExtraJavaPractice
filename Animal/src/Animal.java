
public abstract class Animal {
	//State
	String name;
	int size;
	String sound;
	static int count;
	
	//Behavior
	public abstract String makeSound();
	
	public void setName(String nameHolder) throws NameNotFoundException {
		if (nameHolder.equals("")) {
			throw new NameNotFoundException("Name is empty");
		} else {
			name = nameHolder;	
		}
	}
	
	public void setSize(int sizeHolder) {
		size = sizeHolder;
	}
	

}
