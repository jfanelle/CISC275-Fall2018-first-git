public class Dog extends Animal implements Comparable<Animal> {

	Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public String toString() {
		return this.name + ": " + Integer.toString(this.legs);
	}

	public int compareTo(Animal a) {
		return this.name.compareTo(a.name);
	}

}
