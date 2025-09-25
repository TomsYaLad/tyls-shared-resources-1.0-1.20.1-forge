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
                        output.accept(ModItems.LUMBER_BIRCH.get());
                        output.accept(ModItems.LUMBER_SPRUCE.get());
                        output.accept(ModItems.LUMBER_ACACIA.get());

                        output.accept(ModItems.ROCK.get());
                        output.accept(ModItems.ROCK_DARK.get());
                        output.accept(ModItems.ROCK_ANDESITE.get());
                        output.accept(ModItems.ROCK_DIORITE.get());
                        output.accept(ModItems.ROCK_GRANITE.get());
                        output.accept(ModItems.ROCK_CALCITE.get());
                        output.accept(ModItems.ROCK_TUFF.get());
                        output.accept(ModItems.ROCK_SLATE.get());

                        output.accept(ModItems.PILE_SAND.get());
                        output.accept(ModItems.PILE_SAND_RED.get());
                        output.accept(ModItems.PILE_SAND_SOUL.get());
                        output.accept(ModItems.PILE_GRAVEL.get());
                        output.accept(ModItems.PILE_GRAVEL_PALE.get());
                        output.accept(ModItems.PILE_GRAVEL_RUSTIC.get());

                        output.accept(ModItems.BARK_PIECE.get());

                        output.accept(ModItems.HIDE_COARSE.get());
                        output.accept(ModItems.HIDE_SCRAPED.get());
                        output.accept(ModItems.HIDE_SMOKED.get());
                        output.accept(ModItems.LEATHER_TANNED.get());
                        output.accept(ModItems.LEATHER_FANCY.get());
                        output.accept(ModItems.FUR.get());

                        output.accept(ModItems.WITHER_BONE.get());
                        output.accept(ModItems.NETHER_ASH.get());

                        output.accept(ModItems.ORE_TAILINGS.get());
                        output.accept(ModItems.CEMENT.get());
                        output.accept(ModItems.RAW_GLASS.get());
                        output.accept(ModItems.RAW_COPPER_NUGGET.get());
                        output.accept(ModItems.RAW_IRON_NUGGET.get());
                        output.accept(ModItems.RAW_GOLD_NUGGET.get());
                        output.accept(ModItems.COPPER_NUGGET.get());
                        output.accept(ModItems.CLAY_BOWL.get());

                        output.accept(ModItems.THREAD.get());
                        output.accept(ModItems.WOOL_CLOTH.get());
                        output.accept(ModItems.QUILL.get());
                        output.accept(ModItems.WOODEN_FRAMING.get());
                        output.accept(ModItems.HINGE.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
