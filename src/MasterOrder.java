import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MasterOrder {
	/** The list of all cookie orders */
	private ArrayList<CookieOrder> orders;

	/** Constructs a new MasterOrder object. */
	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}

	/**
	 * Adds theOrder to the master order.
	 * 
	 * @param theOrder
	 *            the cookie order to add to the master order
	 */
	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}
	
	public ArrayList<CookieOrder> getOrders(){
		
		return orders;
	}

	/** @return the sum of the number of boxes of all of the cookie orders */
	public int getTotalBoxes() {
		int total = 0;
		for (CookieOrder cookieO : orders) {
			total += cookieO.getNumberOfBoxes();
		}
		return total;
	}

	/**
	 * Removes all cookie orders from the master order that have the same variety of cookie as cookieVar and returns the total number of boxes that were removed.
	 * 
	 * @param cookieVar
	 *            the variety of cookies to remove from the master order
	 * @return the total number of boxes of cookieVar in the cookie orders removed
	 */
	public int removeVariety(String cookieVar) {
		int numberRemoved = 0;

		Iterator e = orders.iterator();
		while (e.hasNext()) {
			CookieOrder cookieOrder = (CookieOrder) e.next();
			if (cookieOrder.getVariety().equals(cookieVar)) {
				numberRemoved += cookieOrder.getNumberOfBoxes();
				e.remove();
			}
		}
		return numberRemoved;
	}
}
//
