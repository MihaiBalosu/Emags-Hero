package hero;

public class HeroHealth implements IHealth {
    IHealth innerHealth;
    ILogger log;
    IChance magicShieldChance;

    public HeroHealth(IHealth otherInnerHealth, IChance otherChance, ILogger log) {
        innerHealth = otherInnerHealth;
        magicShieldChance = otherChance;
        this.log = log;
    }

    @Override
    public void applyDamage(int otherDamage) {
        int currentDamage = otherDamage;
        if (magicShieldChance.isLucky()) {
            currentDamage = currentDamage / 2;
        }

        innerHealth.applyDamage(currentDamage);
    }

    @Override
    public boolean isDepleted() {
        return innerHealth.isDepleted();
    }
}
