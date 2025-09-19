package com.clumsycatgirl.mc.yuri.item.custom;

import com.clumsycatgirl.mc.yuri.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ChiselItem extends Item {
	private static final Map<Block, Block> CHISEL_MAP = new HashMap<>() {{
		put(Blocks.STONE, Blocks.STONE_BRICKS);
		put(Blocks.END_STONE, Blocks.END_STONE_BRICKS);
		put(Blocks.DEEPSLATE, Blocks.DEEPSLATE_BRICKS);
		put(ModBlocks.COMPANION_BLOCK.get(), ModBlocks.CRACKED_COMPANION_BLOCK.get());
	}};

	public ChiselItem(Properties properties) {
		super(properties);
	}

	@Override
	public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
		final Level level = context.getLevel();
		final Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

		if (CHISEL_MAP.containsKey(clickedBlock)) {
			if (!level.isClientSide()) {
				level.setBlockAndUpdate(context.getClickedPos(), CHISEL_MAP.get(clickedBlock).defaultBlockState());

				context.getItemInHand().hurtAndBreak(1, (ServerLevel)level, context.getPlayer(), item -> {
					if (context.getPlayer() != null) {
						context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND);
					}
				});

				level.playSound(null, context.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
			}
		}

		return InteractionResult.SUCCESS;
	}
}
