package hero;

public class Hero extends CharacterDecorator {

    IChance chance;

    public Hero(IFighter firstFighter, IChance chance) {
        super(firstFighter);
        this.chance = chance;
    }

    @Override
    public void attack(IFighter defender) {
        super.attack(defender);

        if(chance.isLucky()){
            super.attack(defender);
        }
    }
}
