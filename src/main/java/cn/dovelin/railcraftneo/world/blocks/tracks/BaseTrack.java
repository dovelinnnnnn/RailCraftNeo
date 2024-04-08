package cn.dovelin.railcraftneo.world.blocks.tracks;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.RailShape;

public class BaseTrack extends BaseRailBlock  {

    protected BaseTrack(boolean pIsStraight, Properties pProperties) {
        super(pIsStraight, pProperties);
    }

    @Override
    protected MapCodec<? extends BaseRailBlock> codec() {
        return null;
    }

    @Override
    public Property<RailShape> getShapeProperty() {
        return null;
    }
}
