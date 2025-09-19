package com.clumsycatgirl.mc.yuri.item;

import com.clumsycatgirl.mc.yuri.YuriMod;
import com.clumsycatgirl.mc.yuri.block.ModBlocks;
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
			.title(Component.translatable("creativetab.clumsycatgirlyurimod.yurimod_items"))
			.displayItems((itemDisplayParameters, output) -> {
				output.accept(ModItems.GAY);
				output.accept(ModItems.CHISEL);
				output.accept(ModItems.LESBIAN_DISC);
				output.accept(ModBlocks.COMPANION_BLOCK);
				output.accept(ModBlocks.CRACKED_COMPANION_BLOCK);
				output.accept(ModBlocks.MIMIC_BLOCK);
			})
			.build());

	public static final Supplier<CreativeModeTab> YURI_YGO_ITEMS_TAB = CREATIVE_MODE_TAB.register("yurimod_ygo_tab",
		() -> CreativeModeTab
			.builder()
			.icon(() -> new ItemStack(ModItems.YGO_Back.get()))
			.withTabsBefore(ResourceLocation.fromNamespaceAndPath(YuriMod.MOD_ID, "yurimod_items_tab"))
			.title(Component.translatable("creativetab.clumsycatgirlyurimod.yurimod_ygo"))
			.displayItems((itemDisplayParameters, output) -> {
				output.accept(ModItems.YGO_Back);
				output.accept(ModItems.YGO_KITKALLOS);
				output.accept(ModItems.YGO_SCHEIREN);
				output.accept(ModItems.YGO_MERRLI);
			})
			.build());

	public static void register(@NotNull IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
