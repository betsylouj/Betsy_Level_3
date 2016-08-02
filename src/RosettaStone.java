import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener {
	HashMap<String,String> translator;
	JFrame frame;
	JButton button1;
	JButton button2;
	JPanel panel;
	public static void main(String[] args) {
		new RosettaStone().go();
	}

	private void go() {
		createDictionary();
		createUI();	
	}

	private void createUI() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button1.setText(getRandomKey(translator));
		button2.setText("");
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}

	private void createDictionary() {
		translator = new HashMap();
		
		translator.put("Ola", "Hello");
		translator.put("Uno", "One");
		translator.put("Bien", "Good");
		translator.put("Contento", "Happy");
		translator.put("teléfono", "phone");
		translator.put("caimán", "alligator");
		translator.put("computadora", "computer");
		translator.put("helado", "icecream");
		translator.put("coche", "car");
		translator.put("flor", "flower");
	}
	String getRandomKey(HashMap<String, String> map) {
        String[] keysAsArray = map.keySet().toArray(new String[0]);
        int randomness = new Random().nextInt(map.size());
        return keysAsArray[randomness];
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(button2.getText()==""){
			button2.setText(translator.get(button1.getText()));
			frame.pack();
		}
		else{
			button2.setText("");
			button1.setText(getRandomKey(translator));
			frame.pack();			
		}
	}
}
