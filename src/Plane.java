import java.util.ArrayList;


import javax.swing.JOptionPane;


public class Plane {
int passengers;

private static int totalVenom=0;
Plane(int passengers){
	this.passengers = passengers;
}
public static void main(String[] args) {
	String passengers = JOptionPane.showInputDialog("How many passengers on the plane?");
	int numPassengers = Integer.parseInt(passengers);
	System.out.println("Number of passengers is "+numPassengers);
	Plane plane = new Plane(numPassengers);
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	for (int i = 0; i < 100; i++) {
		snakes.add(new Snake(new Randomness().getNumber(),new Randomness().getTrueOrFalse()));
	}
	for(Snake s : snakes){
		if (s.isVenomous()){
			totalVenom += s.getViciousness();
		}
	}
	System.out.println("total Venom is " + totalVenom);
	double answer =  (double) (10*totalVenom)/plane.passengers;
	if(answer>100){
		answer = 100;
	}
	System.out.println("Your chance of death is "+ answer +"%");
}


}
