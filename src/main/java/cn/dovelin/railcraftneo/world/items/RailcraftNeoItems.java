package cn.dovelin.railcraftneo.world.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import static cn.dovelin.railcraftneo.RailcraftNeo.MODID;

public class RailcraftNeoItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static Map<String, DeferredItem<Item>> ITEM_MAP=new HashMap<>();

//    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
//            .alwaysEat().nutrition(1).saturationMod(2f).build()));
    public static DeferredRegister.Items registerFun(){
        itemRegister("zinc_ingot", Item::new, new Item.Properties());
        return ITEMS;
    }


     public static DeferredItem<Item> itemRegister (String name, Function<Item.Properties, Item> func, Item.Properties props){
         DeferredItem<Item> temp = ITEMS.registerItem(name, func, props);
         ITEM_MAP.put(name,temp);
         return temp;
     }
    public static DeferredItem<Item> itemRegister (String name, Function<Item.Properties, Item> func){
        DeferredItem<Item> temp = ITEMS.registerItem(name, func);
        ITEM_MAP.put(name,temp);
        return temp;
    }

}
