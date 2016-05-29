import java.util.ArrayList;
import java.util.Random;


public class BluntPencils {
	static int countPencils = 0;
	ArrayList<Pencil> pencils = new ArrayList<Pencil>();
public static void main(String[] args) {
	new BluntPencils().go();
}

private void go() {
	for (int i = 0; i < (15); i++) {
		int n = new Random().nextInt(2);
		if (n==0){
			pencils.add(new Pencil(true));
			
		}
		else{
			pencils.add(new Pencil(false));
		}
	}
	
	for(Pencil p: pencils){
		if (p.isBlunt)
			countPencils++;
	}
	
	System.out.println("The number of pencils to sharpen is "+ countPencils);
}
}

class Pencil{
	boolean isBlunt;

	public Pencil(boolean isBlunt) {
		this.isBlunt = isBlunt;
	}
}
