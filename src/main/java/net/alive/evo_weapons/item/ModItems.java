package net.alive.evo_weapons.item;

import net.alive.evo_weapons.Evo_Weapons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Berserkersword = registerItem("berserkersword",
            new AxeItem(ModToolMaterial.Berserksword, 10, -2.4f, new FabricItemSettings().maxCount(1)));

    private static void addItemstoCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(Berserkersword);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Evo_Weapons.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        Evo_Weapons.LOGGER.info("Registering Mod Items for " + Evo_Weapons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemstoCombatItemGroup);
    }
}