package main;

public abstract class Creature implements Ability {
    private float health;

    private Integer armor;

    private Integer minDamage;

    private Integer maxDamage;

    private String name;


    public Creature(float health, Integer armor, Integer minDamage, Integer maxDamage, String name) {
        this.health = health;
        this.armor = armor;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.name = name;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void setMinDamage(Integer minDamage) {
        this.minDamage = minDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public Integer getArmor() {
        return armor;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }

    public Integer getMinDamage() {
        return minDamage;
    }

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return health == 0;

    }

    @Override
    public String toString() {
        return "Creature{" +
                "health=" + health +
                ", armor=" + armor +
                ", minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                ", name='" + name + '\'' +
                '}';
    }
}
