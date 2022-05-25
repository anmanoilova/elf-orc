package main;

public class Orc extends Creature {

    public Orc(float health, Integer armor, Integer minDamage, Integer maxDamage, String name) {
        super(health, armor, minDamage, maxDamage, name);
    }


    public void attack( final Elf elf1) {
        if (elf1 == null)
            return;

        float health = elf1.getHealth();
        float newHealth = health - getMinDamage();
        if (newHealth < 0)
            elf1.setHealth(0);
        else
            elf1.setHealth(newHealth);
        castAbility();

//        System.out.println(getName() + " нанес удар " + elf1.getName());
        System.out.println("У " + elf1.getName() + " осталось " + elf1.getHealth() + " XP");
    }

    public void castAbility() {
        float lifeSteal = getMinDamage() / 5.0f;
        float newHealth = getHealth() + lifeSteal;
        setHealth(newHealth);

//        System.out.println(getName() + " вылечил себя нa " + lifeSteal);


    }

    public void necrOrcs(){

    }


}

