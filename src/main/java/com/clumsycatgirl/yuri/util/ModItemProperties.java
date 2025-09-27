package com.clumsycatgirl.yuri.util;

import com.clumsycatgirl.yuri.YuriMod;
import com.clumsycatgirl.yuri.component.ModDataComponent;
import com.clumsycatgirl.yuri.item.YgoItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemProperties {
	public static void addCustomItemProperties() {
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_RECO);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_MIX);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_CLIP);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_CUE);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_RED_SEAL);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_REMIX);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_TRACK_MAKER);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_LOUDNESS_WAR);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_SYNCHRO);
		makeYgoCard(YgoItems.YGO_JUKE_JOINT_KILLER_TUNE);
		makeYgoCard(YgoItems.YGO_KILLER_TUNE_PLAYLIST);
		makeYgoCard(YgoItems.YGO_RED_NOVA);
		makeYgoCard(YgoItems.YGO_SYNCHRO_OVERTAKE);

		makeYgoCard(YgoItems.YGO_ASH_BLOSSOM_AND_JOYOUS_SPRING);
		makeYgoCard(YgoItems.YGO_GHOST_BELLE_AND_HAUNTED_MANSION);
		makeYgoCard(YgoItems.YGO_GHOST_OGRE_AND_SNOW_RABBIT);
		makeYgoCard(YgoItems.YGO_EFFECT_VEILER);
		makeYgoCard(YgoItems.YGO_MULCHARMY_FUWALOS);
		makeYgoCard(YgoItems.YGO_MULCHARMY_PURULIA);

		makeYgoCard(YgoItems.YGO_POT_OF_PROSPERITY);
		makeYgoCard(YgoItems.YGO_REINFORCEMENT_OF_THE_ARMY);

		makeYgoCard(YgoItems.YGO_K9_17_IZUNA);
		makeYgoCard(YgoItems.YGO_K9_00_LUPIS);
		makeYgoCard(YgoItems.YGO_K9_17_RIPPER);
		makeYgoCard(YgoItems.YGO_NASH_KNIGHT);
		makeYgoCard(YgoItems.YGO_VALLON_THE_SUPER_PSY_SKYBLASTER);
		makeYgoCard(YgoItems.YGO_NUMBER_104_MASQUERADE);
		makeYgoCard(YgoItems.YGO_NUMBER_C104_UMBRAL_HORROR_MASQUERADE);
		makeYgoCard(YgoItems.YGO_NUMBER_41_BAGOOSKA_THE_TERRIBLY_TIRED_TAPIR);
		makeYgoCard(YgoItems.YGO_EVILSWARM_EXCITON_KNIGHT);
		makeYgoCard(YgoItems.YGO_SUPER_STARSLAYER_TYPHON_SKY_CRISIS);
		makeYgoCard(YgoItems.YGO_DIVINE_ARSENAL_AA_ZEUS_SKY_THUNDER);
		makeYgoCard(YgoItems.YGO_HIITA_THE_FIRE_CHARMER_ABLAZE);
		makeYgoCard(YgoItems.YGO_SP_LITTLE_KNIGHT);

		makeYgoCard(YgoItems.YGO_ROCK_OF_THE_VANQUISHER);
		makeYgoCard(YgoItems.YGO_STAKE_YOUR_SOUL);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_CAESAR_VALIUS);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_DR_MAD_LOVE);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_HEAVY_BORGER);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_HOLLIE_SUE);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_JIAOLONG);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_RAZEN);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_SNOW_DEVIL);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_START);
		makeYgoCard(YgoItems.YGO_VANQUISH_SOUL_ROCKS);
	}

	private static void makeYgoCard(Item item) {
		ItemProperties.register(
			item,
			ResourceLocation.fromNamespaceAndPath(YuriMod.MOD_ID, "shown"),
			(stack, level, entity, seed) -> {
				return Boolean.TRUE.equals(stack.get(ModDataComponent.SHOWN)) ? 1f : 0f;
			});
	}

	private static <T extends Item> void makeYgoCard(DeferredItem<T> item) {
		makeYgoCard(item.get());
	}
}
