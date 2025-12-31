package net.tomsyalad.tylssharedresources.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylssharedresources.TYLsSharedResources;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TYLsSharedResources.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TYLS_RESOURCES_TAB = CREATIVE_MODE_TABS.register("tyls_resources_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LUMBER_OAK.get()))
                    .title(Component.translatable("creativetab.tyls_resources_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.LUMBER_OAK.get());
                        output.accept(ModItems.LUMBER_SPRUCE.get());
                        output.accept(ModItems.LUMBER_BIRCH.get());
                        output.accept(ModItems.LUMBER_JUNGLE.get());
                        output.accept(ModItems.LUMBER_ACACIA.get());
                        output.accept(ModItems.LUMBER_DARK_OAK.get());
                        output.accept(ModItems.LUMBER_MANGROVE.get());
                        output.accept(ModItems.LUMBER_CHERRY.get());
                        output.accept(ModItems.LUMBER_CRIMSON.get());
                        output.accept(ModItems.LUMBER_WARPED.get());
                        output.accept(ModItems.LUMBER_BAMBOO.get());

                        output.accept(ModItems.ROCK.get());
                        output.accept(ModItems.ROCK_DARK.get());
                        output.accept(ModItems.ROCK_ANDESITE.get());
                        output.accept(ModItems.ROCK_DIORITE.get());
                        output.accept(ModItems.ROCK_GRANITE.get());
                        output.accept(ModItems.ROCK_CALCITE.get());
                        output.accept(ModItems.ROCK_TUFF.get());
                        output.accept(ModItems.ROCK_SLATE.get());

                        output.accept(ModItems.SHARD_FLINT.get());
                        output.accept(ModItems.SHARD_GLASS.get());
                        output.accept(ModItems.SHARD_ICE.get());

                        output.accept(ModItems.PILE_DIRT.get());
                        output.accept(ModItems.PILE_MUD.get());
                        output.accept(ModItems.PILE_SAND.get());
                        output.accept(ModItems.PILE_SAND_RED.get());
                        output.accept(ModItems.PILE_SAND_SOUL.get());
                        output.accept(ModItems.PILE_GRAVEL.get());
                        output.accept(ModItems.PILE_GRAVEL_PALE.get());
                        output.accept(ModItems.PILE_GRAVEL_RUSTIC.get());

                        output.accept(ModItems.BARK_PIECE.get());
                        output.accept(ModItems.LEAVES.get());
                        output.accept(ModItems.BAMBOO_STRIPPED.get());
                        output.accept(ModItems.STRAW.get());
                        output.accept(ModItems.CUT_REEDS.get());
                        output.accept(ModItems.BAGASSE.get());
                        output.accept(ModItems.ROTTEN_PLANT.get());
                        output.accept(ModItems.MANURE.get());

                        output.accept(ModItems.HIDE_COARSE.get());
                        output.accept(ModItems.HIDE_SCRAPED.get());
                        output.accept(ModItems.HIDE_SMOKED.get());
                        output.accept(ModItems.LEATHER_TANNED.get());
                        output.accept(ModItems.LEATHER_FANCY.get());
                        output.accept(ModItems.FUR.get());
                        output.accept(ModItems.FUR_PALE.get());
                        output.accept(ModItems.FEATHER_TROPICAL.get());
                        output.accept(ModItems.BARB.get());
                        output.accept(ModItems.TOXINS.get());
                        output.accept(ModItems.SHARD_BONE.get());
                        output.accept(ModItems.PEARL.get());

                        output.accept(ModItems.WITHER_BONE.get());
                        output.accept(ModItems.NETHER_ASH.get());

                        output.accept(ModItems.ORE_TAILINGS.get());
                        output.accept(ModItems.SULFUR.get());
                        output.accept(ModItems.NITRE.get());
                        output.accept(ModItems.RAW_COPPER_NUGGET.get());
                        output.accept(ModItems.RAW_IRON_NUGGET.get());
                        output.accept(ModItems.RAW_GOLD_NUGGET.get());
                        output.accept(ModItems.SHARD_DIAMOND.get());
                        output.accept(ModItems.RAW_TIN_NUGGET.get());
                        output.accept(ModItems.RAW_LEAD_NUGGET.get());
                        output.accept(ModItems.RAW_SILVER_NUGGET.get());

                        output.accept(ModItems.CLAY_BOWL.get());
                        output.accept(ModItems.CLAY_BRICK.get());
                        output.accept(ModItems.CEMENT.get());
                        output.accept(ModItems.RAW_GLASS.get());

                        output.accept(ModItems.PILE_FLOUR_WHEAT.get());
                        output.accept(ModItems.SUGAR_RAW.get());
                        output.accept(ModItems.DOUGH.get());
                        output.accept(ModItems.CAKE_BATTER.get());

                        output.accept(ModItems.BRICK_STONE.get());
                        output.accept(ModItems.BRICK_SNOW.get());
                        output.accept(ModItems.BRICK_ICE.get());
                        output.accept(ModItems.FRAME_WOOD.get());
                        output.accept(ModItems.FRAME_METAL.get());

                        output.accept(ModItems.THREAD.get());
                        output.accept(ModItems.CLOTH_WOOL.get());
                        output.accept(ModItems.CLOTH_PLANT.get());
                        output.accept(ModItems.QUILL.get());
                        output.accept(ModItems.ARROWHEAD.get());
                        output.accept(ModItems.COPPER_NUGGET.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.STEEL_NUGGET.get());
                        output.accept(ModItems.STEEL_SHEET.get());
                        output.accept(ModItems.NAIL.get());
                        output.accept(ModItems.NETHERITE_NUGGET.get());
                        output.accept(ModItems.HINGE.get());
                        output.accept(ModItems.SPRING.get());
                        output.accept(ModItems.SPRING_LOADED.get());
                        output.accept(ModItems.WIRE_COPPER.get());
                        output.accept(ModItems.WIRE_IRON.get());
                        output.accept(ModItems.WIRE_STEEL.get());
                        output.accept(ModItems.WIRE_GOLD.get());
                        output.accept(ModItems.TRANSISTOR.get());
                        output.accept(ModItems.CIRCUIT_BOARD.get());
                        output.accept(ModItems.RECIEVER.get());

                        output.accept(ModItems.SCRAP_WOOD.get());
                        output.accept(ModItems.SCRAP_METAL.get());
                        output.accept(ModItems.SCRAP_ELECTRICAL.get());
                        output.accept(ModItems.RUBBLE.get());
                        output.accept(ModItems.CLOTH_OLD.get());
                        output.accept(ModItems.JUNK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
