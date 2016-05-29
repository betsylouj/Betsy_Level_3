import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class DinnerDecider {

	int counter = 0;

	public static void main(String[] args) {
		new DinnerDecider().go();
	}

	private void go() {
		ArrayList array = new ArrayList();
		array.add("fish and chips");
		array.add("roast beef");
		array.add("pasta");
		array.add("chicken curry");
		while (true) {

			int random = new Random().nextInt(4);
			System.out.println(random);
			JOptionPane.showMessageDialog(null, "Choose your meal");
			JOptionPane.showMessageDialog(null,
					"You should have " + array.get(random) + " for dinner");
		}
	}

}
