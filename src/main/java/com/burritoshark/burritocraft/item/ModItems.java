package com.burritoshark.burritocraft.item;

// classes import automatically usually, and you can do it manually if the text is dark red. make sure to choose the right import!!!!!!!!!!!!!!!!!!
import com.burritoshark.burritocraft.BurritoCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // DeferredRegister is like a long list of items you want to put in the (modded) register
    // deferred because it is all under the specific mod id
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BurritoCraft.MODID);

    // this should import net.minecraft.world.item.Item;
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
