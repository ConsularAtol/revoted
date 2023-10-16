package consular.revoted.registry;

import consular.revoted.Revoted;
import consular.revoted.item.CrabClawItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CRAB_CLAW = registerItem("crab_claw", new CrabClawItem(new Item.Settings()));
    
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Revoted.MODID, name), item);
    }

    public static void registerItems(){
        Revoted.LOGGER.info("Registering items");
    }
}
