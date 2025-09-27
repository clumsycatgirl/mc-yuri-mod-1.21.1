package com.clumsycatgirl.yuri.item;

import com.clumsycatgirl.yuri.YuriMod;
import com.clumsycatgirl.yuri.item.custom.YuGiOhCardItem;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

public class YgoItems {
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YuriMod.MOD_ID);

	public static final DeferredItem<Item> YGO_BACK = registerYgoCard("ygo_back");

	public static final DeferredItem<Item> YGO_KILLER_TUNE_RECO = registerYgoCard("ygo_killer_tune_reco");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_MIX = registerYgoCard("ygo_killer_tune_mix");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_CLIP = registerYgoCard("ygo_killer_tune_clip");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_CUE = registerYgoCard("ygo_killer_tune_cue");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_RED_SEAL = registerYgoCard("ygo_killer_tune_red_seal");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_REMIX = registerYgoCard("ygo_killer_tune_remix");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_TRACK_MAKER = registerYgoCard("ygo_killer_tune_track_maker");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_LOUDNESS_WAR = registerYgoCard("ygo_killer_tune_loudness_war");
	public static final DeferredItem<Item> YGO_JUKE_JOINT_KILLER_TUNE = registerYgoCard("ygo_juke_joint_killer_tune");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_SYNCHRO = registerYgoCard("ygo_killer_tune_synchro");
	public static final DeferredItem<Item> YGO_KILLER_TUNE_PLAYLIST = registerYgoCard("ygo_killer_tune_playlist");
	public static final DeferredItem<Item> YGO_RED_NOVA = registerYgoCard("ygo_red_nova");
	public static final DeferredItem<Item> YGO_SYNCHRO_OVERTAKE = registerYgoCard("ygo_synchro_overtake");

	public static final DeferredItem<Item> YGO_ASH_BLOSSOM_AND_JOYOUS_SPRING = registerYgoCard("ygo_ash_blossom_and_joyous_spring");
	public static final DeferredItem<Item> YGO_GHOST_BELLE_AND_HAUNTED_MANSION = registerYgoCard("ygo_ghost_belle_and_haunted_mansion");
	public static final DeferredItem<Item> YGO_GHOST_OGRE_AND_SNOW_RABBIT = registerYgoCard("ygo_ghost_ogre_and_snow_rabbit");
	public static final DeferredItem<Item> YGO_EFFECT_VEILER = registerYgoCard("ygo_effect_veiler");
	public static final DeferredItem<Item> YGO_MULCHARMY_FUWALOS = registerYgoCard("ygo_mulcharmy_fuwalos");
	public static final DeferredItem<Item> YGO_MULCHARMY_PURULIA = registerYgoCard("ygo_mulcharmy_purulia");
	public static final DeferredItem<Item> YGO_POT_OF_PROSPERITY = registerYgoCard("ygo_pot_of_prosperity");
	public static final DeferredItem<Item> YGO_REINFORCEMENT_OF_THE_ARMY = registerYgoCard("ygo_reinforcement_of_the_army");

	public static final DeferredItem<Item> YGO_K9_17_IZUNA = registerYgoCard("ygo_k9_17_izuna");
	public static final DeferredItem<Item> YGO_K9_00_LUPIS = registerYgoCard("ygo_k9_00_lupis");
	public static final DeferredItem<Item> YGO_K9_17_RIPPER = registerYgoCard("ygo_k9_17_ripper");
	public static final DeferredItem<Item> YGO_NASH_KNIGHT = registerYgoCard("ygo_nash_knight");
	public static final DeferredItem<Item> YGO_VALLON_THE_SUPER_PSY_SKYBLASTER = registerYgoCard("ygo_vallon_the_super_psy_skyblaster");
	public static final DeferredItem<Item> YGO_NUMBER_104_MASQUERADE = registerYgoCard("ygo_number_104_masquerade");
	public static final DeferredItem<Item> YGO_NUMBER_C104_UMBRAL_HORROR_MASQUERADE = registerYgoCard("ygo_number_c104_umbral_horror_masquerade");
	public static final DeferredItem<Item> YGO_NUMBER_41_BAGOOSKA_THE_TERRIBLY_TIRED_TAPIR = registerYgoCard("ygo_number_41_bagooska_the_terribly_tired_tapir");
	public static final DeferredItem<Item> YGO_EVILSWARM_EXCITON_KNIGHT = registerYgoCard("ygo_evilswarm_exciton_knight");
	public static final DeferredItem<Item> YGO_SUPER_STARSLAYER_TYPHON_SKY_CRISIS = registerYgoCard("ygo_super_starslayer_typhon_sky_crisis");
	public static final DeferredItem<Item> YGO_DIVINE_ARSENAL_AA_ZEUS_SKY_THUNDER = registerYgoCard("ygo_divine_arsenal_aa_zeus_sky_thunder");
	public static final DeferredItem<Item> YGO_HIITA_THE_FIRE_CHARMER_ABLAZE = registerYgoCard("ygo_hiita_the_fire_charmer_ablaze");
	public static final DeferredItem<Item> YGO_SP_LITTLE_KNIGHT = registerYgoCard("ygo_sp_little_knight");

	public static final DeferredItem<Item> YGO_ROCK_OF_THE_VANQUISHER = registerYgoCard("ygo_rock_of_the_vanquisher");
	public static final DeferredItem<Item> YGO_STAKE_YOUR_SOUL = registerYgoCard("ygo_stake_your_soul");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_CAESAR_VALIUS = registerYgoCard("ygo_vanquish_soul_caesar_valius");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_DR_MAD_LOVE = registerYgoCard("ygo_vanquish_soul_dr_mad_love");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_HEAVY_BORGER = registerYgoCard("ygo_vanquish_soul_heavy_borger");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_HOLLIE_SUE = registerYgoCard("ygo_vanquish_soul_hollie_sue");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_JIAOLONG = registerYgoCard("ygo_vanquish_soul_jiaolong");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_RAZEN = registerYgoCard("ygo_vanquish_soul_razen");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_SNOW_DEVIL = registerYgoCard("ygo_vanquish_soul_snow_devil");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_START = registerYgoCard("ygo_vanquish_soul_start");
	public static final DeferredItem<Item> YGO_VANQUISH_SOUL_ROCKS = registerYgoCard("ygo_vanquish_soul_rocks");

	public static final DeferredItem<Item> YGO_NIBIRU_THE_PRIMAL_BEING = registerYgoCard("ygo_nibiru_the_primal_being");

	public static void register(@NotNull final IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

	private static DeferredItem<Item> registerYgoCard(final String cardName) {
		return ITEMS.register(cardName, () -> new YuGiOhCardItem(cardName, new Item.Properties()
			.stacksTo(64)));
	}
}
