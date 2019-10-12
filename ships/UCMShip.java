package tp.p1.ships;

public class UCMShip {
	
	private int life = 2;
	private int damage = 1;
	private int x;
	private int y;
	
	//constructor
	public UCMShip(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	public String toString(UCMSHIP ucm) {
		return toString("^_^")
	}
	//getters y setters ------------------------------------------------------------------------------------------
	public int getLife() {
		return life;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getDamage() {
		return damage;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
}
