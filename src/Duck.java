import java.util.ArrayList;


public class Duck {

	String name;
	
	Duck(String name){
		this.name = name;
	}
	
	void feed(){
		System.out.println("Feeding "+name);
	}
	
	public static void main(String[] args) {
		ArrayList<Duck> ducks = new ArrayList<Duck>();
		
		ducks.add(new Duck("Daffy"));
		ducks.add(new Duck("Waddles"));
		ducks.add(new Duck("Waffy"));
		ducks.add(new Duck("Daddles"));
		
		ducks.get(0).feed();
		
		for(Duck d: ducks){
			d.feed();
		}
	}
}
