
public class CookieOrder {
	String variety;
	int numberOfBoxes;

	public CookieOrder(String variety,int numberOfBoxes) {
		this.variety=variety;
		this.numberOfBoxes = numberOfBoxes;
	}

	public int getNumberOfBoxes() {
		return numberOfBoxes;
	}

	public void setNumberOfBoxes(int numberOfBoxes) {
		this.numberOfBoxes = numberOfBoxes;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

}
