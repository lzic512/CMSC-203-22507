package Assignment4;


public class Plot {
	private int x, y, depth, width;
	/**
	 * 
	 * set x
	 */
	public void setx(int x)
	{
		this.x = x;
	}
	public void sety(int y)
	/**
	 * 
	 * set y
	 */
	{
		this.y = y;
	}
	public void setDepth(int depth)	
	/**
	 * 
	 * set depth
	 */
	{
		this.depth = depth;
	}
	public void setWidth(int width)
	/**
	 * 
	 * set width
	 */
	{
		this.width = width;
	}
	public int getx()
	/**
	 * 
	 * @return x
	 */
	{
		return x;
	}
	public int gety()
	/**
	 * 
	 * @return y
	 */
	{
		return y;
	}
	public int getWidth()
	/**
	 * 
	 * @return width
	 */
	{
		return width;
	}
	public int getDepth()
	/**
	 * 
	 * @return Depth
	 */
	{
		return depth;
	}
	public Plot() 
	{
		this.x = 0;
		this.y = 0;
		this.width = 10;
		this.depth = 10;
	}
	public Plot(Plot first)
	{
		this.x = first.x;
		this.y = first.y;
		this.depth = first.depth;
		this.width = first.width;
	}
	public Plot (int x , int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	   public boolean overlaps(Plot p) {
	       return getx() < p.getx() + p.getWidth() && x + getWidth() > p.getx() && gety() < p.gety() + p.getDepth() && gety() + getDepth() > p.gety();
	   }
	public boolean encompasses(Plot p)
    {
        if(((p.getx()>= getx() && p.getx() <= (x+width)) && (p.gety() >= gety() && p.gety() <= (gety()+getDepth()))) &&
          (((p.getx() + p.getWidth())>= getx() && (p.getx()+p.getWidth()) <= (getx()+getWidth())) && (p.gety() >= y && 
          p.gety() <= ( gety()+getDepth()))) )
               return true;

        return false;

  }
	public String toString() {
		String resultant = "Upper left: (" + getx() + "," + gety() + "); Width: " + getWidth() + " Depth: " + getDepth();

		return resultant;
	}
}
