package Assignment4;


public class ManagementCompany {

	private final int MAX_PROPERTY = 5;
	private final int MAX_WIDTH = 10;
	private final int MAX_DEPTH = 10;
	private int currentPropertyIndex = -1;
	private Property[] properties;
	private double mgmFeePer;
	private String name;
	private String taxID;
	private Plot plot;
	private Plot SamplePlot;
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.plot = new Plot(0, 0, 1, 1);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(0, 0, MAX_WIDTH, MAX_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany newCompany) {
		this.name = newCompany.name;
		this.taxID = newCompany.taxID;
		this.mgmFeePer = newCompany.mgmFeePer;
		this.plot = newCompany.plot;
		this.properties = newCompany.properties;
	}
	/*
	 * set name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * set TexID
	 */

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	/*
	 * set managmentFee
	 */
	public void setMgmFee(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
	}
	/*
	 * set plot
	 */
	public void setPlot(Plot plot) {
		this.plot = new Plot(plot);
	}
	/*
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/*
	 * @return TaxID
	 */
	public String getTaxID() {
		return taxID;
	}
	/*
	 * @return management fee
	 */
	public double getMgmFee() {
		return mgmFeePer;
	}
	/*
	 * @return plot
	 */
	public Plot getPlot() {
		return new Plot(plot);
	}
	/*
	 * @return max property
	 */
	public int getMAX_PROPERTY() {
		return this.MAX_PROPERTY;
	}
	/*
	 * @return total rent
	 */
	public double totalRent() {
		double total = 0;
		for (int i = 0; i < this.properties.length; i++) {
			if (this.properties[i] == null) { continue; }
			Property p = this.properties[i];
			total += p.getrentAmount();
		}
		return (this.properties.length > 0 ? total : 0.00);
	}

	/*
	 * Returns the highest rent property
	 */
	  private int maxRentPropIndex() {
		    int index = -1;
		    double max = 0;
		    for (int i = 0;i<properties.length;i++) {
		      if (properties[i]==null) {
		        break;
		      }
		      if (properties[i].getrentAmount() > max) {
		        max = properties[i].getrentAmount();
		        index = i;
		      }
		    }
		    return index;
		  }	  
	  public double maxRentProp()
	  {
		  return properties[maxRentPropIndex()].getrentAmount();
	  }
		/*
		 * Add property (Property)
		 */
	public int addProperty(Property P) {
		// Variables
		int newIndex = currentPropertyIndex + 1;

		// Checks
		if (newIndex >= this.MAX_PROPERTY) { return -1; }

		// Variables
		this.properties[newIndex] = new Property(P);

		// Default
		currentPropertyIndex = newIndex;
		return newIndex;
	}

	/*
	 * Add property (Name, City, Rent, Owner)
	 */
	public int addProperty(String n, String c, double r, String o) {
		int newIndex = currentPropertyIndex + 1;
		if (newIndex >= this.MAX_PROPERTY) { return -1; }
		this.properties[newIndex] = new Property(n, c, r, o);
		currentPropertyIndex = newIndex;
		return newIndex;
	}

	/*
	 * Add property (Name, City, Rent, Owner, X, Y, Width, Depth)
	 */
	public int addProperty(String n, String c, double r, String o, int x, int y, int w, int d) {
		// Variables
		int index = currentPropertyIndex;
		int newIndex = currentPropertyIndex + 1;
		Plot tempPlot = new Plot(x, y, w, d);

		// Checks
		if (newIndex >= this.MAX_PROPERTY) { return -1; }
		if (this.SamplePlot.encompasses(tempPlot) == false) { return -3; }
		if (index >= 0) {
			for (int i = 0; i < this.properties.length; i++) {
				// Checks
				if (this.properties[i] == null) { continue; }
				if (this.properties[i].getplot().overlaps(tempPlot) == true) { return -4; }
			}
		}
		this.properties[newIndex] = new Property(n, c, r, o, x, y, w, d);
		currentPropertyIndex = newIndex;
		return newIndex;
	}

	/**
	 * print results
	 * 
	 */
	@Override
	public String toString() {
		Property house = new Property();

		String str = "";
		for (int i = 0; i < properties.length; i++) {
			properties[i] = house;
			str = properties[i].toString();
		}
		return str;
	}

}
