package net.omniblock.shop.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.WordUtils;
import org.bukkit.Material;

public enum ItemNameUtils {
   
	UNKNOW("item"),
    ACACIA_DOOR("puerta: acacia"),
    ACACIA_DOOR_ITEM("puerta: acacia"),
    ACACIA_FENCE("valla: acacia"),
    ACACIA_FENCE_GATE("valla: acacia"),
    ACACIA_STAIRS("escalon: acacia"),
    ACTIVATOR_RAIL("ra�l activador"),
    AIR("aire"),
    ANVIL("yunque"),
    APPLE("manzana"),
    ARMOR_STAND("maniqu�"),
    ARROW("flecha"),
    BAKED_POTATO("papa horneada"),
    BANNER("estandarte"),
    BARRIER("barrera"),
    BEACON("faro"),
    BED("cama"),
    BED_BLOCK("bloque de cama"),
    BEDROCK("piedra madre"),
    BIRCH_DOOR("puerta: abedul"),
    BIRCH_DOOR_ITEM("puerta: abedul"),
    BIRCH_FENCE("valla: abedul"),
    BIRCH_FENCE_GATE("valla: abedul"),
    BIRCH_WOOD_STAIRS("escalon: abedul"),
    BLAZE_POWDER("polvo de blaze"),
    BLAZE_ROD("vara de blaze"),
    BOAT("bote"),
    BONE("hueso"),
    BOOK("libro"),
    BOOK_AND_QUILL("libro y pluma"),
    BOOKSHELF("librero"),
    BOW("arco"),
    BOWL("taz�n"),
    BREAD("pan"),
    BREWING_STAND("mesa pociones"),
    BREWING_STAND_ITEM("mesa pociones"),
    BRICK("ladrillo"),
    BRICK_STAIRS("escalon: ladrillos"),
    BROWN_MUSHROOM("champi�on"),
    BUCKET("cubo"),
    BURNING_FURNACE("horno"),
    CACTUS("cactus"),
    CAKE("pastel"),
    CAKE_BLOCK("pastel"),
    CARPET("alfombra"),
    CARROT("zanahoria"),
    CARROT_ITEM("zanahoria"),
    CARROT_STICK("ca�a zanahoria"),
    CAULDRON("caldero"),
    CAULDRON_ITEM("caldero"),
    CHAINMAIL_BOOTS("botas: malla"),
    CHAINMAIL_CHESTPLATE("peto: malla"),
    CHAINMAIL_HELMET("casco: malla"),
    CHAINMAIL_LEGGINGS("grebas: malla"),
    CHEST("cofre"),
    CLAY("arcilla"),
    CLAY_BALL("bola de arcilla"),
    CLAY_BRICK("ladrillo de arcilla"),
    COAL("carb�n"),
    COAL_BLOCK("bloque: carb�n"),
    COAL_ORE("mena: carb�n"),
    COBBLE_WALL("muro de roca"),
    COBBLESTONE("roca"),
    COBBLESTONE_STAIRS("escalon: roca"),
    COCOA("cacao"),
    COMMAND("bloque comandos"),
    COMPASS("br�jula"),
    COOKED_BEEF("filete"),
    COOKED_CHICKEN("pollo cocinado"),
    COOKED_FISH("pescado cocinado"),
    COOKIE("galleta"),
    CROPS("cosechass"),
    DARK_OAK_DOOR("puerta: roble osc"),
    DARK_OAK_DOOR_ITEM("puerta: roble osc"),
    DARK_OAK_FENCE("valla: roble osc"),
    DARK_OAK_FENCE_GATE("valla: roble osc"),
    DARK_OAK_STAIRS("escalon: roble osc"),
    DAYLIGHT_DETECTOR("sensor de luz"),
    DEAD_BUSH("arbusto seco"),
    DETECTOR_RAIL("ra�l detector"),
    DIAMOND("diamante"),
    DIAMOND_AXE("hacha: diamante"),
    DIAMOND_BARDING("armadura: caballo"),
    DIAMOND_BLOCK("bloque: diamante"),
    DIAMOND_BOOTS("botas: diamante"),
    DIAMOND_CHESTPLATE("peto: diamante"),
    DIAMOND_HELMET("casco: diamante"),
    DIAMOND_HOE("azada: diamante"),
    DIAMOND_LEGGINGS("grebas: diamante"),
    DIAMOND_ORE("mena: diamante"),
    DIAMOND_PICKAXE("pico: diamante"),
    DIAMOND_SPADE("pala: diamante"),
    DIAMOND_SWORD("espada: diamante"),
    DIODE("repetidor"),
    DIODE_BLOCK_OFF("repetidor"),
    DIODE_BLOCK_ON("repetidor"),
    DIRT("tierra"),
    DISPENSER("dispensador"),
    DOULBE_PLANT("doble planta"),
    DOUBLE_STEP("doble losa"),
    DOUBLE_STONE_SLAB2("doble losa"),
    DRAGON_EGG("huevo de dragon"),
    DROPPER("soltador"),
    EGG("huevo"),
    EMERALD("esmeralda"),
    EMERALD_BLOCK("bloque: esmeralda"),
    EMERALD_ORE("mena: esmeralda"),
    EMPTY_MAP("mapa vacio"),
    ENCHANTED_BOOK("libro encantado"),
    ENCHANTMENT_TABLE("mesa de encantanto"),
    ENDER_CHEST("cofre de ender"),
    ENDER_PEARL("perla de ender"),
    ENDER_PORTAL("portal al end"),
    ENDER_PORTAL_FRAME("portal al end"),
    ENDER_STONE("piedra del end"),
    EXP_BOTTLE("experiencia"),
    EXPLOSIVE_MINECART("vag�n con tnt"),
    EYE_OF_ENDER("ojo del en"),
    FEATHER("pluma"),
    FENCE("valla"),
    FENCE_GATE("puerta de valla"),
    FERMENTED_SPIDER_EYE("ojo fermentado"),
    FIRE("fuego"),
    FIREBALL("bola de fuego"),
    FIREWORK("cohete"),
    FIREWORK_CHARGE("p�lvora"),
    FISHING_ROD("ca�a de pescar"),
    FLINT("pedernal"),
    FLINT_AND_STEEL("encendedor"),
    FLOWER_POT("maceta"),
    FLOWER_POT_ITEM("maceta"),
    FURNACE("horno"),
    GHAST_TEAR("l�grima de ghast"),
    GLASS("vidrio"),
    GLASS_BOTTLE("frasco"),
    GLOWING_REDSTONE_ORE("mena: redstone"),
    GLOWSTONE("piedra luminosa"),
    GLOWSTONE_DUST("polvo luminoso"),
    GOLD_AXE("hacha: oro"),
    GOLD_BARDING("armadura: caballo"),
    GOLD_BLOCK("bloque: oro"),
    GOLD_BOOTS("botas: oro"),
    GOLD_CHESTPLATE("peto: oro"),
    GOLD_HELMET("casco: oro"),
    GOLD_HOE("azada: oro"),
    GOLD_INGOT("lingote de oro"),
    GOLD_LEGGINGS("grebas: oro"),
    GOLD_NUGGET("pepita de oro"),
    GOLD_ORE("mena: oro"),
    GOLD_PICKAXE("pico: oro"),
    GOLD_PLATE("placa de oro"),
    GOLD_RECORD("music disc - 13"),
    GOLD_SPADE("pala: oro"),
    GOLD_SWORD("espada: oro"),
    GOLDEN_APPLE("manzana dorada"),
    GOLDEN_CARROT("zanahoria dorada"),
    GRASS("pasto"),
    GRAVEL("grava"),
    GREEN_RECORD("disco - cat"),
    GRILLED_PORK("chuleta cocinada"),
    HARD_CLAY("arcilla dura"),
    HAY_BLOCK("heno"),
    HOPPER("tolva"),
    HOPPER_MINECART("vag�n con tolva"),
    HUGE_MUSHROOM_1("champi��n"),
    HUGE_MUSHROOM_2("champi��n"),
    ICE("hielo"),
    INK_SACK("saco de tinta"),
    IRON_AXE("hacha: hierro"),
    IRON_BARDING("armadura: caballo"),
    IRON_BLOCK("bloque: hierro"),
    IRON_BOOTS("botas: hierro"),
    IRON_CHESTPLATE("peto: hierro"),
    IRON_DOOR("puerta: hierro"),
    IRON_DOOR_BLOCK("puerta: hierro"),
    IRON_FENCE("barras de hierro"),
    IRON_HELMET("casco: hierro"),
    IRON_HOE("azada: hierro"),
    IRON_INGOT("lingote de hierro"),
    IRON_LEGGINGS("grebas: hierro"),
    IRON_ORE("mena: hierro"),
    IRON_PICKAXE("pico: hierro"),
    IRON_PLATE("placa de hierro"),
    IRON_SPADE("pala: hierro"),
    IRON_SWORD("espada: hierro"),
    ITEM_FRAME("marco"),
    JACK_O_LANTERN("calabaza"),
    JUKEBOX("tocadiscos"),
    JUNGLE_DOOR("puerta: jungla"),
    JUNGLE_DOOR_ITEM("puerta: jungla"),
    JUNGLE_FENCE("valla: jungla"),
    JUNGLE_FENCE_GATE("valla: jungla"),
    JUNGLE_WOOD_STAIRS("escalon: jungla"),
    LADDER("escalera"),
    LAPIS_BLOCK("bloque: lapis"),
    LAPIS_ORE("mena: lapisl�zuli"),
    LAVA("lava"),
    LAVA_BUCKET("cubo de lava"),
    LEASH("correa"),
    LEATHER("cuero"),
    LEATHER_BOOTS("botas: cuero"),
    LEATHER_CHESTPLATE("peto: cuero"),
    LEATHER_HELMET("casco: cuero"),
    LEATHER_LEGGINGS("grebas: cuero"),
    LEAVES("hojas"),
    LEAVES_2("hojas"),
    LEVER("palanca"),
    LOG("tronco"),
    LOG_2("tronco"),
    LONG_GRASS("arbusto"),
    MAGMA_CREAM("crema de magma"),
    MAP("mapa"),
    MELON("sand�a"),
    MELON_BLOCK("bloque: sand�a"),
    MELON_SEEDS("semilla de sand�a"),
    MELON_STEM("ra�z de sand�a"),
    MILK_BUCKET("cubo de leche"),
    MINECART("vag�n"),
    MOB_SPAWNER("spawner"),
    MONSTER_EGG("huevo spawner"),
    MONSTER_EGGS("bloque: lepisma"),
    MOSSY_COBBLESTONE("roca musgosa"),
    MUSHROOM_SOUP("sopa de hongos"),
    MYCEL("micelio"),
    NAME_TAG("etiqueta"),
    NETHER_BRICK("ladrillo de nether"),
    NETHER_BRICK_ITEM("ladrillo de nether"),
    NETHER_BRICK_STAIRS("escalon: nether"),
    NETHER_FENCE("valla: nether"),
    NETHER_STALK("verruga"),
    NETHER_STAR("estrella"),
    NETHER_WARTS("verruga"),
    NETHERRACK("netherrack"),
    NOTE_BLOCK("bloque musical"),
    OBSIDIAN("obsidiana"),
    PAINTING("cuadro"),
    PAPER("papel"),
    PISTON_BASE("pist�n"),
    PISTON_EXTENSION("pist�n extension"),
    PISTON_MOVING_PIECE("moving pist�n"),
    PISTON_STICK_BASE("pist�n pegajoso"),
    POISONOUS_POTATO("papa venenosa"),
    PORK("chuleta cruda"),
    PORTAL("portal"),
    POTATO("papa"),
    POTATO_ITEM("papa"),
    POTION("poci�n"),
    POWERED_MINECART("vag�n con horno"),
    POWERED_RAIL("ra�l activado"),
    PRISMARINE("prismarina"),
    PRISMARINE_CRYSTALS("cristal prismarina"),
    PRISMARINE_SHARD("pieza prismarina"),
    PUMPKIN("calabaza"),
    PUMPKIN_PIE("pie de calabaza"),
    PUMPKIN_SEEDS("semilla calabaza"),
    PUMPKIN_STEM("calabaza"),
    QUARTZ("cuarzo"),
    QUARTZ_BLOCK("bloque: cuarzo"),
    QUARTZ_ORE("mena: cuarzo"),
    QUARTZ_STAIRS("escaleras"),
    RABBIT("conejo"),
    RABBIT_FOOT("pie de conejo"),
    RABBIT_HIDE("piel de conejo"),
    RABBIT_STEW("estofado"),
    RAILS("ra�l"),
    RAW_BEEF("filete crudo"),
    RAW_CHICKEN("pollo crudo"),
    RAW_FISH("pescado crudo"),
    RECORD_10("disco - ward"),
    RECORD_11("disco - 11"),
    RECORD_12("disco - wait"),
    RECORD_3("disco - blocks"),
    RECORD_4("disco - chirp"),
    RECORD_5("disco - far"),
    RECORD_6("disco - mall"),
    RECORD_7("disco - mellohi"),
    RECORD_8("disco - stal"),
    RECORD_9("disco - strad"),
    RED_MUSHROOM("champi��n"),
    RED_ROSE("rosa roja"),
    RED_SANDSTONE("arenisca roja"),
    RED_SANDSTONE_STAIRS("escalon: arenisca"),
    REDSTONE("redstone"),
    REDSTONE_BLOCK("bloque: redstone"),
    REDSTONE_COMPARATOR("comparador"),
    REDSTONE_COMPARATOR_OFF("compradador"),
    REDSTONE_COMPARATOR_ON("comparador"),
    REDSTONE_LAMP_OFF("l�mpara"),
    REDSTONE_LAMP_ON("l�mpara"),
    REDSTONE_ORE("mena: redstone"),
    REDSTONE_TORCH_OFF("antorcha: redstone"),
    REDSTONE_TORCH_ON("antorcha: redstone"),
    REDSTONE_WIRE("redstone"),
    ROTTEN_FLESH("carne de zombie"),
    SADDLE("montura"),
    SAND("arena"),
    SANDSTONE("arenisca"),
    SANDSTONE_STAIRS("escalon: arenisca"),
    SAPLING("brote de �rbol"),
    SEA_LANTERN("linterna de agua"),
    SEEDS("semillas"),
    SHEARS("tijeras"),
    SIGN("cartel"),
    SIGN_POST("cartel"),
    SKULL("cabeza"),
    SKULL_ITEM("cabeza"),
    SLIME_BLOCK("bloque: slime"),
    SMOOTH_BRICK("ladrillos"),
    SMOOTH_STAIRS("escalon"),
    SNOW("nieve"),
    SNOW_BALL("bola de nieve"),
    SNOW_BLOCK("bloque: nieve"),
    SOIL("tierra arada"),
    SOUL_SAND("arena de almas"),
    SPECKLED_MELON("sand�a reluciente"),
    SPIDER_EYE("ojo de ara�a"),
    SPONGE("esponja"),
    SPRUCE_DOOR("puerta: pino"),
    SPRUCE_DOOR_ITEM("puerta: pino"),
    SPRUCE_FENCE("valla: pino"),
    SPRUCE_FENCE_GATE("valla: pino"),
    SPRUCE_WOOD_STAIRS("escalon: pino"),
    STAINED_CLAY("arcilla tintada"),
    STAINED_GLASS("cristal tintado"),
    STAINED_GLASS_PANE("panel tintado"),
    STANDING_BANNER("estandarte"),
    STATIONARY_LAVA("lava est�tica"),
    STEP("losa"),
    STICK("palo"),
    STONE("piedra"),
    STONE_AXE("hacha: piedra"),
    STONE_BUTTON("bot�n"),
    STONE_HOE("azada: piedra"),
    STONE_PICKAXE("pico: piedra"),
    STONE_PLATE("placa: piedra"),
    STONE_SLAB2("losa: piedra"),
    STONE_SPADE("pala: piedra"),
    STONE_SWORD("espada: piedra"),
    STORAGE_MINECART("vag�n"),
    STRING("hilo"),
    SUGAR("azucar"),
    SUGAR_CANE("ca�a de azucar"),
    SUGAR_CANE_BLOCK("ca�a de azucar"),
    SULPHUR("p�lvora"),
    THIN_GLASS("panel de cristal"),
    TNT("tnt"),
    TORCH("antorcha"),
    TRAP_DOOR("trampilla"),
    TRAPPED_CHEST("cofre trampa"),
    TRIPWIRE("gancho"),
    TRIPWIRE_HOOK("gancho"),
    VINE("enredadera"),
    WALL_BANNER("estandarte"),
    WALL_SIGN("cartel"),
    WATCH("reloj"),
    WATER("agua"),
    WATER_BUCKET("cubo de agua"),
    WATER_LILY("nen�far"),
    WEB("telara�a"),
    WHEAT("trigo"),
    WOOD("madera"),
    WOOD_AXE("hacha: madera"),
    WOOD_BUTTON("bot�n"),
    WOOD_DOOR("puerta: madera"),
    WOOD_DOUBLE_STEP("doble losa"),
    WOOD_HOE("azada: madera"),
    WOOD_PICKAXE("pico: madera"),
    WOOD_PLATE("placa: madera"),
    WOOD_SPADE("pala: madera"),
    WOOD_STAIRS("escalon: madera"),
    WOOD_STEP("losa: madera"),
    WOOD_SWORD("espada: madera"),
    WOODEN_DOOR("puerta: madera"),
    WOOL("lana"),
    WORKBENCH("mesa de crafteo"),
    WRITTEN_BOOK("libro escrito"),
    YELLOW_FLOWER("diente de le�n"),
    END_BRICKS("ladrillos"),
    PURPUR_BLOCK("p�rpur"),
    PURPUR_PILLAR("pilar"),
    PUPUR_STAIRS("escalon: p�rpur"),
    PURPUR_SLAB("losa: p�rpur"),
    KNOWLEDGE_BOOK("gran libro"),
    IRON_NUGGET("pepita de hierro"),
    SHULKER_SHELL("caparaz�n"),
    TOTEM("t�tem"),
    BOAT_DARK_OAK("bote: roble oscuro"),
    BOAT_ACACIA("bote: acacia"),
    BOAT_JUNGLE("bote: jungla"),
    BOAT_BIRCH("bote: abedul"),
    BOAT_SPRUCE("bote: pino"),
    ELYTRA("�litros"),
    SHIELD("escudo"),
    LINGERING_POTION("poci�n persistente"),
    TIPPED_ARROW("flecha quimica"),
    SPECTRAL_ARROW("flecha espectral"),
    SPLASH_POTION("poci�n splash"),
    DRAGONS_BREATH("aliento de drag�n"),
    BEETROOT_SOUP("sopa de remolacha"),
    BEETROOT_SEEDS("semillas"),
    BEETROOT("remolacha"),
    CHORUS_FRUIT_POPPED("chorus"),
    CHORUS_FRUIT("chorus"),
    END_CRYSTAL("cristal del end"),
    COOKED_MUTTON("cordero cocinado"),
    MUTTON("cordero"),
    COMMAND_MINECART("vag�n: comandos"),
    COOKED_RABBIT("conejo cocinado"),
    SLIME_BALL("bola de slime"),
    STRUCTURE_BLOCK("estructura"),
    CONCRETE_POWDER("cemento"),
    CONCRETE("cemento"),
    OBSERVER("observador"),
    STRUCTURE_VOID("estructura"),
    BONE_BLOCK("bloque de hueso"),
    RED_NETHER_BRICK("ladrillos rojos"),
    NETHER_WART_BLOCK("verruga"),
    MAGMA("bloque: magma"),
    FROSTED_ICE("hielo compacto"),
    COMMAND_CHAIN("comandos"),
	COMMAND_REPEATING("comandos"),
	END_GATEWAY("transmisor"),
	GRASS_PATH("camino"),
	BEETROOT_BLOCK("remolacha"),
	PURPUR_DOUBLE_SLAB("losa doble"),
	PURPUR_STAIRS("escaleras"),
	CHORUS_FLOWER("flor chorus"),
	CHORUS_PLANT("planta chorus"),
	END_ROD("vara del end"),
	DAYLIGHT_DETECTOR_INVERTED("detector nocturno"),
	DOUBLE_PLANT("planta doble"),
	PACKED_ICE("hielo compacto"),
	STATIONARY_WATER("agua est�tica"),
	IRON_TRAPDOOR("trampilla de hierro"),
	PISTON_STICKY_BASE("pist�n pegajoso"),
    WHITE_SHULKER_BOX("caja de shulker"),
    ORANGE_SHULKER_BOX("caja de shulker"),
    MAGENTA_SHULKER_BOX("caja de shulker"),
    LIGHT_BLUE_SHULKER_BOX("caja de shulker"),
    YELLOW_SHULKER_BOX("caja de shulker"),
    LIME_SHULKER_BOX("caja de shulker"),
    PINK_SHULKER_BOX("caja de shulker"),
    GRAY_SHULKER_BOX("caja de shulker"),
    SILVER_SHULKER_BOX("caja de shulker"),
    CYAN_SHULKER_BOX("caja de shulker"),
    PURPLE_SHULKER_BOX("caja de shulker"),
    BLUE_SHULKER_BOX("caja de shulker"),
    BROWN_SHULKER_BOX("caja de shulker"),
    GREEN_SHULKER_BOX("caja de shulker"),
    RED_SHULKER_BOX("caja de shulker"),
    BLACK_SHULKER_BOX("caja de shulker"),
    WHITE_GLAZED_TERRACOTTA("terracota #1"),
    ORANGE_GLAZED_TERRACOTTA("terracota #2"),
    MAGENTA_GLAZED_TERRACOTTA("terracota #3"),
    LIGHT_BLUE_GLAZED_TERRACOTTA("terracota #4"),
    YELLOW_GLAZED_TERRACOTTA("terracota #5"),
    LIME_GLAZED_TERRACOTTA("terracota #6"),
    PINK_GLAZED_TERRACOTTA("terracota #7"),
    GRAY_GLAZED_TERRACOTTA("terracota #8"),
    SILVER_GLAZED_TERRACOTTA("terracota #9"),
    CYAN_GLAZED_TERRACOTTA("terracota #10"),
    PURPLE_GLAZED_TERRACOTTA("terracota #11"),
    BLUE_GLAZED_TERRACOTTA("terracota #12"),
    BROWN_GLAZED_TERRACOTTA("terracota #13"),
    GREEN_GLAZED_TERRACOTTA("terracota #14"),
    RED_GLAZED_TERRACOTTA("terracota #15"),
    BLACK_GLAZED_TERRACOTTA("terracota #16"),
    
    
    ;

	private static final Map<String, ItemNameUtils> lookup = new HashMap<String, ItemNameUtils>();
	
    private final String name;

    private ItemNameUtils(final String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
    
    public static ItemNameUtils getMaterialName(Material material){
    	
    	if(lookup.size() <= 0)
    		for(ItemNameUtils itemName : values())
    			lookup.put(itemName.name(), itemName);
    	
        ItemNameUtils result = lookup.get(material.name());
        
        if(result == null)
        	result = ItemNameUtils.UNKNOW;
        
        return result;
    }
   
    public String firstUpperCased(){
        char first = Character.toUpperCase(name.charAt(0));
        return first + name.substring(1);
    }
   
    public String firstAllUpperCased(){
        return WordUtils.capitalizeFully(name);
    }

    public String allUpperCased(){
        return name.toUpperCase();
    }
    
}
