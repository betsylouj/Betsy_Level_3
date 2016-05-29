import java.util.ArrayList;


public class ArrayOverflow {
public static void main(String[] args) {
	ArrayList array = new ArrayList();
	for (int i = 0; i < 3919664; i++) {
		array.add("Element "+i);
		System.out.println(i);
		
	}
	for(Object s : array){
		System.out.println(s);
	}
}
}
