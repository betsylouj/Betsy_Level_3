import java.util.ArrayList;

public class Egg1 {
static int num;
	
	void crack(){
		System.out.println("Cracking Egg!");
	}
	
	public static void main(String[] args) {
		ArrayList<Egg1> eggcarton = new ArrayList<Egg1>();
		
		for (int i = 0; i < 12; i++) {
			eggcarton.add(new Egg1());
		}
		for (Egg1 e: eggcarton){
			e.crack();
			num++;
			System.out.println(num);
		}
	}
}
