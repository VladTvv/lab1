
public class Tea extends Food
{
	private String color = null;
	public Tea()
	{
		super("Tea");
	}
	public Tea(String color)
	{
		super("Tea");
		this.color = color;
	}
	
	public String getColor()  //Getter
	{
		return color;
	}
	public void setColor(String color)  //Setter
	{
		this.color = color;
	}
	
	@Override
	public void consume()
	{
		System.out.println(this + " eaten");
	}
	
	public String toString() {
		return super.toString();
		}
}
