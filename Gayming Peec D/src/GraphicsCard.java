
public class GraphicsCard {
	public String name;
	public double strength;
	public double orStrength;
	public Computer comp;
	
	public GraphicsCard(String name, double strength) {
		this.name = name;
		this.strength = strength;
		this.orStrength = strength;
	}
	
	public void insertedInto(Computer comp) {
		this.comp = comp;
	}
	
	public void overclock() {
		this.strength = this.strength + 1.0;
		System.out.println ("Overclocking graphics card!");
		if (this.strength >= 2*this.orStrength) {
			comp.shutdown();
		}
	}
}
