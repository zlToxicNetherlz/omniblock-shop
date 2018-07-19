package net.omniblock.shop.api.type;

import org.bukkit.Material;

@SuppressWarnings("deprecation")
public enum AdminShopItem {

	
	/*
	 * > Type: Block items
	 */
	STONE(KindItem.BUILDING_BLOCKS, Material.STONE, 5, 1),
	GRANITE(KindItem.BUILDING_BLOCKS, Material.STONE, 1, 5, 1),
	POLISHE_DGRANITE(KindItem.BUILDING_BLOCKS, Material.STONE, 2, 5, 1),
	DIORITE(KindItem.BUILDING_BLOCKS, Material.STONE, 3, 5, 15),
	POLISHED_DIORITE(KindItem.BUILDING_BLOCKS, Material.STONE, 4, 5, 1),
	ANDESITE(KindItem.BUILDING_BLOCKS, Material.STONE, 5, 5, 1),
	POLISHED_ANDESITE(KindItem.BUILDING_BLOCKS, Material.STONE, 6, 5, 1),
	GRASS(KindItem.BUILDING_BLOCKS, Material.GRASS, 2, 1),
	DIRT(KindItem.BUILDING_BLOCKS, Material.DIRT, 2, 1),
	COARSE_DIRT(KindItem.BUILDING_BLOCKS, Material.DIRT, 1, 5, 1),
	PODZOL(KindItem.BUILDING_BLOCKS, Material.DIRT, 2, 8, 1),
	COBBLESTONE(KindItem.BUILDING_BLOCKS, Material.COBBLESTONE, 2, 1),
	WOOD(KindItem.BUILDING_BLOCKS, Material.WOOD, 2, 1),
	SPRUCE_WOOD(KindItem.BUILDING_BLOCKS, Material.WOOD, 1, 2, 1),
	BIRCH_WOOD(KindItem.BUILDING_BLOCKS, Material.WOOD, 2, 2, 1),
	JUNGLE_WOOD(KindItem.BUILDING_BLOCKS, Material.WOOD, 3, 5, 1),
	ACACIA_WOOD(KindItem.BUILDING_BLOCKS, Material.WOOD, 4, 2, 1),
	DARK_WOOD(KindItem.BUILDING_BLOCKS, Material.WOOD, 5, 5, 1),
	SAND(KindItem.BUILDING_BLOCKS, Material.SAND, 5, 1),
	RED_SAND(KindItem.BUILDING_BLOCKS, Material.SAND, 1, 10, 3),
	GRAVEL(KindItem.BUILDING_BLOCKS, Material.GRAVEL, 10, 2),
	GOLD_ORE(KindItem.BUILDING_BLOCKS, Material.GOLD_ORE, 120, 10),
	REDSTONE_ORE(KindItem.BUILDING_BLOCKS, Material.REDSTONE_ORE, 130, 20),
	IRON_ORE(KindItem.BUILDING_BLOCKS, Material.IRON_ORE, 120, 10),
	LAPIS_ORE(KindItem.BUILDING_BLOCKS, Material.LAPIS_ORE, 100, 10),
	COAL_ORE(KindItem.BUILDING_BLOCKS, Material.COAL_ORE, 20, 10),
	EMERALD_ORE(KindItem.BUILDING_BLOCKS, Material.EMERALD_ORE, 150, 50),
	DIAMOND_ORE(KindItem.BUILDING_BLOCKS, Material.DIAMOND_ORE, 140, 30),
	LOG(KindItem.BUILDING_BLOCKS, Material.LOG, 4, 1),
	SPRUCE_LOG(KindItem.BUILDING_BLOCKS, Material.WOOD, 1, 4, 1),
	BIRCH_LOG(KindItem.BUILDING_BLOCKS, Material.WOOD, 2, 4, 1),
	JUNGLE_LOG(KindItem.BUILDING_BLOCKS, Material.WOOD, 3, 4, 1),
	SPONGE(KindItem.BUILDING_BLOCKS, Material.SPONGE, 40, 10),
	WET_SPONGE(KindItem.BUILDING_BLOCKS, Material.SPONGE, 1, 30, 15),
	GLASS(KindItem.BUILDING_BLOCKS, Material.GLASS, 15, 5),
	LAPIS_BLOCK(KindItem.BUILDING_BLOCKS, Material.LAPIS_BLOCK, 120, 20),
	SAND_STONE(KindItem.BUILDING_BLOCKS, Material.SANDSTONE, 40, 20),
	CHISELED_SAND_STONE(KindItem.BUILDING_BLOCKS, Material.SANDSTONE, 1, 40, 20),
	SMOOTH_SAND_STONE(KindItem.BUILDING_BLOCKS, Material.SANDSTONE, 2, 40, 20),
	WHITE_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 15, 2),
	ORANGE_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 1, 20, 2),
	MAGENTA_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 2, 20, 2),
	LIGHT_BLUE_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 3, 20, 2),
	YELLOW_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 4, 20, 2),
	LIME_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 5, 20, 2),
	PINK_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 6, 20, 2),
	GRAY_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 7, 20, 2),
	LIGHT_GRAY_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 8, 20, 2),
	CYAN_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 9, 20, 2),
	PURPLE_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 10, 20, 2),
	BLUE_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 11, 20, 2),
	BROWN_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 12, 20, 2),
	GREEN_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 13, 20, 2),
	RED_WOOL(KindItem.BUILDING_BLOCKS, Material.WOOL, 14, 20, 2),
	GOLD_BLOCK(KindItem.BUILDING_BLOCKS, Material.GOLD_BLOCK, 90, 30),
	IRON_BLOCK(KindItem.BUILDING_BLOCKS, Material.IRON_BLOCK, 100, 20),
	STONE_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 40, 2),
	SAND_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 1, 40, 2),
	COBBLESTONE_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 3, 40, 2),
	BRICKS_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 4, 40, 2),
	STONE_BRICKS_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 5, 40, 2),
	NETHER_BRICK_SALB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 6, 40, 2),
	QUARTZ_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(44), 7, 40, 2),
	BRICK(KindItem.BUILDING_BLOCKS, Material.BRICK, 60, 3),
	BOOK_SHELF(KindItem.BUILDING_BLOCKS, Material.BOOKSHELF, 80, 4),
	MOSSY_COBBLESTONE(KindItem.BUILDING_BLOCKS, Material.MOSSY_COBBLESTONE, 115, 20),
	OBSIDIAN(KindItem.BUILDING_BLOCKS, Material.OBSIDIAN, 64, 32),
	WOOD_STAIRS(KindItem.BUILDING_BLOCKS, Material.WOOD_STAIRS, 30, 15),
	STONE_STAIRS(KindItem.BUILDING_BLOCKS, Material.COBBLESTONE_STAIRS, 30, 15),
	ICE(KindItem.BUILDING_BLOCKS, Material.ICE, 60, 5),
	SNOW(KindItem.BUILDING_BLOCKS, Material.SNOW, 10, 1),
	CLAY(KindItem.BUILDING_BLOCKS, Material.CLAY, 15, 2),
	PUMPKIN(KindItem.BUILDING_BLOCKS, Material.PUMPKIN, 12, 2),
	NETHER_RACK(KindItem.BUILDING_BLOCKS, Material.NETHERRACK, 50, 10),
	SOUL_SAND(KindItem.BUILDING_BLOCKS, Material.SOUL_SAND, 140, 10),
	GLOWSTONE(KindItem.BUILDING_BLOCKS, Material.GLOWSTONE, 40, 5),
	LIT_PUMPKIN(KindItem.BUILDING_BLOCKS, Material.getMaterial(91), 15, 3),
	WHITE_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 12, 1),
	ORANGE_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 1, 18, 2),
	MAGENTA_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 2, 18, 2),
	LIGHT_BLUE_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 3, 18, 2),
	YELLOW_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 4, 18, 2),
	LIME_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 5, 18, 2),
	PINK_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 6, 18, 2),
	GRAY_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 7, 18, 2),
	LIGHT_GRAY_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 8, 18, 2),
	CYAN_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 9, 18, 2),
	PURPLE_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 10, 18, 2),
	BLUE_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 11, 18, 2),
	BROWN_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 12, 18, 2),
	GREEN_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 13, 18, 2),
	RED_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 14, 18, 2),
	BLACK_GLASS(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS, 15, 18, 2),
	STONE_BRICKS(KindItem.BUILDING_BLOCKS, Material.BRICK, 40, 12),
	MOSSY_BRICKS(KindItem.BUILDING_BLOCKS, Material.BRICK, 1, 40, 40),
	CRACKED_BRICKS(KindItem.BUILDING_BLOCKS, Material.BRICK, 2, 40, 40),
	CHISELED_BRICKS(KindItem.BUILDING_BLOCKS, Material.BRICK, 3, 40, 40),
	MELON_BLOCK(KindItem.BUILDING_BLOCKS, Material.MELON_BLOCK, 88, 10),
	BRICK_STAIRS(KindItem.BUILDING_BLOCKS, Material.BRICK_STAIRS, 30, 15),
	STONE_BRICK_STAIRS(KindItem.BUILDING_BLOCKS, Material.BRICK_STAIRS, 30,15),
	MYCELIUM(KindItem.BUILDING_BLOCKS, Material.getMaterial(110), 75, 2),
	NETHER_BRICK(KindItem.BUILDING_BLOCKS, Material.NETHER_BRICK, 100, 50),
	NETHER_BRICK_STAIRS(KindItem.BUILDING_BLOCKS, Material.NETHER_BRICK_STAIRS, 30, 15),
	END_STONE(KindItem.BUILDING_BLOCKS, Material.ENDER_STONE, 20, 10),
	WOOD_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(126), 20, 5),
	SPRUCE_WOOD_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(126), 1, 25, 5),
	BIRCH_WOOD_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(126), 2, 25, 5),
	JUNGLE_WOOD_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(126), 3, 25, 5),
	ACACIA_WOOD_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(126), 4, 25, 5),
	DARK_WOOD_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(126), 5, 25, 5),
	SANDSTONE_STAIRS(KindItem.BUILDING_BLOCKS, Material.SANDSTONE_STAIRS, 25, 5),
	EMERALD_BLOCK(KindItem.BUILDING_BLOCKS, Material.EMERALD_BLOCK, 140, 50),
	SPRUCE_WOOD_STAIRS(KindItem.BUILDING_BLOCKS, Material.SPRUCE_WOOD_STAIRS, 35, 15),
	BRICH_WOOD_STAIRS(KindItem.BUILDING_BLOCKS, Material.BIRCH_WOOD_STAIRS, 35, 15),
	JUNGLA_WOOD_STAIRS(KindItem.BUILDING_BLOCKS, Material.JUNGLE_WOOD_STAIRS, 35, 15),
	QUARTZ_ORE(KindItem.BUILDING_BLOCKS, Material.QUARTZ_ORE, 100, 50),
	QUARTZ_BLOCK(KindItem.BUILDING_BLOCKS, Material.QUARTZ_BLOCK, 200, 100),
	CHISELED_QUARTZ_BLOCK(KindItem.BUILDING_BLOCKS, Material.QUARTZ_BLOCK, 1, 200, 40),
	PILLAR_QUARTZ_BLOCK(KindItem.BUILDING_BLOCKS, Material.QUARTZ_BLOCK,2, 200, 40),
	QUARTZ_STAIRS(KindItem.BUILDING_BLOCKS, Material.QUARTZ_STAIRS, 35, 15),
	WHITE_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 50, 5),
	ORANGE_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 1, 50, 5),
	MAGENTA_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 2, 50, 5),
	LIGHT_BLUE_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 3, 50, 5),
	YELLOW_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 4, 50, 5),
	LIME_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 5, 50, 5),
	PINK_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 6, 50, 5),
	GRAY_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 7, 50, 5),
	LIGHT_GRAY_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 8, 50, 5),
	CYAN_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 9, 50, 5),
	PURPLE_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 10, 50, 5),
	BLUE_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 11, 50, 5),
	BROWN_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 12, 50, 5),
	GREEN_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 13, 50, 5),
	RED_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 14, 50, 5),
	BLACK_CLAY(KindItem.BUILDING_BLOCKS, Material.STAINED_CLAY, 15, 50, 5),
	ACACIA_LOG2(KindItem.BUILDING_BLOCKS, Material.LOG_2, 5, 1),
	DARK_LOG2(KindItem.BUILDING_BLOCKS, Material.LOG_2, 1, 5, 1),
	ACACIA_WOOD_STAIRS(KindItem.BUILDING_BLOCKS, Material.ACACIA_STAIRS, 35, 1),
	DARK_WOOD_STAIRS(KindItem.BUILDING_BLOCKS, Material.DARK_OAK_STAIRS, 35, 1),
	PRISMARINE(KindItem.BUILDING_BLOCKS, Material.PRISMARINE, 80, 10),
	PRISMARINE_BRICKS(KindItem.BUILDING_BLOCKS, Material.PRISMARINE, 1, 80, 10),
	DARK_PRISMARINE(KindItem.BUILDING_BLOCKS, Material.PRISMARINE, 2, 80, 10),
	SEA_LANTERN(KindItem.BUILDING_BLOCKS, Material.SEA_LANTERN, 80, 10),
	HAY_BLOCK(KindItem.BUILDING_BLOCKS, Material.HAY_BLOCK, 70, 10),
	HARDENED_CLAY(KindItem.BUILDING_BLOCKS, Material.HARD_CLAY, 50, 10),
	COAL_BLOCK(KindItem.BUILDING_BLOCKS, Material.COAL_BLOCK, 40, 10),
	PACKED_ICE(KindItem.BUILDING_BLOCKS, Material.PACKED_ICE, 30, 5),
	RED_SANDSTONE(KindItem.BUILDING_BLOCKS, Material.RED_SANDSTONE, 20, 10),
	CHISELED_RED_SANDSTONE(KindItem.BUILDING_BLOCKS, Material.RED_SANDSTONE, 1, 20, 2),
	SMOOTH_RED_SANDSTONE(KindItem.BUILDING_BLOCKS, Material.RED_SANDSTONE, 2, 20, 2),
	RED_SANDSTONE_STAIRS(KindItem.BUILDING_BLOCKS, Material.RED_SANDSTONE_STAIRS, 35, 2),
	RED_SANDSTONE_SLAB(KindItem.BUILDING_BLOCKS, Material.getMaterial(182), 35, 2),
	PURPUR_BLOCK(KindItem.BUILDING_BLOCKS, Material.PURPUR_BLOCK, 35, 2),
	PURPUR_PILLAR(KindItem.BUILDING_BLOCKS, Material.PURPUR_PILLAR, 35, 2),
	PURPUR_STAIRS(KindItem.BUILDING_BLOCKS, Material.PURPUR_STAIRS, 35, 2),
	PURPUR_SLAB(KindItem.BUILDING_BLOCKS, Material.PURPUR_SLAB, 35, 2),
	END_BRICKS(KindItem.BUILDING_BLOCKS, Material.END_BRICKS, 35, 2),
	MAGMA_BLOCK(KindItem.BUILDING_BLOCKS, Material.MAGMA, 35, 2),
	NETHER_WART_BLOCK(KindItem.BUILDING_BLOCKS, Material.NETHER_WART_BLOCK, 45, 5),
	RED_NETHER_BRICK(KindItem.BUILDING_BLOCKS, Material.RED_NETHER_BRICK, 45, 5),
	BONE_BLOCK(KindItem.BUILDING_BLOCKS, Material.BONE_BLOCK, 50, 10),
	WHITE_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 20, 2),
	ORANGE_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 1, 20, 2),
	MAGENTA_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 2, 20, 2),
	LIGHT_BLUE_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 3, 20, 2),
	YELLOW_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 4, 20, 2),
	LIME_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 5, 20, 2),
	PINK_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 6, 20, 2),
	GRAY_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 7, 20, 2),
	LIGHT_GRAY_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 8, 20, 2),
	CYAN_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 9, 20, 2),
	PURPLE_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 10, 20, 2),
	BLUE_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 11, 20, 2),
	BROWN_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 12, 20, 2),
	GREEN_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 13, 20, 2),
	RED_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 14, 20, 2),
	BLACK_CONCRETE(KindItem.BUILDING_BLOCKS, Material.CONCRETE, 15, 20, 2),
	WHITE_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 40, 5),
	ORANGE_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 1, 40, 5),
	MAGENTA_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 2, 40, 5),
	LIGHT_BLUE_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 3, 40, 5),
	YELLOW_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 4, 40, 5),
	LIME_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 5, 40, 5),
	PINK_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 6, 40, 5),
	GRAY_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 7, 40, 5),
	LIGHT_GRAY_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 8, 40, 5),
	CYAN_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 9, 40, 5),
	PURPLE_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 10, 40, 5),
	BLUE_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 11, 40, 5),
	BROWN_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 12, 40, 5),
	GREEN_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 13, 40, 5),
	RED_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 14, 40, 5),
	BLACK_CONCRETE_POWDER(KindItem.BUILDING_BLOCKS, Material.CONCRETE_POWDER, 15, 40, 5),
	CHEST(KindItem.BUILDING_BLOCKS, Material.CHEST, 20, 1),
	CRAFTING_tABLE(KindItem.BUILDING_BLOCKS, Material.getMaterial(58), 20, 1),
	FURNACE(KindItem.BUILDING_BLOCKS, Material.FURNACE, 20, 1),
	LADDER(KindItem.BUILDING_BLOCKS, Material.LADDER, 20, 1),
	SNOW_LAYER(KindItem.BUILDING_BLOCKS, Material.SNOW, 20, 1),
	CACTUS(KindItem.BUILDING_BLOCKS, Material.CACTUS, 40, 2),
	JUKEBOX(KindItem.BUILDING_BLOCKS, Material.JUKEBOX, 40, 5),
	FENCE(KindItem.BUILDING_BLOCKS, Material.FENCE, 30, 2),
	IRON_BARDING(KindItem.BUILDING_BLOCKS, Material.IRON_BARDING, 150, 20),
	GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.getMaterial(102), 25, 2),
	VINE(KindItem.BUILDING_BLOCKS, Material.VINE, 30, 2),
	WATER_LILY(KindItem.BUILDING_BLOCKS, Material.WATER_LILY, 30, 2),
	NETHER_BRICK_FENCE(KindItem.BUILDING_BLOCKS, Material.NETHER_FENCE, 30, 2),
	ENCHANTING_TABLE(KindItem.BUILDING_BLOCKS, Material.ENCHANTMENT_TABLE, 120, 40),
	ENDER_CHEST(KindItem.BUILDING_BLOCKS, Material.ENDER_CHEST, 240, 60),
	COBBLESTONE_WALL(KindItem.BUILDING_BLOCKS, Material.COBBLE_WALL, 30, 2),
	MOSSY_COBBLESTONE_WALL(KindItem.BUILDING_BLOCKS, Material.COBBLE_WALL, 1, 30, 2),
	WHITE_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 10, 1),
	ORANGE_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 1, 12, 1),
	MAGENTA_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 2, 12, 1),
	LIGHT_BLUE_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 3, 12, 1),
	YELLOW_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 4, 12, 1),
	LIME_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 5, 12, 1),
	PINK_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 6, 12, 1),
	GRAY_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 7, 12, 1),
	LIGHT_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 8, 12, 1),
	CYAN_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 9, 12, 1),
	PURPLE_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 10, 12, 1),
	BLUE_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 11, 12, 1),
	BROWN_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 12, 12, 1),
	GREEN_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 13, 12, 1),
	RED_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 14, 12, 1),
	BLACK_GLASS_PANE(KindItem.BUILDING_BLOCKS, Material.STAINED_GLASS_PANE, 15, 12, 1),
	SLIME(KindItem.BUILDING_BLOCKS, Material.SLIME_BLOCK, 1, 80, 20),
	WHITE_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 8, 1),
	ORANGE_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 1, 10, 1),
	MAGENTA_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 2, 10, 1),
	LIGHT_BLUE_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 3, 10, 1),
	YELLOW_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 4, 10, 1),
	LIME_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 5, 10, 1),
	PINK_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 6, 10, 1),
	GRAY_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 7, 10, 1),
	LIGHT_GRAY_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 8, 10, 1),
	CYAN_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 9, 10, 1),
	PURPLE_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 10, 10, 1),
	BLUE_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 11, 10, 1),
	BROWN_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 12, 10, 1),
	GREEN_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 13, 10, 1),
	RED_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 14, 10, 1),
	BLACK_CARPET(KindItem.BUILDING_BLOCKS, Material.CARPET, 15, 10, 1),
	SPRUCE_FENCE(KindItem.BUILDING_BLOCKS, Material.SPRUCE_FENCE, 30, 2),
	BIRCH_FENCE(KindItem.BUILDING_BLOCKS, Material.BIRCH_FENCE, 30, 4),
	JUNGLE_FENCE(KindItem.BUILDING_BLOCKS, Material.JUNGLE_FENCE, 30, 4),
	DARK_FENCE(KindItem.BUILDING_BLOCKS, Material.DARK_OAK_FENCE, 30, 4),
	ACACIA_FENCE(KindItem.BUILDING_BLOCKS, Material.ACACIA_FENCE, 30, 4),
	END_ROD(KindItem.BUILDING_BLOCKS, Material.END_ROD, 50, 10),
	CHORUS_PLANT(KindItem.BUILDING_BLOCKS, Material.CHORUS_PLANT, 20, 1),
	CHORUS_FLOWER(KindItem.BUILDING_BLOCKS, Material.CHORUS_FLOWER, 20, 1),
	WHITE_SHULKER(KindItem.BUILDING_BLOCKS, Material.WHITE_SHULKER_BOX, 100, 10),
	ORANGE_SHULKER(KindItem.BUILDING_BLOCKS, Material.ORANGE_SHULKER_BOX, 120, 20),
	MAGENTA_SHULKER(KindItem.BUILDING_BLOCKS, Material.MAGENTA_SHULKER_BOX, 120, 20),
	LIGHT_BLUE_SHULKER(KindItem.BUILDING_BLOCKS, Material.LIGHT_BLUE_SHULKER_BOX, 120, 20),
	YELLOW_SHULKER(KindItem.BUILDING_BLOCKS, Material.YELLOW_SHULKER_BOX, 120, 20),
	LIME_SHULKER(KindItem.BUILDING_BLOCKS, Material.LIME_SHULKER_BOX, 120, 20),
	PINK_SHULKER(KindItem.BUILDING_BLOCKS, Material.PINK_SHULKER_BOX, 120, 20),
	GRAY_SHULKER(KindItem.BUILDING_BLOCKS, Material.GRAY_SHULKER_BOX, 120, 20),
	LIGHT_GRAY_SHULKER(KindItem.BUILDING_BLOCKS, Material.SILVER_SHULKER_BOX, 120, 20),
	CYAN_SHULKER(KindItem.BUILDING_BLOCKS, Material.CYAN_SHULKER_BOX, 120, 20),
	PURPLE_SHULKER(KindItem.BUILDING_BLOCKS, Material.PURPLE_SHULKER_BOX, 120, 20),
	BLUE_SHULKER(KindItem.BUILDING_BLOCKS, Material.BLUE_SHULKER_BOX, 120, 20),
	BROWN_SHULKER(KindItem.BUILDING_BLOCKS, Material.BROWN_SHULKER_BOX, 120, 20),
	GREEN_SHULKER(KindItem.BUILDING_BLOCKS, Material.GREEN_SHULKER_BOX, 120, 20),
	RED_SHULKER(KindItem.BUILDING_BLOCKS, Material.RED_SHULKER_BOX, 120, 20),
	BLACK_SHULKER(KindItem.BUILDING_BLOCKS, Material.BLACK_SHULKER_BOX, 120, 20),
	WHITE_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.WHITE_GLAZED_TERRACOTTA, 40, 8),
	ORANGE_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.ORANGE_GLAZED_TERRACOTTA, 40, 8),
	MAGENTA_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.MAGENTA_GLAZED_TERRACOTTA, 40, 8),
	LIGHT_BLUE_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.LIGHT_BLUE_GLAZED_TERRACOTTA, 40, 8),
	YELLOW_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.YELLOW_GLAZED_TERRACOTTA, 40, 8),
	LIME_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.LIME_GLAZED_TERRACOTTA, 40, 8),
	PINK_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.PINK_GLAZED_TERRACOTTA, 40, 8),
	GRAY_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.GRAY_GLAZED_TERRACOTTA, 40, 8),
	LIGHT_GRAY_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.SILVER_GLAZED_TERRACOTTA, 40, 8),
	CYAN_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.CYAN_GLAZED_TERRACOTTA, 40, 8),
	PURPLE_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.PURPLE_GLAZED_TERRACOTTA, 40, 8),
	BLUE_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.BLUE_GLAZED_TERRACOTTA, 40, 8),
	BROWN_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.BROWN_GLAZED_TERRACOTTA, 40, 8),
	GREEN_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.GREEN_GLAZED_TERRACOTTA, 40, 8),
	RED_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.RED_GLAZED_TERRACOTTA, 40, 8),
	BLACK_GLAZED_TERRACOTTA(KindItem.BUILDING_BLOCKS, Material.BLACK_GLAZED_TERRACOTTA, 40, 8),
	
	/*
	 * > Type: Food items
	 */
	APPLE(KindItem.FOODSTUFFS, Material.APPLE, 25, 1),
	MUSHROOM_SOUP(KindItem.FOODSTUFFS, Material.MUSHROOM_SOUP, 20, 2),
	BREAD(KindItem.FOODSTUFFS, Material.BREAD, 40, 20),
	RAW_BEEF(KindItem.FOODSTUFFS, Material.RAW_BEEF, 5, 1),
	COOKED_BEEF(KindItem.FOODSTUFFS, Material.COOKED_BEEF, 25, 10),
	GOLDEN_APPLE(KindItem.FOODSTUFFS, Material.GOLDEN_APPLE, 120, 10),
	BLOCK_APPLE(KindItem.FOODSTUFFS, Material.GOLDEN_APPLE, 1, 720, 90),
	RAW_FISH(KindItem.FOODSTUFFS, Material.RAW_FISH, 5, 1),
	RAW_SALMON(KindItem.FOODSTUFFS, Material.RAW_FISH, 1, 20, 5),
	CLOWN_FISH(KindItem.FOODSTUFFS, Material.RAW_FISH, 2, 20, 5),
	PUFFER_FISH(KindItem.FOODSTUFFS, Material.RAW_FISH, 3 , 20, 5),
	COOKED_FISH(KindItem.FOODSTUFFS, Material.COOKED_FISH, 25, 5),
	COOKED_SALMON(KindItem.FOODSTUFFS, Material.COOKED_FISH, 1, 25, 5),
	CAKE(KindItem.FOODSTUFFS, Material.CAKE, 20, 5),
	COOKIE(KindItem.FOODSTUFFS, Material.COOKIE, 10, 1),
	MELON(KindItem.FOODSTUFFS, Material.MELON, 40, 5),
	RAW_CHICKEN(KindItem.FOODSTUFFS, Material.RAW_CHICKEN, 5, 1),
	COOKED_CHICKEN(KindItem.FOODSTUFFS, Material.COOKED_CHICKEN, 15, 2),
	ROTTEN_FLESH(KindItem.FOODSTUFFS, Material.ROTTEN_FLESH, 5, 1),
	SPIDER_EYE(KindItem.FOODSTUFFS, Material.SPIDER_EYE, 5, 1),
	BAKED_POTATO(KindItem.FOODSTUFFS, Material.BAKED_POTATO, 10, 5),
	POISONOUS_POTATO(KindItem.FOODSTUFFS, Material.POISONOUS_POTATO, 5, 1),
	PUMPKIN_PIE(KindItem.FOODSTUFFS, Material.PUMPKIN_PIE, 25, 10),
	RABBIT(KindItem.FOODSTUFFS, Material.RABBIT, 5, 1),
	COOKED_RABBIT(KindItem.FOODSTUFFS, Material.COOKED_RABBIT, 25, 2),
	RABBIT_STEW(KindItem.FOODSTUFFS, Material.RABBIT_STEW, 25, 2),
	MUTTON(KindItem.FOODSTUFFS, Material.MUTTON, 5, 1),
	COOKED_MUTTON(KindItem.FOODSTUFFS, Material.COOKED_MUTTON, 15, 2),
	BEETROOT(KindItem.FOODSTUFFS, Material.BEETROOT, 10, 2),
	BEETROOT_SOUP(KindItem.FOODSTUFFS, Material.BEETROOT_SOUP, 20, 2),
	CARROT(KindItem.FOODSTUFFS, Material.CARROT, 20, 2),
	POTATO(KindItem.FOODSTUFFS, Material.POTATO, 20, 2),
	
	/*
	 * > Type: Armors items
	 */
	
	LEATHER_HELMET(KindItem.ARMORS, Material.LEATHER_HELMET, 50, 8),
	LEATHER_CHESTPLATE(KindItem.ARMORS, Material.LEATHER_CHESTPLATE, 60, 9),
	LEATHER_LEGGINGS(KindItem.ARMORS, Material.LEATHER_LEGGINGS, 70, 9),
	LEATHER_BOOTS(KindItem.ARMORS, Material.LEATHER_BOOTS, 70, 2),
	WOOD_SWORD(KindItem.ARMORS, Material.WOOD_SWORD, 15, 2),
	BOW(KindItem.ARMORS, Material.BOW, 15, 5),
	ARROW(KindItem.ARMORS, Material.ARROW, 25, 2),
	CHAINMAIL_HELMET(KindItem.ARMORS, Material.CHAINMAIL_HELMET, 50, 10),
	CHAINMAIL_CHESTPLATE(KindItem.ARMORS, Material.CHAINMAIL_CHESTPLATE, 60, 10),
	CHAINMAIL_LEGGINGS(KindItem.ARMORS, Material.CHAINMAIL_LEGGINGS, 80, 10),
	CHAINMAIL_BOOTS(KindItem.ARMORS, Material.CHAINMAIL_BOOTS, 80, 10),
	STONE_SWORD(KindItem.ARMORS, Material.STONE_SWORD, 15, 5),
	IRON_HELMET(KindItem.ARMORS, Material.IRON_HELMET, 70, 12),
	IRON_CHESTPLATE(KindItem.ARMORS, Material.IRON_CHESTPLATE, 80, 12),
	IRON_LEGGINGS(KindItem.ARMORS, Material.IRON_LEGGINGS, 80, 12),
	IRON_BOOTS(KindItem.ARMORS, Material.IRON_BOOTS, 80, 12),
	IRON_SWORD(KindItem.ARMORS, Material.IRON_SWORD, 80, 10),
	SHIELD(KindItem.ARMORS, Material.SHIELD, 40, 5),
	GOLD_HELMET(KindItem.ARMORS, Material.GOLD_HELMET, 50, 5),
	GOLD_CHESTPLATE(KindItem.ARMORS, Material.GOLD_CHESTPLATE, 60, 5),
	GOLD_LEGGINGS(KindItem.ARMORS, Material.GOLD_LEGGINGS, 80, 5),
	GOLD_BOOTS(KindItem.ARMORS, Material.GOLD_BOOTS, 60, 5),
	GOLD_SWORD(KindItem.ARMORS, Material.GOLD_SWORD, 20, 2),
	DIAMOND_HELMET(KindItem.ARMORS, Material.DIAMOND_HELMET, 130, 15),
	DIAMOND_CHESTPLATE(KindItem.ARMORS, Material.DIAMOND_CHESTPLATE, 140, 16),
	DIAMOND_LEGGINGS(KindItem.ARMORS, Material.DIAMOND_LEGGINGS, 150, 16),
	DIAMOND_BOOTS(KindItem.ARMORS, Material.DIAMOND_BOOTS, 130, 15),
	DIAMOND_SWORD(KindItem.ARMORS, Material.DIAMOND_SWORD, 100, 10),
	
	/*
	 * > Type: Tools items
	 */
	IRON_SPADE(KindItem.TOOLS, Material.IRON_SPADE, 25,4),
	IRON_PICKAXE(KindItem.TOOLS, Material.IRON_PICKAXE, 30, 5),
	IRON_AXE(KindItem.TOOLS, Material.IRON_AXE, 30, 5),
	FLINT_AND_STEEL(KindItem.TOOLS, Material.FLINT_AND_STEEL, 20, 2),
	WOOD_SPADE(KindItem.TOOLS, Material.WOOD_SPADE, 6, 1),
	WOOD_PICKAXE(KindItem.TOOLS, Material.WOOD_PICKAXE, 7, 1),
	WOOD_AXE(KindItem.TOOLS, Material.WOOD_AXE, 7, 1),
	STONE_SPADE(KindItem.TOOLS, Material.STONE_SPADE, 20, 2),
	STONE_PICKAXE(KindItem.TOOLS, Material.STONE_PICKAXE, 20, 2),
	STONE_AXE(KindItem.TOOLS, Material.STONE_AXE, 20, 2),
	DIAMOND_SPADE(KindItem.TOOLS, Material.DIAMOND_SPADE, 140, 20),
	DIAMOND_PICKAXE(KindItem.TOOLS, Material.DIAMOND_PICKAXE, 150, 30),
	DIAMOND_AXE(KindItem.TOOLS, Material.DIAMOND_AXE, 150, 30),
	GOLD_SPADE(KindItem.TOOLS, Material.GOLD_SPADE, 25, 4),
	GOLD_PICKAXE(KindItem.TOOLS, Material.GOLD_PICKAXE, 28, 4),
	GOLD_AXE(KindItem.TOOLS, Material.GOLD_AXE, 28, 4),
	WOOD_HOE(KindItem.TOOLS, Material.WOOD_HOE, 7, 1),
	STONE_HOE(KindItem.TOOLS, Material.STONE_HOE, 20, 2),
	IRON_HOE(KindItem.TOOLS, Material.IRON_HOE, 26, 3),
	DIAMOND_HOE(KindItem.TOOLS, Material.DIAMOND_HOE, 100, 20),
	GOLD_HOE(KindItem.TOOLS, Material.GOLD_HOE, 25, 3),
	COMPASS(KindItem.TOOLS, Material.COMPASS, 30, 5),
	FISHING_ROD(KindItem.TOOLS, Material.FISHING_ROD, 10, 1),
	WATCH(KindItem.TOOLS, Material.WATCH, 100, 10),
	SHEARS(KindItem.TOOLS, Material.SHEARS, 20, 2),
	LEASH(KindItem.TOOLS, Material.LEASH, 34, 2),
	NAME_TAG(KindItem.TOOLS, Material.NAME_TAG, 180, 35),

	
	; 
	
	public KindItem getKind() {
		return kind;
	}

	public void setKind(KindItem kind) {
		this.kind = kind;
	}

	private Material material;
	private int data;
	private int priceBuy;
	private int priceSell;
	
	private KindItem kind;
	

	AdminShopItem(KindItem kind, Material material, int priceBuy, int priceSell){
		
		this.kind = kind;
		
		this.material = material;
		this.data = 0;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
		
	}
	
	AdminShopItem(KindItem kind, Material material, int data, int priceBuy, int priceSell){
		
		this.kind = kind;
		
		this.material = material;
		this.data = data;
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;

		
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(int priceBuy) {
		this.priceBuy = priceBuy;
	}

	public int getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(int priceSell) {
		this.priceSell = priceSell;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public static int getBuyPriceByMaterial (Material materia){
			for(AdminShopItem asi : AdminShopItem.values()){
				if(asi.getMaterial().equals(materia)){
					return asi.getPriceBuy();
				}
			}
			return 0;
	}
	
	public static int getSellPriceByMaterial (Material materia){
		for(AdminShopItem asi : AdminShopItem.values()){
			if(asi.getMaterial().equals(materia)){
				return asi.getPriceSell();
			}
		}
		return 0;
}
}
