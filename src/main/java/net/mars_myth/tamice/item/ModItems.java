package net.mars_myth.tamice.item;

import net.mars_myth.tamice.TotallyNotAHorrorMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item OCEAN_EYE = registerItem("ocean_eye",
            new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TotallyNotAHorrorMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TotallyNotAHorrorMod.LOGGER.info("Registering Mod Items for " + TotallyNotAHorrorMod.MOD_ID);
    }
}
