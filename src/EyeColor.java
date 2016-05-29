import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EyeColor {

	ArrayList<Student1> students = new ArrayList<Student1>();

	public static void main(String[] args) {
		new EyeColor().go();
	}

	private void go() {

		boolean cont = true;
		while (cont) {
			int answer = JOptionPane.showOptionDialog(null,
					"Please select your eye color", "Student Eye Color", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] {
							"Blue", "Green", "Brown", "Grey", "Hazel", "Other",
							" No more students" }, null);
			if (answer == 6) {
				cont = false;
			} else {
				students.add(new Student1(answer));
			}

		}

		ArrayList<Integer> counter = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			counter.add(0);
		}
		for (Student1 s : students) {
			switch (s.eyeColor) {
			case 0:
				counter.set(0, counter.get(0) + 1);
				break;
			case 1:
				counter.set(1, counter.get(1) + 1);
				break;
			case 2:
				counter.set(2, counter.get(2) + 1);
				break;
			case 3:
				counter.set(3, counter.get(3) + 1);
				break;
			case 4:
				counter.set(4, counter.get(4) + 1);
				break;
			case 5:
				counter.set(5, counter.get(5) + 1);
				break;
			default:
				break;
			}
		}
		int indexNum = 0;
		int colorCount = 0;
		int count = 0;
		for (Integer k : counter) {
			if (k > colorCount) {
				indexNum = count;
				colorCount = k;
			}
			count++;
		}
		System.out.print("the most popular eye color is ");
		switch (indexNum) {
		case 0:
			System.out.print("blue");
			break;
		case 1:
			System.out.print("green");
			break;
		case 2:
			System.out.print("brown");
			break;
		case 3:
			System.out.print("grey");
			break;
		case 4:
			System.out.print("hazel");
			break;
		case 5:
			System.out.print("other");
			break;
		default:
			break;
		}

	}
}

class Student1 {
	int eyeColor;

	public Student1(int eyeColor) {
		this.eyeColor = eyeColor;
	}

}