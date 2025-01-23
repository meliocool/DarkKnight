public class RingOfHealth implements Item {
	
	@Override
	public void ApplyEff(Player player) {
		int newHP = player.getHP() + 40;
		player.setHP(newHP);;
		System.out.println("You obtained Ring of Health!");
		System.out.println("Increase the wearer's HP by 40!");
		System.out.println("Your HP is now " + newHP + "!");
	}
	
	@Override
	public String getName() {
		return "Ring of Health";
	}
}
