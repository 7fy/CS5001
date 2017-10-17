import java.util.ArrayList;
import java.util.Random;

public class Game {

   ArrayList <Enemy> enemies = new ArrayList <Enemy> ();
   ArrayList <Tower> towers = new ArrayList <Tower> ();
   public int Coins = 100;
  
   
   }
   private void advance(){
       System.out.println("Minion has spawn");
      
       for ( int step = 1; step >30; step++ ){
           Random rand = new Random();
           int Num_Rat = rand.nextInt();
           Num_Rat = rand.nextInt(5);
           int Num_Elephant = rand.nextInt();
           Num_Elephant = rand.nextInt(2);
           if (){
           System.out.println("Defeat!");
           break;}
       }
         System.out.println("Victory!");
     }
   public Game(int corridorLength){
   }
   public static void main(String[] args){
       int corridorLength = new Integer(args[0]);
       
   }
   }

 