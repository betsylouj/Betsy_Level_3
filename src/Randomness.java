import java.util.Random;

public class Randomness {

	
	int getNumber(){
		return new Random().nextInt(10)+1;
	}
	
	boolean getTrueOrFalse(){

		int random = new Random().nextInt(2);
		if (random == 0){
			return true;
		}

		else
			return false;
	}
	
	static int number () {
		return new Random().nextInt(10) +1;
	}


}
