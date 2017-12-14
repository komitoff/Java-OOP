package hell.entities.miscellaneous;

import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import java.lang.reflect.Field;
import java.util.Map;


public class HeroInventoryTest {

    private Recipe recipeMocked;
    private Item itemMocked;
    private Inventory inventory;

    @Before
    public void init() {
        this.recipeMocked = Mockito.mock(Recipe.class);
        this.itemMocked = Mockito.mock(Item.class);
        this.inventory = new HeroInventory();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void getTotalStrengthBonusShouldReturnCorrectResult() throws Exception {
        //arange
        long expected = 2;
        //act
        Mockito.when(this.itemMocked.getStrengthBonus()).thenReturn(2);
        this.inventory.addCommonItem(this.itemMocked);
        long actual = this.inventory.getTotalStrengthBonus();
        //assert
        Assert.assertEquals("Strength not calculated correctly", expected, actual);
    }

    @Test
    public void getTotalAgilityBonusShouldReturnCorrectValue() throws Exception {
        //arange
        long expected = 2;
        //act
        Mockito.when(this.itemMocked.getAgilityBonus()).thenReturn(2);
        this.inventory.addCommonItem(this.itemMocked);
        long actual = this.inventory.getTotalAgilityBonus();
        //assert
        Assert.assertEquals("Agility not calculated correctly", expected, actual);
    }

    @Test
    public void getTotalIntelligenceBonusShouldReturnCorrectValue() throws Exception {
        //arange
        long expected = 2;
        //act
        Mockito.when(this.itemMocked.getIntelligenceBonus()).thenReturn(2);
        this.inventory.addCommonItem(this.itemMocked);
        long actual = this.inventory.getTotalIntelligenceBonus();
        //assert
        Assert.assertEquals("Agility not calculated correctly", expected, actual);
    }

    @Test
    public void getTotalHitPointsBonusShouldReturnCorrectValue() throws Exception {
        //arange
        long expected = 2;
        //act
        Mockito.when(this.itemMocked.getHitPointsBonus()).thenReturn(2);
        this.inventory.addCommonItem(this.itemMocked);
        long actual = this.inventory.getTotalHitPointsBonus();
        //assert
        Assert.assertEquals("Agility not calculated correctly", expected, actual);
    }

    @Test
    public void getTotalDamageBonus() throws Exception {
        //arange
        long expected = 2;
        //act
        Mockito.when(this.itemMocked.getDamageBonus()).thenReturn(2);
        this.inventory.addCommonItem(this.itemMocked);
        long actual = this.inventory.getTotalDamageBonus();
        //assert
        Assert.assertEquals("Agility not calculated correctly", expected, actual);
    }

    @Test
    public void addCommonItemShouldCreateNewItem() throws Exception {
        Item mock1 = Mockito.mock(Item.class);
        Item mock2 = Mockito.mock(Item.class);

        int expected = 2                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ;
        Map<String, Item> items = null;
        Field[] fields = this.inventory.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ItemCollection.class)) {
                field.setAccessible(true);
                items = (Map<String, Item>) field.get(this.inventory);
            }
        }
        items.put(mock1.getName(), mock1);
        items.put(mock2.getName(), mock2);
        int actual = items.size();

        Assert.assertEquals("Items are not added", expected, actual);
    }
}