package Assignment4;


public class Property {

	private String propertyName; // name of property
	private String city; // name of the city
	private double rentAmount; // holds the plot object
	private String owner; // name of house owner
	private Plot plot;

	public Property() {
		propertyName = "";
		city = "";
		rentAmount = 0;
		owner = "";
		this.plot = new Plot(0, 0, 1, 1);
	}

	/**
	 * 
	 * set propertyName
	 * set city
	 * set rentAmount
	 * set owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}

	/**
	 * 
	 * set propertyName
	 * set city
	 * set rentAmount
	 * set owner
	 * set plot
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	/**
	 * 
	 * set p
	 */
	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}

	/**
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @return owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * 
	 * @return propertyName
	 */
	public String getpropertyName() {
		return propertyName;
	}

	/**
	 * 
	 * @return rent amount
	 */
	public double getrentAmount() {
		return rentAmount;
	}

	public void setplot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}

	/**
	 * 
	 * set city
	 */
	public void setcity(String city) {
		this.city = city;
	}

	/**
	 * set owner
	 */
	public void setowner(String owner) {
		this.owner = owner;
	}

	/**
	 * set propertyName
	 */
	public void setpropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * 
	 * set rentAmount
	 */
	public void setrentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	/**
	 * @return a plot copy
	 */
	public Plot getplot() {
		return plot;
	}

	/**
	 * print name, city, owner, rent, amount
	 */
	public String toString() {
		String str = "Property Name: " + propertyName + "\n" + "Located in: " + city + "\n" + "Belonging to: " + owner
				+ "\n" + "Rent Amount: " + rentAmount + " ";
		return str;
	}

}