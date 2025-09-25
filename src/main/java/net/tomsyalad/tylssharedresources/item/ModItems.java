package net.tomsyalad.tylssharedresources.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomsyalad.tylssharedresources.TYLsSharedResources;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TYLsSharedResources.MOD_ID);

    public static final RegistryObject<Item> LUMBER_OAK = ITEMS.register("lumber_oak",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_BIRCH = ITEMS.register("lumber_birch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_SPRUCE = ITEMS.register("lumber_spruce",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_ACACIA = ITEMS.register("lumber_acacia",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_DARK = ITEMS.register("rock_dark",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_ANDESITE = ITEMS.register("rock_andesite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_DIORITE = ITEMS.register("rock_diorite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_GRANITE = ITEMS.register("rock_granite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_CALCITE = ITEMS.register("rock_calcite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_TUFF = ITEMS.register("rock_tuff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_SLATE = ITEMS.register("rock_slate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PILE_SAND = ITEMS.register("pile_sand",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PILE_SAND_RED = ITEMS.register("pile_sand_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PILE_SAND_SOUL = ITEMS.register("pile_sand_soul",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PILE_GRAVEL = ITEMS.register("pile_gravel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PILE_GRAVEL_PALE = ITEMS.register("pile_gravel_pale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PILE_GRAVEL_RUSTIC = ITEMS.register("pile_gravel_rustic",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BARK_PIECE = ITEMS.register("bark_piece",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HIDE_COARSE = ITEMS.register("hide_coarse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIDE_SCRAPED = ITEMS.register("hide_scraped",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HIDE_SMOKED = ITEMS.register("hide_smoked",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEATHER_TANNED = ITEMS.register("leather_tanned",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEATHER_FANCY = ITEMS.register("leather_fancy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUR = ITEMS.register("fur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WITHER_BONE = ITEMS.register("wither_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_ASH = ITEMS.register("nether_ash",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORE_TAILINGS = ITEMS.register("ore_tailings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CEMENT = ITEMS.register("cement",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GLASS = ITEMS.register("raw_glass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COPPER_NUGGET = ITEMS.register("raw_copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_IRON_NUGGET = ITEMS.register("raw_iron_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GOLD_NUGGET = ITEMS.register("raw_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLAY_BOWL = ITEMS.register("clay_bowl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THREAD = ITEMS.register("thread",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOL_CLOTH = ITEMS.register("wool_cloth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUILL = ITEMS.register("quill",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_FRAMING = ITEMS.register("wooden_framing",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HINGE = ITEMS.register("hinge",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
