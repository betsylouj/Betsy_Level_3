import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
String winner="";
double longest=0;
    /**
     * The Beatles are eating lunch and playing a game to see who has the longest chip. (In England, french fries are called "chips".)
     * 
     * Find the Beatle with the longest chip. You may not edit the Chip or Beatle classes. Make sure to initialize The Beatles before you start your
     * search.
     * 
     * **/
	
	public static void main(String[] args) {
		new LongChipCompetition().go();
	}

    private void go() {
		initializeBeatles();
		for (Beatle beatle:theBeatles){
			System.out.println(beatle.getName()+ " has " + beatle.getChips().size()+ " chips");
			for (Chip chip:beatle.getChips()){
				System.out.println(beatle.getName() + " has a chip of length "+ chip.getLength());
				if (chip.getLength()> longest){
					longest = chip.getLength();
					winner = beatle.getName();
				}
			}
		}
		System.out.println("the winner is " + winner + ", with a chip of length "+ longest);
		
	}

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

    private void initializeBeatles() {
        Beatle george = new Beatle("George");
        Beatle john = new Beatle("John");
        Beatle paul = new Beatle("Paul");
        Beatle ringo = new Beatle("Ringo");

        theBeatles.add(george);
        theBeatles.add(john);
        theBeatles.add(paul);
        theBeatles.add(ringo);
    }
}

class Beatle {
    private String name;
    private ArrayList<Chip> chips = new ArrayList<Chip>();

    public Beatle(String name) {
        this.name = name;
        initializePlateOfChips();
    }

    private void initializePlateOfChips() {
        int numberOfChips = new Random().nextInt(100);
        for (int i = 0; i < numberOfChips; i++) {
            chips.add(new Chip(new Random().nextDouble() * 10));
            if (this.name.contains("in")) chips.add(new Chip(10));
        }
    }

    public ArrayList<Chip> getChips() {
        return this.chips;
    }

    public String getName() {
        return this.name;
    }

}

class Chip {
    private double length;

    public double getLength() {
        return length;
    }

    Chip(double d) {
        this.length = d;
    }
}

