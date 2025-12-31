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
    public static final RegistryObject<Item> LUMBER_SPRUCE = ITEMS.register("lumber_spruce",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_BIRCH = ITEMS.register("lumber_birch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_JUNGLE = ITEMS.register("lumber_jungle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_ACACIA = ITEMS.register("lumber_acacia",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_DARK_OAK = ITEMS.register("lumber_dark_oak",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_MANGROVE = ITEMS.register("lumber_mangrove",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_CHERRY = ITEMS.register("lumber_cherry",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_CRIMSON = ITEMS.register("lumber_crimson",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_WARPED = ITEMS.register("lumber_warped",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMBER_BAMBOO = ITEMS.register("lumber_bamboo",
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

    public static final RegistryObject<Item> SHARD_FLINT = ITEMS.register("shard_flint",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_GLASS = ITEMS.register("shard_glass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_ICE = ITEMS.register("shard_ice",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PILE_DIRT = ITEMS.register("pile_dirt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PILE_MUD = ITEMS.register("pile_mud",
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
    public static final RegistryObject<Item> LEAVES = ITEMS.register("leaves",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_STRIPPED = ITEMS.register("bamboo_stripped",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRAW = ITEMS.register("straw",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUT_REEDS = ITEMS.register("cut_reeds",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAGASSE = ITEMS.register("bagasse",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROTTEN_PLANT = ITEMS.register("rotten_plant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANURE = ITEMS.register("manure",
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
    public static final RegistryObject<Item> FUR_PALE = ITEMS.register("fur_pale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FEATHER_TROPICAL = ITEMS.register("feather_tropical",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARB = ITEMS.register("barb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOXINS = ITEMS.register("toxins",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_BONE = ITEMS.register("shard_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WITHER_BONE = ITEMS.register("wither_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_ASH = ITEMS.register("nether_ash",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORE_TAILINGS = ITEMS.register("ore_tailings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NITRE = ITEMS.register("nitre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COPPER_NUGGET = ITEMS.register("raw_copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_IRON_NUGGET = ITEMS.register("raw_iron_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GOLD_NUGGET = ITEMS.register("raw_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_DIAMOND = ITEMS.register("shard_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN_NUGGET = ITEMS.register("raw_tin_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD_NUGGET = ITEMS.register("raw_lead_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER_NUGGET = ITEMS.register("raw_silver_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLAY_BOWL = ITEMS.register("clay_bowl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLAY_BRICK = ITEMS.register("clay_brick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CEMENT = ITEMS.register("cement",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GLASS = ITEMS.register("raw_glass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PILE_FLOUR_WHEAT = ITEMS.register("pile_flour_wheat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUGAR_RAW = ITEMS.register("sugar_raw",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAKE_BATTER = ITEMS.register("cake_batter",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRICK_STONE = ITEMS.register("brick_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRICK_SNOW = ITEMS.register("brick_snow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRICK_ICE = ITEMS.register("brick_ice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRAME_WOOD = ITEMS.register("frame_wood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRAME_METAL = ITEMS.register("frame_metal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THREAD = ITEMS.register("thread",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOTH_WOOL = ITEMS.register("cloth_wool",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOTH_PLANT = ITEMS.register("cloth_plant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUILL = ITEMS.register("quill",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARROWHEAD = ITEMS.register("arrowhead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NAIL = ITEMS.register("nail",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HINGE = ITEMS.register("hinge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRING_LOADED = ITEMS.register("spring_loaded",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRE_COPPER = ITEMS.register("wire_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRE_IRON = ITEMS.register("wire_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRE_STEEL = ITEMS.register("wire_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRE_GOLD = ITEMS.register("wire_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSISTOR = ITEMS.register("transistor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIRCUIT_BOARD = ITEMS.register("circuit_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RECIEVER = ITEMS.register("reciever",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCRAP_WOOD = ITEMS.register("scrap_wood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register("scrap_metal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCRAP_ELECTRICAL = ITEMS.register("scrap_electrical",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBLE = ITEMS.register("rubble",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOTH_OLD = ITEMS.register("cloth_old",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNK = ITEMS.register("junk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLACEHOLDER_ITEM_ONE = ITEMS.register("placeholder_item_one",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_TWO = ITEMS.register("placeholder_item_two",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_THREE = ITEMS.register("placeholder_item_three",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_FOUR = ITEMS.register("placeholder_item_four",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_FIVE = ITEMS.register("placeholder_item_five",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_SIX = ITEMS.register("placeholder_item_six",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_SEVEN = ITEMS.register("placeholder_item_seven",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_EIGHT = ITEMS.register("placeholder_item_eight",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_NINE = ITEMS.register("placeholder_item_nine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLACEHOLDER_ITEM_TEN = ITEMS.register("placeholder_item_ten",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
