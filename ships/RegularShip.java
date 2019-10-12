package tp.p1.ships;

public class RegularShip {
	
	private int life = 2;
	private int damage = 0;
	private int points = 5;
	private int x;
	private int y;
	
	//constructor --------------------------------------------------------------------------------------------------
	public RegularShip(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	//Getters y setters---------------------------------------------------------------------------------------------
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public int getDamage() {
		return damage;
	}

	public int getPoints() {
		return points;
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
