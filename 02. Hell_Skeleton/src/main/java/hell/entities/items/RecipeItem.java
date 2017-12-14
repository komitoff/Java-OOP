package hell.entities.items;

import hell.interfaces.Recipe;

import java.util.Collections;
import java.util.List;

public class RecipeItem extends AbstractItem implements Recipe{

    private List<String> requiredItems;

    public RecipeItem(String name, int strengthBonus, int agilityBonus,
                      int intelligenceBonus, int hitPointsBonus, int damageBonus, List<String> reqiredItems) {
        super(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointsBonus, damageBonus);
        this.requiredItems = reqiredItems;
    }

    @Override
    public List<String> getRequiredItems() {
        return Collections.unmodifiableList(requiredItems);
    }
}
