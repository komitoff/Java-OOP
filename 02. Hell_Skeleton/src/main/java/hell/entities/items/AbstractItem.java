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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("###Item: %s", this.getClass().getSimpleName()))
                .append(System.lineSeparator())
                .append(String.format("###+%d Strength", this.strengthBonus))
                .append(System.lineSeparator())
                .append(String.format("###+%d Agility", this.agilityBonus))
                .append(System.lineSeparator())
                .append(String.format("###+%d Intelligence", this.intelligenceBonus))
                .append(System.lineSeparator())
                .append(String.format("###+%d HitPoints", this.hitPointsBonus))
                .append(System.lineSeparator())
                .append(String.format("###+%d Damage", this.damageBonus))
                .append(System.lineSeparator());
        return sb.toString();
    }
}
