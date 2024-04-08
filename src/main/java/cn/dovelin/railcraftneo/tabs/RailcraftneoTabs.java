package cn.dovelin.railcraftneo.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static cn.dovelin.railcraftneo.RailcraftNeo.MODID;
import static cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks.*;
import static cn.dovelin.railcraftneo.world.items.RailcraftNeoItems.ITEM_MAP;

public class RailcraftneoTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RAILCRAFT_NEO_TAB = CREATIVE_MODE_TABS.register("railcraftneo_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.RailcraftNeo")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
//            .icon(()->EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (String key : BLOCK_MAP.keySet()) {
                    output.accept(BLOCK_MAP.get(key).get());
                }
                for (String key : ITEM_MAP.keySet()) {
                    output.accept(ITEM_MAP.get(key).get());
                }
            }).build());
}
