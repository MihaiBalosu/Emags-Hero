package hero;

public class SuperHero extends CharacterDecorator {

    IChance chance;

    public SuperHero(IFighter firstFighter, IChance chance) {
        super(firstFighter);
        this.chance = chance;
    }

    @Override
    public void defend(int otherStrength) {
        if(chance.isLucky()){
            super.defend(computeDamage(otherStrength));
            return;
        }

        super.defend(otherStrength);
    }

    @Override
    public int computeDamage(int strength) {
        return (super.computeDamage(strength)) / 2;
    }
}
