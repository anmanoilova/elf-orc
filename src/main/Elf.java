package main;

public class Elf extends Creature {

    private Integer countChance = 0;

    private Integer currentDamage;



    public Elf(Integer health, Integer armor, Integer minDamage, Integer maxDamage, String name) {
        super(health, armor, minDamage, maxDamage, name);
        this.currentDamage = minDamage;

    }

    public void attack(Orc orc1) {
        if (orc1 == null)
            return;

        float health = orc1.getHealth();
        castAbility();
        float newHealth = health - currentDamage;
        if (newHealth < 0)
            orc1.setHealth(0);
        else
            orc1.setHealth(newHealth);
        castAbility();
        resetDamageToMinDamage();

//        System.out.println(getName() + " нанес удар " + orc1.getName());
        System.out.println("У " + orc1.getName() + " осталось " + orc1.getHealth() + " XP");
    }

    public void resetDamageToMinDamage() {
        if (countChance == 0) {
            currentDamage = getMinDamage();
        }
    }

    public void castAbility() {
        countChance += getMinDamage();
        if (countChance >= 100) {
            currentDamage = getMaxDamage();
            countChance = 0;
//            System.out.println(getName() + " нанес критический урон " + currentDamage);
        }


    }
}
