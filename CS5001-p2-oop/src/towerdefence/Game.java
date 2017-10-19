package towerdefence;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import towerdefence.Enemy;
import towerdefence.Tower;

public class Game {

	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	ArrayList<Tower> towers = new ArrayList<Tower>();
	private static int round = 1;
	private int enemiesNum = 0;
	private int towerNum = 0;
	public int Coins = 100;

	public static void main(String[] args) {
		try {
			int corridorLength = new Integer(args[0]);
			if (corridorLength < 1 || corridorLength > 20) {
				System.out.println("the corridor should be >1 and <20");
			} else {
				Game game = new Game();
				game.advance();
			}
		} catch (Exception e) {
			System.out.println("Usage: java Game <corridorLength>");
		}
	}

	public void advance(){
	   int step =1;
	   System.out.println("do you want to build a new tower? Y/N");
	   Scanner buildTower = new Scanner(System.in);
	   String inputOne = buildTower.toString();
	   while(inputOne !="Y"||inputOne!="N") {
		   System.out.println("you should input Y or N");
		   buildTower = new Scanner(System.in);
		   inputOne = buildTower.toString();
	   }
	   if(inputOne == "Y") {
		   System.out.println("please select the type of the tower. 1-Catapult 2-Slingshot 3-Cannon");
		   Scanner typeTower = new Scanner(System.in);
		   double inputTwo = typeTower.nextDouble();
		   while(inputTwo !=1||inputTwo !=2||inputTwo!=3) {
			   System.out.println("you should input 1 or 2 or 3");
			   typeTower = new Scanner(System.in);
			   inputTwo = typeTower.nextDouble();
			   if(inputTwo == 1) {
				   
			   }else if(inputTwo == 2) {
				   
			   }else if(inputTwo == 3) {
	   
			   }
		   }
	   }else if (inputOne == "N") {
	   
   }

// System.out.println("Minion has spawn"); `");
// boolean reachTerminal;
//
// Random rand = new Random();
// int Num_Rat = rand.nextInt();
// Num_Rat = rand.nextInt(5);
// int Num_Elephant = rand.nextInt();
// Num_Elephant = rand.nextInt(2);
// if (reachTerminal = true){
// System.out.println("Defeat!");
// break;}
//
// System.out.println("Victory!");
// }
// public Game(int corridorLength){
// }
//
// }
//
//