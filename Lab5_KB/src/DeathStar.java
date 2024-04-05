public class DeathStar {
    int initialDefensiveCapability;
    int offensivePower;

    public DeathStar(int initialDefensiveCapability, int offensivePower) {
        this.initialDefensiveCapability = initialDefensiveCapability;
        this.offensivePower = offensivePower;
    }

    public int getDefensiveStrength() {
        return initialDefensiveCapability;
    }

    public int getFirePower() {
        return offensivePower;
    }

    public void defendAgainst(int strengthOfAttack) {
    	
        initialDefensiveCapability -= strengthOfAttack;

        if (initialDefensiveCapability > 0) {
            System.out.println("This DeathStar has been destroyed");
        } else {
            System.out.println("The DeathStar's defensive capability reduced to " + initialDefensiveCapability);
        }
    }

    public void firePrimaryWeapon(int energyNeededForFiringDeathStar) {

        if (offensivePower >= energyNeededForFiringDeathStar) {
        	offensivePower -= energyNeededForFiringDeathStar;
            System.out.println("Another planet was destroyed");
        } else {
            System.out.println("Not enough energy for the weapon. Time to fire more engineers!");
        }
    }
    
    public String toString()
    {
    	if (initialDefensiveCapability >= 0)
    	{
    		return "Defensive capability: " + initialDefensiveCapability + "\n"
            + "Offensive fire power: " + offensivePower;
    	}
    	else
    	{
    		return "This Death Star has been destroyed. Lord Vader will be ... disturbed.";
    	}
    }
}
