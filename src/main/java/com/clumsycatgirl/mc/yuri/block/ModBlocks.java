package com.clumsycatgirl.mc.yuri.block;

import com.clumsycatgirl.mc.yuri.YuriMod;
import com.clumsycatgirl.mc.yuri.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.checkerframework.framework.qual.Unused;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ModBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(YuriMod.MOD_ID);

	public static final DeferredBlock<Block> COMPANION_BLOCK = registerBlock("companion_block", () -> new Block(BlockBehaviour.Properties.of()
		.strength(4f)
		.requiresCorrectToolForDrops()
		.sound(SoundType.COPPER_BULB)));

	private static <T extends Block> DeferredBlock<T> registerBlock(@NotNull final String name, @NotNull final Supplier<T> block) {
		DeferredBlock<T> registeredBlock = BLOCKS.register(name, block);
		registerBlockItem(name, registeredBlock);
		return registeredBlock;
	}

	private static <T extends Block> void registerBlockItem(@NotNull final String name, @NotNull final DeferredBlock<T> block) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	public static void register(@NotNull final IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
