import java.util.ArrayList;

public class Ornament {

	String color;

	Ornament(String color) {
		this.color = color;
	}

	void hang() {
		System.out.println("hanging a " + color + " ornament");
	}

	public static void main(String[] args) {
		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>(); // in Decorator class

		boxOfDecorations.add(new Ornament("blue"));
		boxOfDecorations.add(new Ornament("green"));
		boxOfDecorations.add(new Ornament("red"));
		boxOfDecorations.add(new Ornament("red"));
		boxOfDecorations.add(new Ornament("yellow"));
		boxOfDecorations.add(new Ornament("blue"));
		boxOfDecorations.add(new Ornament("silver"));

		for (Ornament o : boxOfDecorations) {
			o.hang();
		}

	}
}