import java.util.ArrayList;


public class LearningArrayLists {
	
	
	
	
	static ArrayList createArrayList(){
		return new ArrayList();
	}

	static void addToArrayList(ArrayList array, String string){
		array.add(string);
	}
	static int getNumberOfItems(ArrayList array){
		return array.size();
	}
	
	static String getItem(ArrayList array, int index){
		return (String) array.get(index);
	}
	static String iterateOver(ArrayList<String> array){
		String answer = "";
		for(String s: array){
			answer = answer + s;
		}
		return answer;
	}
	
	static int findItemOnList(ArrayList<String> array, String string){
		for (String s:array){
			if (string.equals(s)){
				return array.indexOf(s);
			}
		}
		return -1;
	}
	static ArrayList<String> replaceItem(ArrayList array, int i, String string){
		array.set(i, string);
		return array;
	}
	
	static ArrayList<String> insertItem(ArrayList<String> array, int i, String string){
		array.add(i, string);
		System.out.println(iterateOver(array));
		return array;
	}
	
	static ArrayList createTypedArrayList(){
		return new ArrayList<Integer>();  //Expect this should be something else??
	}
	
	static Integer addAllInteger(ArrayList array){
		int answer = 0;
		for (Object o: array){
			answer = answer + (int) o;
		}
		return answer;
	}
	static ArrayList createStringTypedArrayList(){
		return new ArrayList<String>();
	}
	
	static String addAllString(ArrayList array){
		String answer = "";
		for (Object o: array){
			answer = answer + (String) o;
		}
		return answer;
	}
}
