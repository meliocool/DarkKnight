public abstract class Entity {
	private Integer HP;
	private Integer baseDamage;
	
	// Constructor
	public Entity(Integer HP, Integer baseDamage) {
		this.HP = HP;
		this.baseDamage = baseDamage;
	}
	
	// Abstract Method
	public abstract void attack(Entity target);
	public abstract void takeDamage(int damage);

		
	// Concrete Method
	public Integer getHP() {
		return HP;
	}

	// Getter Setter
	public void setHP(Integer hP) {
		HP = hP;
	}

	public Integer getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(Integer baseDamage) {
		this.baseDamage = baseDamage;
	}
	
}
