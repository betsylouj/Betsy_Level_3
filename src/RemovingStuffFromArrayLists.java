import java.util.ArrayList;
import java.util.Iterator;

// Copyright Wintriss Technical Schools 2013

public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
		}
		class Worm extends Stuff {
		}
		class Dirt extends Stuff {
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());

		/* TODO 1: Clean out the dirt but keep the delicious worms. */

		Iterator e = stuffIFoundInTheYard.iterator();
		while (e.hasNext()) {
			Stuff stuff = (Stuff) e.next();
			if (stuff.getClass() != new Worm().getClass()) {
				e.remove();
			}
		}

		System.out.println(stuffIFoundInTheYard);

		System.out.println("final size is " + stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');

		/* TODO 2: Remove the hash symbols and print out the truth. */
		Iterator ef = truth.iterator();
		while (ef.hasNext()) {
			Character ch = (Character) ef.next();
			if (ch == '#') {
				ef.remove();
			}
		}
		
		for (Character c:truth){
			System.out.print(c.charValue());
		}
	}
}
