import java.util.*;

public class StartProgram {
	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		Cat kat = new Cat("Kat");
		animalList.add(kat);
		Dog doug = new Dog("Doug");
		animalList.add(doug);
		
		System.out.println(doug.beFriendly());
		
		System.out.println(kat.play("toy"));
		
		System.out.println(Animal.count);
		
	}

}
