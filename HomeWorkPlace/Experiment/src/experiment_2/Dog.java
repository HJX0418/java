package experiment_2;

class Dog extends Pet {
	protected int weight;
	public Dog(String s) {
		super(s);
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String speak() {
		return "Woof Woof";
	}
}
