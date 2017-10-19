package towerdefence;

public class Tower {
	protected int damage;
	protected int position;
	protected int type;
	protected int cost;
	protected int reloadTime;

	public int getDamage() {
		return damage;
	}

	public int getPosition() {
		return position;
	}

	public boolean willFire(int timeStep) {
		return true;
	}
	public Tower(int damage, int type, int cost, int reloadTime) {
		this.damage =damage;
		this.type = type;
		this.cost = cost;
		this.reloadTime = reloadTime;
	}

}