import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {

		HashMap<String, String> bffs = new HashMap<String, String>();
		bffs.put("June", "Spock");
		bffs.remove("June");
		bffs.put("June", "Captain Kirk");
		bffs.put( "Captain Kirk", "Mrs Kirk");
		bffs.put("Uhuru","ANO");
		System.out.println(bffs.get("Uhuru"));
		
		bffs.put("Sulu", "Scotty");
		System.out.println("Sulu's bff is "+bffs.get("Sulu"));
		bffs.put("Sulu", "Uhura");
		System.out.println("Sulu's bff is "+bffs.get("Sulu"));
		
		if(bffs.get("Captain Kirk")!= null){
			System.out.println("Friends");
		}
		else{
			System.out.println("No Friends");
		}

	}
}
