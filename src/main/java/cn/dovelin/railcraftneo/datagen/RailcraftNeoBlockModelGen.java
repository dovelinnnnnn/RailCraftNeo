package cn.dovelin.railcraftneo.datagen;

import cn.dovelin.railcraftneo.RailcraftNeo;
import cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static cn.dovelin.railcraftneo.world.blocks.RailcraftNeoBlocks.BLOCK_MAP;

public class RailcraftNeoBlockModelGen extends BlockStateProvider {
    public RailcraftNeoBlockModelGen(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RailcraftNeo.MODID, exFileHelper);
    }


    public void  registerBlockModelAndItem(Block block){
        this.simpleBlockItem(block, this.cubeAll(block));
    }
    @Override
    protected void registerStatesAndModels() {
        for (String key : BLOCK_MAP.keySet()) {
            this.registerBlockModelAndItem(BLOCK_MAP.get(key).get());
        }
    }
}
