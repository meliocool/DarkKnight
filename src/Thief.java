import java.util.Random;

public class Thief extends Entity {
	private Random random = new Random();
	private String enemyName = "Thief";
	public Thief(Integer HP, Integer baseDamage) {
		super(HP, baseDamage);
	}

	@Override
	public String toString() {
		return enemyName;
	}

	@Override
	public void attack(Entity target) {
        int damage = random.nextInt(getBaseDamage() + 1); // Random damage between 0 and attackPower
        System.out.println("Thief attack you for " + getBaseDamage());
        target.takeDamage(damage);
        if(target instanceof Player && random.nextDouble() <= 0.25) {
        	((Player) target).removeItem();
        }
	}

	@Override
	public void takeDamage(int damage) {
        setHP(getHP() - damage);
        if (getHP() < 0) {
        	setHP(0);
        }
	}
}
