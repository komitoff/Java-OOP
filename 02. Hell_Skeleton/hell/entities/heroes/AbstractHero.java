package hell.entities.heroes;

import hell.entities.miscellaneous.HeroInventory;
import hell.entities.miscellaneous.ItemCollection;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Field;
import java.util.*;

public abstract class AbstractHero implements Hero {


    private String name;
    private long strength;
    private long agility;
    private long intelligence;
    private long hitPoints;
    private long damage;
    private Inventory inventory;

    protected AbstractHero(String name, long strength,
                        long agility, long intelligence, long hitPoints,
                        long damage) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.inventory = new HeroInventory();
    }

    public String getName() {
        return this.name;
    }


    public long getStrength() {
        return this.strength;
    }


    public long getAgility() {
        return this.agility;
    }


    public long getIntelligence() {
        return this.intelligence;
    }

    public long getHitPoints() {
        return this.hitPoints;
    }

    public long getDamage() {
        return this.damage;
    }

    public Collection<Item> getItems() throws IllegalAccessException {
        Field[] fields = Inventory.class.getDeclaredFields();
        Map<String, Item> items = null;
        for (Field field : fields) {
            if (field.isAnnotationPresent(ItemCollection.class)) {
                field.setAccessible(true);
                items = (Map<String, Item>) field.get(this.inventory);
            }
        }

        return items != null ? items.values() : null;
    }

    public void addItem(Item item) {
        this.inventory.addCommonItem(item);
    }

    public void addRecipe(Recipe recipe) {
        this.inventory.addRecipeItem(recipe);
    }
}
