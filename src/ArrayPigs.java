import java.util.ArrayList;

public class ArrayPigs {
	String name;

	ArrayPigs(String name) {
		this.name = name;
	}

	void feed() {
		System.out.println("Feeding " + name);
	}

	public static void main(String[] args) {

		ArrayList<ArrayPigs> theYard = new ArrayList<ArrayPigs>();
		theYard.add(new ArrayPigs("Porky"));
		theYard.add(new ArrayPigs("Pinky"));
		theYard.add(new ArrayPigs("Perky"));
		theYard.add(new ArrayPigs("Parky"));
		theYard.add(new ArrayPigs("Purky"));
		theYard.add(new ArrayPigs("Peggy"));
		for (ArrayPigs pig : theYard) {
			pig.feed();
		}

	}
}