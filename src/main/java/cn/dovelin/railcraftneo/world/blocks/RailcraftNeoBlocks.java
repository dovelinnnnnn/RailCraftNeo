package cn.dovelin.railcraftneo.world.blocks;

import cn.dovelin.railcraftneo.world.items.RailcraftNeoItems;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.fml.Logging;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static cn.dovelin.railcraftneo.RailcraftNeo.MODID;
import static cn.dovelin.railcraftneo.world.items.RailcraftNeoItems.ITEM_MAP;
import static com.mojang.text2speech.Narrator.LOGGER;

public class RailcraftNeoBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static Map<String,DeferredBlock<Block>> BLOCK_MAP= new HashMap<>();
    public static DeferredRegister.Blocks registerFun(){
        registerBlock("zinc_block",
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                        .strength(5.0F, 15.0F)
                        .requiresCorrectToolForDrops()
                ));
        registerBlock ("zinc_ore",
                () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
                        .strength(3.0F, 15.0F)
                        .requiresCorrectToolForDrops()
                ));
        registerBlock( "deepslate_zinc_ore",
                () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).strength(4.5F, 3.0F).requiresCorrectToolForDrops()
                ));
        return BLOCKS;
    }


    private static  DeferredBlock<Block> registerBlock(String name, Supplier<Block> block ) {
        DeferredBlock<Block> toReturn = null;
        toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        BLOCK_MAP.put(name,toReturn);
        return toReturn;
    }

    private static   void registerBlockItem(String name, DeferredBlock<Block>block ){
        DeferredItem<Item> temp =  RailcraftNeoItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
        LOGGER.info(temp.toString());
        ITEM_MAP.put(name,temp);
    }

}
