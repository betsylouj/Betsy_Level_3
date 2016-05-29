import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RosettaStone {
	HashMap<String,String> translator;
	JFrame jframe;
	JButton jbutton1;
	JButton jbutton2;
	JPanel jpanel;
	public static void main(String[] args) {
		new RosettaStone().go();
	}

	private void go() {
		createDictionary();
		createUI();
		
	}

	private void createUI() {
		jframe = new JFrame();
		jpanel = new JPanel();
		jbutton1 = new JButton();
		jbutton2 = new JButton();
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		jframe.add(jpanel);
		jframe.setVisible(true);
		jframe.pack();
		
	}

	private void createDictionary() {
		translator = new HashMap();
		
		translator.put("Ola", "Hello");
		translator.put("Uno", "One");
		translator.put("Bien", "Good");
	}
	String getRandomKey(HashMap<String, String> map) {
        String[] keysAsArray = map.keySet().toArray(new String[0]);
        int randomness = new Random().nextInt(map.size());
        return keysAsArray[randomness];
    }
}
