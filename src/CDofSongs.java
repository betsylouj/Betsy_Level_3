import java.util.ArrayList;


public class CDofSongs {

	static double duration = 0;
	
	public static void main(String[] args) {
		ArrayList<Song> CD = new ArrayList<Song>();
		CD.add(new Song(4.7));
		CD.add(new Song(3.7));
		CD.add(new Song(9.7));
		for(Song song: CD){
			duration += song.duration;
		}
		System.out.println("Total playing time is "+ duration);
	} 
	
}

class Song{
	double duration;
	
	Song(double duration){
		this.duration = duration;
	}
}
