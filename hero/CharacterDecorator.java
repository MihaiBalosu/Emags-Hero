package hero;

public class CharacterDecorator implements IFighter {

    private IFighter firstFighter;

    public CharacterDecorator(IFighter firstFighter) {
        this.firstFighter = firstFighter;
    }

    @Override
    public boolean isAttackingFirst(IFighter otherFighter) {
        return this.firstFighter.isAttackingFirst(otherFighter);
    }

    @Override
    public void attack(IFighter defender) {
        this.firstFighter.attack(defender);
    }

    @Override
    public boolean isDefeated() {
        return this.firstFighter.isDefeated();
    }

    @Override
    public boolean hasTheSameSpeedAs(int otherSpeed) {
        return this.firstFighter.hasTheSameSpeedAs(otherSpeed);
    }

    @Override
    public boolean isLessLuckyThan(IChance otherLuck) {
        return this.firstFighter.isLessLuckyThan(otherLuck);
    }

    @Override
    public boolean isSlowerThan(int otherSpeed) {
        return this.firstFighter.isSlowerThan(otherSpeed);
    }

    @Override
    public void defend(int otherStrength) {
        this.firstFighter.defend(otherStrength);
    }

    @Override
    public String getName() {
        return this.firstFighter.getName();
    }

    @Override
    public int computeDamage(int strength) {
        return this.firstFighter.computeDamage(strength);
    }
}
