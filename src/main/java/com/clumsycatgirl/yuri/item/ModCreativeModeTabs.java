package com.clumsycatgirl.yuri.item;

import com.clumsycatgirl.yuri.YuriMod;
import com.clumsycatgirl.yuri.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YuriMod.MOD_ID);

	public static final Supplier<CreativeModeTab> YURI_ITEMS_TAB = CREATIVE_MODE_TAB.register("yurimod_items_tab",
		() -> CreativeModeTab
			.builder()
			.icon(() -> new ItemStack(ModItems.GAY.get()))
			.title(Component.translatable("creativetab.clumsycatgirl_yuri.yurimod_items"))
			.displayItems((itemDisplayParameters, output) -> {
				output.accept(ModItems.GAY);
				output.accept(ModItems.CHISEL);
				output.accept(ModItems.LESBIAN_DISC);
				output.accept(ModBlocks.COMPANION_BLOCK);
				output.accept(ModBlocks.CRACKED_COMPANION_BLOCK);
				output.accept(ModBlocks.MIMIC_BLOCK);
				output.accept(ModItems.RANDOM_PICKER);
				output.accept(ModItems.BROOM);
			})
			.build());

	public static final Supplier<CreativeModeTab> YURI_YGO_ITEMS_TAB = CREATIVE_MODE_TAB.register("yurimod_ygo_tab",
		() -> CreativeModeTab
			.builder()
			.icon(() -> new ItemStack(ModItems.YGO_Back.get()))
			.withTabsBefore(ResourceLocation.fromNamespaceAndPath(YuriMod.MOD_ID, "yurimod_items_tab"))
			.title(Component.translatable("creativetab.clumsycatgirl_yuri.yurimod_ygo"))
			.displayItems((itemDisplayParameters, output) -> {
				output.accept(ModItems.YGO_Back);
				output.accept(ModItems.YGO_KITKALLOS);
				output.accept(ModItems.YGO_SCHEIREN);
				output.accept(ModItems.YGO_MERRLI);
			})
			.build());

	public static final Supplier<CreativeModeTab> YGO_TAB = CREATIVE_MODE_TAB.register("yugioh",
		() -> CreativeModeTab
			.builder()
			.icon(() -> new ItemStack(YgoItems.YGO_KILLER_TUNE_RECO.get()))
			.withTabsBefore(ResourceLocation.fromNamespaceAndPath(YuriMod.MOD_ID, "yurimod_ygo_tab"))
			.displayItems((itemDisplayParameter, output) -> {
				output.accept(YgoItems.YGO_BACK);

				output.accept(YgoItems.YGO_KILLER_TUNE_RECO);
				output.accept(YgoItems.YGO_KILLER_TUNE_MIX);
				output.accept(YgoItems.YGO_KILLER_TUNE_CLIP);
				output.accept(YgoItems.YGO_KILLER_TUNE_CUE);
				output.accept(YgoItems.YGO_KILLER_TUNE_RED_SEAL);
				output.accept(YgoItems.YGO_KILLER_TUNE_REMIX);
				output.accept(YgoItems.YGO_KILLER_TUNE_TRACK_MAKER);
				output.accept(YgoItems.YGO_KILLER_TUNE_LOUDNESS_WAR);
				output.accept(YgoItems.YGO_KILLER_TUNE_SYNCHRO);
				output.accept(YgoItems.YGO_JUKE_JOINT_KILLER_TUNE);
				output.accept(YgoItems.YGO_KILLER_TUNE_PLAYLIST);
				output.accept(YgoItems.YGO_RED_NOVA);
				output.accept(YgoItems.YGO_SYNCHRO_OVERTAKE);

				output.accept(YgoItems.YGO_ASH_BLOSSOM_AND_JOYOUS_SPRING);
				output.accept(YgoItems.YGO_GHOST_BELLE_AND_HAUNTED_MANSION);
				output.accept(YgoItems.YGO_GHOST_OGRE_AND_SNOW_RABBIT);
				output.accept(YgoItems.YGO_EFFECT_VEILER);
				output.accept(YgoItems.YGO_MULCHARMY_FUWALOS);
				output.accept(YgoItems.YGO_MULCHARMY_PURULIA);
				output.accept(YgoItems.YGO_NIBIRU_THE_PRIMAL_BEING);

				output.accept(YgoItems.YGO_POT_OF_PROSPERITY);
				output.accept(YgoItems.YGO_REINFORCEMENT_OF_THE_ARMY);

				output.accept(YgoItems.YGO_K9_17_IZUNA);
				output.accept(YgoItems.YGO_K9_00_LUPIS);
				output.accept(YgoItems.YGO_K9_17_RIPPER);
				output.accept(YgoItems.YGO_NASH_KNIGHT);
				output.accept(YgoItems.YGO_VALLON_THE_SUPER_PSY_SKYBLASTER);
				output.accept(YgoItems.YGO_NUMBER_104_MASQUERADE);
				output.accept(YgoItems.YGO_NUMBER_C104_UMBRAL_HORROR_MASQUERADE);
				output.accept(YgoItems.YGO_NUMBER_41_BAGOOSKA_THE_TERRIBLY_TIRED_TAPIR);
				output.accept(YgoItems.YGO_EVILSWARM_EXCITON_KNIGHT);
				output.accept(YgoItems.YGO_SUPER_STARSLAYER_TYPHON_SKY_CRISIS);
				output.accept(YgoItems.YGO_DIVINE_ARSENAL_AA_ZEUS_SKY_THUNDER);
				output.accept(YgoItems.YGO_HIITA_THE_FIRE_CHARMER_ABLAZE);
				output.accept(YgoItems.YGO_SP_LITTLE_KNIGHT);

				output.accept(YgoItems.YGO_ROCK_OF_THE_VANQUISHER);
				output.accept(YgoItems.YGO_STAKE_YOUR_SOUL);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_CAESAR_VALIUS);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_DR_MAD_LOVE);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_HEAVY_BORGER);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_HOLLIE_SUE);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_JIAOLONG);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_RAZEN);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_SNOW_DEVIL);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_START);
				output.accept(YgoItems.YGO_VANQUISH_SOUL_ROCKS);
			}).build());

	public static void register(@NotNull IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
