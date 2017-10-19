package towerdefence;
public class Enemy {
	protected int health;
	protected int position = 1;
	protected int speed; 
	protected int type;
	protected int money;
public Enemy(int health, int type, int speed, int money) {
	this.health =health;
	this.type = type;
	this.speed = speed;
	this.money = money;
}


public void hit(Tower t){
    this.health = this.health - damage;
}
public int getHealth(){
    return this.health;
}
public int getPosition(){
    return position;
}
public void advance() {
	this.position = position + speed;
}
@Override
public String toString() {
    return ("Type: " + this.type + " HP: " + health + " Postion: " + position + " ** ");
}
}