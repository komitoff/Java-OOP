package hell.entities.items;

import hell.interfaces.Item;

public abstract class AbstractItem implements Item {

    private String name;
    private int strengthBonus;
    private int agilityBonus;
    private int intelligenceBonus;
    private int hitPointsBonus;
    private int damageBonus;

    protected AbstractItem(String name, int strengthBonus,
                        int agilityBonus, int intelligenceBonus,
                        int hitPointsBonus, int damageBonus) {
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.agilityBonus = agilityBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.hitPointsBonus = hitPointsBonus;
        this.damageBonus = damageBonus;
    }

    public String getName() {
        return this.name;
    }

    public int getStrengthBonus() {
        return this.strengthBonus;
    }

    public int getAgilityBonus() {
        return this.agilityBonus;
    }

    public int getIntelligenceBonus() {
        return this.intelligenceBonus;
    }

    public int getHitPointsBonus() {
        return this.hitPointsBonus;
    }

    public int getDamageBonus() {
        return this.damageBonus;
    }
}
