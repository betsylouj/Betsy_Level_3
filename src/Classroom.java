import java.util.ArrayList;





public class Classroom {
	ArrayList<Student5> nerd;
	
	Classroom(ArrayList<Student5> nerd){
		this.nerd = nerd;
	}
	
	void addStudent5(Student5 s){
		nerd.add(s);
	}
	
	ArrayList<Student5> getArrayList(){
		return nerd;
	}
	
		public static void main(String[] args) {
			
			go();
		}

		private static void go() {
			Classroom turtle = new Classroom(new ArrayList<Student5>());
			int totalIQ=0;
			int count=0;
			
			turtle.addStudent5(new Student5(120,"Betsy"));
			turtle.addStudent5(new Student5(130,"Betsy"));
			turtle.addStudent5(new Student5(140,"Betsy"));
			turtle.addStudent5(new Student5(160,"Betsy"));
			turtle.addStudent5(new Student5(100,"Betsy"));
			turtle.addStudent5(new Student5(120,"Betsy"));
			
			for (Student5 s : turtle.getArrayList()){
				totalIQ+=s.subjectiveIntelligenceLevel;
				count++;
			}
			
			System.out.println("Average IQ is "+ (totalIQ/count));
		}
	

}