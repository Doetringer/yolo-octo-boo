
public class Computer {
	public Computer () {}
	
	public GraphicsCard gc;
	public boolean on;
	
	public Computer (GraphicsCard gc) {
		this.gc = gc;
		this.on = true;
		gc.insertedInto(this);
		System.out.println("New computer created with " +gc.name+ " Graphics card!");
	}
	
	public void replaceGC(GraphicsCard gc) {
		GraphicsCard gc2 = gc;
		System.out.println("Replacing " +this.gc.name+ " graphics card with " +gc2.name+ " graphics card!");
		this.gc = gc;
		this.on = true;
	}
	
	public void run (Game game) {
		if (on) {
			int fps = (int) (60 * gc.strength/game.demand);
			System.out.println("Running " +game.name+ " at " +fps+ " frames per second.");
		} else {
			System.out.println("Can not run " +game.name+ ", computer shut down.");
		}
		
	}

	public void shutdown() {
		this.on = false;
		System.out.println ("- card overheated, computer is shutting down!");
	}
}
