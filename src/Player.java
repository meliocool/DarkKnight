import java.util.ArrayList;
import java.util.Random;

public class Player extends Entity {
	private ArrayList<Item> inventory = new ArrayList<>();
	private Random random = new Random();
	
	public Player(int HP, int attackPower) {
		super(HP, attackPower);
	}
	
	@Override
    public void attack(Entity target) {
        int damage = random.nextInt(getBaseDamage() + 1); 
        System.out.println("You hit the " + target.toString() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }
	
	@Override
    public void takeDamage(int damage) {
		int damageTaken = damage;
        setHP(getHP() - damageTaken);
        if (getHP() < 0) {
        	setHP(0);
        }
    }
	
	public void chanceToGetItem() {
		if(inventory.isEmpty() && random.nextDouble() >= 0.25) {
			Item itemObtained;
			if(random.nextBoolean()) {
				itemObtained = new Excalibur();
			} else {
				itemObtained = new RingOfHealth();
			}
			addItem(itemObtained);
		}
	}
	
	public void addItem(Item item) {
		if(inventory.isEmpty()) {
			inventory.add(item);
			item.ApplyEff(this);
		}
	}
	
    public void removeItem() {
        if (!inventory.isEmpty()) {
            Item removedItem = inventory.remove(0);
            System.out.println("Oh no! you lost " + removedItem.getName() + "!");
        } else {
            System.out.println(" You have no items to lose!");
        }
    }
}
