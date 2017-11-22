/**
 * 
 * Fig. 10.12: Invoice.java <br>
 * Invoice class implements Payable.
 * @author Deitel & Associates, Inc.
 *
 */
public class Invoice implements Payable {
	private String partNumber; 
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	/**
	 * four-argument constructor
	 * @param part the part number
	 * @param description the part description
	 * @param count how many
	 * @param price cost per item
	 */
	public Invoice(String part, String description, int count, 
			double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	} // end four-argument Invoice constructor

	/**
	 * set part number
	 * @param part the part number
	 */
	public void setPartNumber(String part) {
		partNumber = part; // should validate
	} // end method setPartNumber

	/**
	 * get part number
	 * @return the part number
	 */
	public String getPartNumber() {
		return partNumber;
	} // end method getPartNumber

	/**
	 * set description
	 * @param description the part description
	 */
	public void setPartDescription(String description) {
		partDescription = description; // should validate
	} // end method setPartDescription

	/**
	 * get description
	 * @return the part description
	 */
	public String getPartDescription() {
		return partDescription;
	} // end method getPartDescription

	/**
	 * set quantity
	 * @param count how many
	 */
	public void setQuantity(int count) {
		if ( count >= 0 )
			quantity = count;
		else
			throw new IllegalArgumentException("Quantity must be >= 0");
	} // end method setQuantity

	/**
	 * get quantity
	 * @return how many
	 */
	public int getQuantity() {
		return quantity;
	} // end method getQuantity

	/**
	 * set price per item
	 * @param price price per item
	 */
	public void setPricePerItem(double price) {
		if ( price >= 0.0 )
			pricePerItem = price;
		else
			throw new IllegalArgumentException(
					"Price per item must be >= 0");
	} // end method setPricePerItem

	/**
	 * get price per item
	 * @return price per item
	 */
	public double getPricePerItem() {
		return pricePerItem;
	} // end method getPricePerItem

	/**
	 * return String representation of Invoice object
	 * @return String representation of Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} // end method toString

	/**
	 * method required to carry out contract with interface Payable
	 * @return the cost of this invoice
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	} // end method getPaymentAmount
} // end class Invoice
