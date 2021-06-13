package experiment_2;

public class e2_1 {

	public static void main(String[] args) {
		Pet myPet = new Pet("George");
		Dog myDog = new Dog("Spot");
		myPet     = new Cat("George");
		System.out.println(myPet.toString() + "\n" + "Speak: " + myPet.speak() + "\n" + myPet.move() + " " + myPet.getName() + "\n");
		System.out.println(myDog.toString() + "\n" + "Speak: " + myDog.speak()	+ "\n" + myDog.move() + " " + myDog.getName() + "\n");
	}

}
