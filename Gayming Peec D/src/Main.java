public interface Main {
	public static void main(String[] args){
		Game game = new Game ("Far Cry", 6.0) ;
		
		GraphicsCard gc1 = new GraphicsCard ("AMD ", 3.0) ;
		GraphicsCard gc2 = new GraphicsCard (" Nvidia ", 6.0) ;
		
		Computer comp = new Computer (gc1);
		
		comp.run (game);
		gc1.overclock ();
		comp.run (game);
		gc1.overclock ();
		comp.run (game);
		gc1.overclock ();
		comp.run (game);
		
		comp.replaceGC (gc2);
		
		comp.run (game);
	}
}
