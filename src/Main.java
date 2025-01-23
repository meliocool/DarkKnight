import java.util.Random;
import java.util.Scanner;

public class Main {
	private static Random random = new Random();
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Player player = new Player(100, 20);
		Menu menu = new Menu();
		menu.menu();
		Entity enemy = getEnemy();
		gamePlay(player, enemy);
	}
	
	public static Entity getEnemy() {
//		Entity[] enemies = {
//				new Goblin(80, 20),
//				new Thief(60, 15)
//		};
//		int idx = random.nextInt(enemies.length);
//		return enemies[idx];
		Entity enemyToBeFought;
		if(random.nextBoolean()) {
			enemyToBeFought = new Goblin(80, 20);
		} else {
			enemyToBeFought = new Thief(60, 15);
		}
		return enemyToBeFought;
	}
	
	public static void gamePlay(Player player, Entity enemy){
		Entity WhoWeFightin = enemy;
		while(player.getHP() > 0) {
			System.out.println("Battle Commences!");
			while(player.getHP() > 0 && enemy.getHP() > 0) {
				System.out.println("Your HP: " + player.getHP());
				System.out.println("Your Damage: " + player.getBaseDamage());
				System.out.println("----");
				System.out.println("Enemy is: " + WhoWeFightin.toString());
				System.out.println("Enemy HP: " + WhoWeFightin.getHP());
				
				player.attack(WhoWeFightin);
				if(enemy.getHP() <= 0) break;
				enemy.attack(player);
				if(player.getHP() <= 0) break;
				
				System.out.print("Press enter to continue...");
				scan.nextLine();
				System.out.println("---");
			}
			if (player.getHP() <= 0) {
				System.out.println("---");
				System.out.println("Game over! You lost.");
				return;
			} else {
				System.out.println("---");
				System.out.println("You defeated the " + WhoWeFightin.toString() + "!");
				player.setHP(100); 
				player.chanceToGetItem(); 
				
				System.out.print("Press Enter to continue...");
				scan.nextLine();
				System.out.println("---");
			}
		}
	}
}
