public class Main
{
	public static void main(String[] args) {
	    Ship[] ships = new Ship[5];
	    ships[0] = new Ship(11);
	    ships[1] = new Ship(13,14);
	    ships[2] = new Ship(31,32,33);
	    ships[3] = new Ship(51,61,71,81);
	    ships[4] = new Ship(55,65,75,85);
	    Shooter shooter = new Shooter(ships);
	    shooter.MakeShoot(11);
	    shooter.MakeShoot(12);
	    shooter.MakeShoot(19);
	    shooter.MakeShoot(13);
	    shooter.MakeShoot(14);
	}
}
