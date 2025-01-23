public class Excalibur implements Item{

	@Override
	public void ApplyEff(Player player) {
		int newAP = (int) (player.getBaseDamage() * 1.10);
		player.setBaseDamage(newAP);
		System.out.println("You obtained Excalibur!");
		System.out.println("Increase the wearer's damage by 10%");
		System.out.println("Your Attack Power is now " + newAP + "!");
	}

	@Override
	public String getName() {
		return "Excalibur";
	}
}
