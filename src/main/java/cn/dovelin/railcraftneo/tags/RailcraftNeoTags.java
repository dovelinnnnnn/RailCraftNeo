package cn.dovelin.railcraftneo.tags;

import cn.dovelin.railcraftneo.RailcraftNeo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.tags.FluidTags;

public class RailcraftNeoTags {
    public static class Items {

        public static final TagKey<Item> CROWBAR = tag("crowbar");

        public static final TagKey<Item> METAL = tag("metal");

        // ======================================================
        // Metals
        // ======================================================
        // [forge:ingots/[INGOT NAME]]
        public static final TagKey<Item> STEEL_INGOT = neoForgeTag("ingots/steel");
        public static final TagKey<Item> TIN_INGOT = neoForgeTag("ingots/tin");
        public static final TagKey<Item> LEAD_INGOT = neoForgeTag("ingots/lead");
        public static final TagKey<Item> SILVER_INGOT = neoForgeTag("ingots/silver");
        public static final TagKey<Item> BRONZE_INGOT = neoForgeTag("ingots/bronze");
        public static final TagKey<Item> NICKEL_INGOT = neoForgeTag("ingots/nickel");
        public static final TagKey<Item> INVAR_INGOT = neoForgeTag("ingots/invar");
        public static final TagKey<Item> ZINC_INGOT = neoForgeTag("ingots/zinc");
        public static final TagKey<Item> BRASS_INGOT = neoForgeTag("ingots/brass");


        public static final TagKey<Item> STEEL_NUGGET = neoForgeTag("nuggets/steel");
        public static final TagKey<Item> TIN_NUGGET = neoForgeTag("nuggets/tin");
        public static final TagKey<Item> LEAD_NUGGET = neoForgeTag("nuggets/lead");
        public static final TagKey<Item> SILVER_NUGGET = neoForgeTag("nuggets/silver");
        public static final TagKey<Item> BRONZE_NUGGET = neoForgeTag("nuggets/bronze");
        public static final TagKey<Item> NICKEL_NUGGET = neoForgeTag("nuggets/nickel");
        public static final TagKey<Item> INVAR_NUGGET = neoForgeTag("nuggets/invar");
        public static final TagKey<Item> ZINC_NUGGET = neoForgeTag("nuggets/zinc");
        public static final TagKey<Item> BRASS_NUGGET = neoForgeTag("nuggets/brass");


        public static final TagKey<Item> STEEL_BLOCK = neoForgeTag("storage_blocks/steel");
        public static final TagKey<Item> TIN_BLOCK = neoForgeTag("storage_blocks/tin");
        public static final TagKey<Item> LEAD_BLOCK = neoForgeTag("storage_blocks/lead");
        public static final TagKey<Item> SILVER_BLOCK = neoForgeTag("storage_blocks/silver");
        public static final TagKey<Item> BRONZE_BLOCK = neoForgeTag("storage_blocks/bronze");
        public static final TagKey<Item> NICKEL_BLOCK = neoForgeTag("storage_blocks/nickel");
        public static final TagKey<Item> INVAR_BLOCK = neoForgeTag("storage_blocks/invar");
        public static final TagKey<Item> ZINC_BLOCK = neoForgeTag("storage_blocks/zinc");
        public static final TagKey<Item> BRASS_BLOCK = neoForgeTag("storage_blocks/brass");

        public static final TagKey<Item> STEEL_PLATE = neoForgeTag("plates/steel");
        public static final TagKey<Item> IRON_PLATE = neoForgeTag("plates/iron");
        public static final TagKey<Item> TIN_PLATE = neoForgeTag("plates/tin");
        public static final TagKey<Item> GOLD_PLATE = neoForgeTag("plates/gold");
        public static final TagKey<Item> LEAD_PLATE = neoForgeTag("plates/lead");
        public static final TagKey<Item> ZINC_PLATE = neoForgeTag("plates/zinc");
        public static final TagKey<Item> BRASS_PLATE = neoForgeTag("plates/brass");
        public static final TagKey<Item> INVAR_PLATE = neoForgeTag("plates/invar");
        public static final TagKey<Item> BRONZE_PLATE = neoForgeTag("plates/bronze");
        public static final TagKey<Item> COPPER_PLATE = neoForgeTag("plates/copper");
        public static final TagKey<Item> NICKEL_PLATE = neoForgeTag("plates/nickel");
        public static final TagKey<Item> SILVER_PLATE = neoForgeTag("plates/silver");

        public static final TagKey<Item> STEEL_GEAR = neoForgeTag("gears/steel");
        public static final TagKey<Item> IRON_GEAR = neoForgeTag("gears/iron");
        public static final TagKey<Item> TIN_GEAR = neoForgeTag("gears/tin");
        public static final TagKey<Item> GOLD_GEAR = neoForgeTag("gears/gold");
        public static final TagKey<Item> LEAD_GEAR = neoForgeTag("gears/lead");
        public static final TagKey<Item> ZINC_GEAR = neoForgeTag("gears/zinc");
        public static final TagKey<Item> BRASS_GEAR = neoForgeTag("gears/brass");
        public static final TagKey<Item> INVAR_GEAR = neoForgeTag("gears/invar");
        public static final TagKey<Item> BRONZE_GEAR = neoForgeTag("gears/bronze");
        public static final TagKey<Item> COPPER_GEAR = neoForgeTag("gears/copper");
        public static final TagKey<Item> NICKEL_GEAR = neoForgeTag("gears/nickel");
        public static final TagKey<Item> SILVER_GEAR = neoForgeTag("gears/silver");


        public static final TagKey<Item> COAL_COKE = neoForgeTag("coal_coke");
        public static final TagKey<Item> SALTPETER_DUST = neoForgeTag("dusts/salt");
        public static final TagKey<Item> COAL_DUST = neoForgeTag("dusts/coal");
        public static final TagKey<Item> CHARCOAL_DUST = neoForgeTag("dusts/charcoal");
        public static final TagKey<Item> SULFUR_DUST = neoForgeTag("dusts/sulfur");
        public static final TagKey<Item> OBSIDIAN_DUST = neoForgeTag("dusts/obsidian");

        public static final TagKey<Item> IRON_TANK_GAUGE = tag("iron_tank_gauge");
        public static final TagKey<Item> IRON_TANK_VALVE = tag("iron_tank_valve");
        public static final TagKey<Item> IRON_TANK_WALL = tag("iron_tank_wall");

        public static final TagKey<Item> STEEL_TANK_GAUGE = tag("steel_tank_gauge");
        public static final TagKey<Item> STEEL_TANK_VALVE = tag("steel_tank_valve");
        public static final TagKey<Item> STEEL_TANK_WALL = tag("steel_tank_wall");

        public static final TagKey<Item> QUARRIED = tag("quarried");

        public static final TagKey<Item> POST = tag("post");
        public static final TagKey<Item> STRENGTHENED_GLASS = tag("strengthened_glass");
        public static final TagKey<Item> ABANDONED_TRACK = tag("abandoned_track");
        public static final TagKey<Item> ELECTRIC_TRACK = tag("electric_track");
        public static final TagKey<Item> HIGH_SPEED_TRACK = tag("high_speed_track");
        public static final TagKey<Item> HIGH_SPEED_ELECTRIC_TRACK = tag("high_speed_electric_track");
        public static final TagKey<Item> IRON_TRACK = tag("iron_track");
        public static final TagKey<Item> REINFORCED_TRACK = tag("reinforced_track");
        public static final TagKey<Item> STRAP_IRON_TRACK = tag("strap_iron_track");


        public static final TagKey<Item> LEAD_ORE = neoForgeTag("ores/lead");
        public static final TagKey<Item> NICKEL_ORE = neoForgeTag("ores/nickel");
        public static final TagKey<Item> SILVER_ORE = neoForgeTag("ores/silver");
        public static final TagKey<Item> SULFUR_ORE = neoForgeTag("ores/sulfur");
        public static final TagKey<Item> TIN_ORE = neoForgeTag("ores/tin");
        public static final TagKey<Item> ZINC_ORE = neoForgeTag("ores/zinc");
        public static final TagKey<Item> SALTPETER_ORE = neoForgeTag("ores/salt");

        public static final TagKey<Item> TIN_RAW = neoForgeTag("raw_materials/tin");
        public static final TagKey<Item> ZINC_RAW = neoForgeTag("raw_materials/zinc");
        public static final TagKey<Item> NICKEL_RAW = neoForgeTag("raw_materials/nickel");
        public static final TagKey<Item> SILVER_RAW = neoForgeTag("raw_materials/silver");
        public static final TagKey<Item> LEAD_RAW = neoForgeTag("raw_materials/lead");

        public static final TagKey<Item> TOOLS_SWORDS_STEEL = neoForgeTag("tools/swords/steel");
        public static final TagKey<Item> TOOLS_AXES_STEEL = neoForgeTag("tools/axes/steel");
        public static final TagKey<Item> TOOLS_PICKAXES_STEEL = neoForgeTag("tools/pickaxes/steel");
        public static final TagKey<Item> TOOLS_SHOVELS_STEEL = neoForgeTag("tools/shovels/steel");
        public static final TagKey<Item> TOOLS_HOES_STEEL = neoForgeTag("tools/hoes/steel");

        public static final TagKey<Item> ARMORS_HELMETS_STEEL = neoForgeTag("armors/helmets/steel");
        public static final TagKey<Item> ARMORS_CHESTPLATES_STEEL = neoForgeTag("armors/chestplates/steel");
        public static final TagKey<Item> ARMORS_LEGGINGS_STEEL = neoForgeTag("armors/leggings/steel");
        public static final TagKey<Item> ARMORS_BOOTS_STEEL = neoForgeTag("armors/boots/steel");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RailcraftNeo.MODID, name));
        }

        private static TagKey<Item> neoForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {

        public static final TagKey<Block> BALLAST = tag("ballast");
        public static final TagKey<Block> MAGIC_ORE = tag("magic_ore");
        public static final TagKey<Block> SWITCH_TRACK_ACTUATOR = tag("switch_track_actuator");
        public static final TagKey<Block> ASPECT_RECEIVER = tag("aspect_receiver");
        public static final TagKey<Block> ASPECT_EMITTER = tag("aspect_emitter");
        public static final TagKey<Block> POST = tag("post");
        public static final TagKey<Block> STRENGTHENED_GLASS = tag("strengthened_glass");
        public static final TagKey<Block> SIGNAL = tag("signal");
        public static final TagKey<Block> ABANDONED_TRACK = tag("abandoned_track");
        public static final TagKey<Block> ELECTRIC_TRACK = tag("electric_track");
        public static final TagKey<Block> HIGH_SPEED_TRACK = tag("high_speed_track");
        public static final TagKey<Block> HIGH_SPEED_ELECTRIC_TRACK = tag("high_speed_electric_track");
        public static final TagKey<Block> IRON_TRACK = tag("iron_track");
        public static final TagKey<Block> REINFORCED_TRACK = tag("reinforced_track");
        public static final TagKey<Block> STRAP_IRON_TRACK = tag("strap_iron_track");

        public static final TagKey<Block> IRON_TANK_GAUGE = tag("iron_tank_gauge");
        public static final TagKey<Block> IRON_TANK_VALVE = tag("iron_tank_valve");
        public static final TagKey<Block> IRON_TANK_WALL = tag("iron_tank_wall");

        public static final TagKey<Block> STEEL_TANK_GAUGE = tag("steel_tank_gauge");
        public static final TagKey<Block> STEEL_TANK_VALVE = tag("steel_tank_valve");
        public static final TagKey<Block> STEEL_TANK_WALL = tag("steel_tank_wall");

        public static final TagKey<Block> QUARRIED = tag("quarried");

        public static final TagKey<Block> MINEABLE_WITH_CROWBAR = tag("mineable/crowbar");

        public static final TagKey<Block> LEAD_ORE = forgeTag("ores/lead");
        public static final TagKey<Block> NICKEL_ORE = forgeTag("ores/nickel");
        public static final TagKey<Block> SILVER_ORE = forgeTag("ores/silver");
        public static final TagKey<Block> SULFUR_ORE = forgeTag("ores/sulfur");
        public static final TagKey<Block> TIN_ORE = forgeTag("ores/tin");
        public static final TagKey<Block> ZINC_ORE = forgeTag("ores/zinc");
        public static final TagKey<Block> SALTPETER_ORE = forgeTag("ores/salt");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RailcraftNeo.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Fluids {

        public static final TagKey<Fluid> STEAM = forgeTag("steam");
        public static final TagKey<Fluid> CREOSOTE = forgeTag("creosote");
        public static final TagKey<Fluid> GASEOUS = forgeTag("gaseous");

        private static TagKey<Fluid> forgeTag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }
}
