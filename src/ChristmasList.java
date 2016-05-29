import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChristmasList implements MouseListener {

	ArrayList<JLabel> list = new ArrayList<JLabel>();
	JFrame frame = new JFrame();
	JLabel label;

	public static void main(String[] args) {
		new ChristmasList().go();
	}

	private void go() {
		list.add(loadImageFromTheInternet("http://cdn.innovativelanguage.com/wordlists/media/thumb/8289_fit512.jpg"));
		list.add(loadImageFromTheInternet("http://machopicture.com/images/victorian-christmas/9949-blue-christmas-present-007.jpg"));
		list.add(loadImageFromTheInternet("http://thumbs.dreamstime.com/x/purple-present-5642520.jpg"));
		list.add(loadImageFromTheInternet("http://images.clipartpanda.com/present-clipart-cliparti1_present-clip-art_02.jpg"));
		frame.addMouseListener(this);
		getImage();

	}

	private void getImage() {
		int random = new Random().nextInt(list.size());
		System.out.println(random);

		frame.setSize(list.get(random).getWidth(), list.get(random).getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = list.get(random);
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		frame.remove(label);
		getImage();

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
